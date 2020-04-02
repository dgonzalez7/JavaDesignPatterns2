package strategy;

import chapter01.*;

public class Sport extends AbstractCar
{
    public Sport(Engine engine) {
        this(engine, Vehicle.Color.UNPAINTED);
    }
    
    public Sport(Engine engine, Vehicle.Color color) {
        super(engine, color);
    }
}
