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
  
    /**
     * @return the entertainmentSystem
     */
    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    /**
     * @return the noCupHolders
     */
    public int getNoCupHolders() {
        return noCupHolders;
    }

    /**
     * @return the childLock
     */
    public boolean getChildLock() {
        return childLock;
    }
  }
  
  