package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

public class TypeVerifier {
	
	public static boolean canBeBoolean(String valueString) throws TypeVerificationException {
		if (!valueString.toLowerCase().equals("true") && !valueString.toLowerCase().equals("false")) throw new TypeVerificationException();
		boolean boolValue = Boolean.parseBoolean(valueString);
		return boolValue;
	}
	
	public static int canBeInteger(String valueString) throws TypeVerificationException {
		int value = 0;
		try{
			value = Integer.parseInt(valueString);
		} catch (NumberFormatException ex){
			throw new TypeVerificationException();
		}
		return value;
	}
	
	public static double canBeDouble(String valueString) throws TypeVerificationException {
		double value = 0;
		try{
			value = Double.parseDouble(valueString);
		} catch (NumberFormatException ex){
			throw new TypeVerificationException();
		}
		return value;
	}
	
}
