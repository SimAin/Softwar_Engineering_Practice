package cars;

public class FamilyCar extends RealCar {
    private String entertainmentSystem;
    private int noCupHolders;
    private boolean childLock;
  
    public FamilyCar(String entertainmentSystem,
                     String engine,
                     String registrationNumber,
                     String make, 
                     int noCupHolders, 
                     boolean childLock) {
      super(engine, make, registrationNumber);       
      this.entertainmentSystem = entertainmentSystem;
      this.noCupHolders = noCupHolders;
      this.childLock = childLock;
    }
  
    // get entertainmentSystem 
    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    // get noCupHolders 
    public int getNoCupHolders() {
        return noCupHolders;
    }

    // get childLock 
    public boolean getChildLock() {
        return childLock;
    }
  }
  
  