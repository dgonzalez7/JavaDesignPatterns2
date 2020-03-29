package adapter;

public class SuperGreenEngine 
{
private int engineSize;
    
    public SuperGreenEngine(int engineSize) {
        this.engineSize = engineSize;
    }
    
    public int getEngineSize() {
        return engineSize;
    }
    
    public String toString() {
        return "SUPER ENGINE " + engineSize;
    }
}
