package singleton;

public class Client 
{

	public static void main(String[] args) 
	{
		// Traditional method
		System.out.println("Using traditional singleton");
		SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();
		
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		
		// Using Enum
		System.out.println("\nUsing enum singleton");
		
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.generateNextSerial());
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.generateNextSerial());
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.generateNextSerial());
	
		// Using muliton
		System.out.println("\nUsing enum smultiton");
		
		System.out.println("next vehicle: " + SerialNumberGenerator.VEHICLE.generateNextSerial());
		System.out.println("next vehicle: " + SerialNumberGenerator.VEHICLE.generateNextSerial());
		System.out.println("next engine: " + SerialNumberGenerator.ENGINE.generateNextSerial());
		System.out.println("next vehicle: " + SerialNumberGenerator.VEHICLE.generateNextSerial());
		System.out.println("next engine: " + SerialNumberGenerator.ENGINE.generateNextSerial());
	}

}
