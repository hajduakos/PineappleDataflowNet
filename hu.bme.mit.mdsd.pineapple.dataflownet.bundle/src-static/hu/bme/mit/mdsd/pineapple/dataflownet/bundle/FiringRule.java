package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

public class FiringRule <T extends Comparable<T>> extends NamedElement {

	private Comparation compType;
	private Channel<T> channel;
	private Token<T> token;
	
	public FiringRule(String name, Comparation compType, Channel<T> channel, T value) {
		super(name);
		this.compType = compType;
		this.channel = channel;
		this.token = new Token<T>(value);
	}

	public boolean evaluate(){
		switch (compType) {
			case Equal:
			{
				Token<T> channelToken =channel.get();
				boolean ok = false;
				if (channelToken != null) {
					ok = channelToken.Equal(token);
				} 
				if(!ok && channelToken != null) channel.putBack(channelToken);
				return ok;
			}
			
			case NotEqual:
			{
				Token<T> channelToken =channel.get();
				boolean ok = false;
				if (channelToken != null) {
					ok = channelToken.NotEqual(token);
				} 
				if(!ok && channelToken != null) channel.putBack(channelToken);
				return ok;
			}
				
			case Less:
			{
				Token<T> channelToken =channel.get();
				boolean ok = false;
				if (channelToken != null) {
					ok = channelToken.Less(token);
				} 
				if(!ok && channelToken != null) channel.putBack(channelToken);
				return ok;
			}
				
			case Greater:
			{
				Token<T> channelToken =channel.get();
				boolean ok = false;
				if (channelToken != null) {
					ok = channelToken.Greater(token);
				} 
				if(!ok && channelToken != null) channel.putBack(channelToken);
				return ok;
			}
				
			default:
				return false;
	
		}
	}
	
	public void fire(){
		//System.out.println("\tFiringRule [" + name + "] fires");
		channel.put(token);
	}
	
	
	public String getLabel(){
		String label = channel.getName() + " ";
		
		switch(compType){
		 case Equal: label += "="; break;
		 case Greater: label += ">"; break;
		 case Less: label += "<"; break;
		 case None: label += " "; break;
		 case NotEqual: label += "!="; break;
		}
		
		label += token.getValue().toString();
		
		return label;
	}
	
}
