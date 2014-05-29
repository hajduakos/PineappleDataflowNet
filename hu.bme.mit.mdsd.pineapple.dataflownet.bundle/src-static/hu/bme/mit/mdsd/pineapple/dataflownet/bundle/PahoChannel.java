package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;


public class PahoChannel<T extends Comparable<T>> extends NamedElement implements MqttCallback, Channel<T> {
	private MqttClient 			client;
	private String 				brokerUrl;
	private MqttConnectOptions 	conOpt;
	private boolean 			clean;
	private final int qos = 1;
	private final String PREFIX = "p_";
	
	private List<Token<T>> fifoStorage;
	
	private Class<T> clazz;
	
	public PahoChannel(String name, String brokerUrl, String myId, String otherId, Class<T> clazz){
		super(name);
		this.clazz = clazz;
		
		myId = PREFIX + myId;
		otherId = PREFIX + otherId;
		
    	this.brokerUrl = brokerUrl;
    	this.clean 	   = true;
    	this.fifoStorage = new LinkedList<Token<T>>();
    	//This sample stores in a temporary directory... where messages temporarily
    	// stored until the message has been delivered to the server.
    	//..a real application ought to store them somewhere
    	// where they are not likely to get deleted or tampered with
    	String tmpDir = System.getProperty("java.io.tmpdir");
    	MqttDefaultFilePersistence dataStore = new MqttDefaultFilePersistence(tmpDir);
    	try {
    		// Construct the connection options object that contains connection parameters
    		// such as cleanSession and LWT
	    	conOpt = new MqttConnectOptions();
	    	conOpt.setCleanSession(clean);
    		// Construct an MQTT blocking mode client
			client = new MqttClient(this.brokerUrl,myId, dataStore);

			// Set this wrapper as the callback handler
	    	client.setCallback(this);
	    	
	    	// Connect to the MQTT server
	    	client.connect(conOpt);
	    	System.out.println("Connected to "+brokerUrl+" with client ID "+client.getClientId());
	    	
	    	// Subscribe to the requested topic
	    	// The QoS specified is the maximum level that messages will be sent to the client at.
	    	// For instance if QoS 1 is specified, any messages originally published at QoS 2 will
	    	// be downgraded to 1 when delivering to the client but messages published at 1 and 0
	    	// will be received at the same level they were published at.
	    	System.out.println("Subscribing to topic \""+otherId+"\" qos "+qos);
	    	client.subscribe(otherId, qos);

		} catch (MqttException e) {
			e.printStackTrace();
			System.out.println("Unable to set up client: "+e.toString());
			System.exit(1);
		}
	}
	
	public Token<T> get(){
		if (!fifoStorage.isEmpty()) {
			return fifoStorage.remove(0);
		}
		return null;
	}
	
	public void putBack(Token<T> value){
		fifoStorage.add(0, value);
	}
	
	public void put(Token<T> token){
		try{
		ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);
        o.writeObject(token.getValue());
		// Create and configure a message
   		MqttMessage message = new MqttMessage(b.toByteArray());
    	message.setQos(qos);

    	// Send the message to the server, control is not returned until
    	// it has been delivered to the server meeting the specified
    	// quality of service.
    	client.publish(client.getClientId(), message);
    	o.close();
    	b.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
    
    public void disconnect() throws MqttException{
    	// Disconnect the client from the server
		client.disconnect();
		System.out.println("Disconnected");
    }
	
	@Override
	public void connectionLost(Throwable cause) {
		// Called when the connection to the server has been lost.
		// An application may choose to implement reconnection
		// logic at this point. This sample simply exits.
		System.out.println("Connection to " + brokerUrl + " lost!" + cause);
		System.exit(1);
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) { }

	@Override
	public void messageArrived(String topic, MqttMessage message) throws MqttException, IOException, ClassNotFoundException  {
		// Called when a message arrives from the server that matches any
		// subscription made by the client
		ByteArrayInputStream b = new ByteArrayInputStream(message.getPayload());
		ObjectInputStream o = new ObjectInputStream(b);
		T value = (T)o.readObject();
		fifoStorage.add(0, new Token<T>(value));
		System.out.println("Channel [" + name
				+ "] received a token with value [" + value
				+ "]");
	}
	
	@Override
	public Class<T> getClazz() {
		return clazz;
	}

	@Override
	public void put(Object tokenValue) {
		
	}
}
