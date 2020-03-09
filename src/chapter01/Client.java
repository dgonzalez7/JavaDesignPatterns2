package chapter01;

public class Client 
{

    public static void main(String[] args) 
    {
        // Sample engines...
        Engine engine1 = new StandardEngine(1300);
        Engine engine2 = new TurboEngine(2000);
        
        System.out.println(engine1);
        System.out.println(engine2);
        
        // Sample vehicles...
        Vehicle car = new Saloon(engine1, Vehicle.Color.RED);
        Vehicle van = new BoxVan(engine2, Vehicle.Color.WHITE);
        
        System.out.println(car);
        System.out.println(van);
	    }
}
