package cars;

public class RealCar {
    public static int numberOfRegisteredCars = 0;

    private final String make; 
    private final String reg;

    String engine;
    String colour;

    RealCar(final String petrolOrDiesel, final String make, final String colour, String reg) {
        this.engine = petrolOrDiesel;
        this.make = make;
        this.colour = colour;
        this.reg = reg;

        numberOfRegisteredCars ++;
    }

    RealCar(final String petrolOrDiesel, final String make, String reg) {
        this.engine = petrolOrDiesel;
        this.make = make;
        this.reg = reg;
        this.colour = "Black";

        numberOfRegisteredCars ++;
    }

    String write() {
        return "Engine type: " + engine + "\n Make: " + make + "\n Colour: " + colour + "\n Reg Cars: "
                + numberOfRegisteredCars;
    }

    /**
     * @return the numberOfRegisteredCars
     */
    public int getNumberOfRegisteredCars() {
        return numberOfRegisteredCars;
    }

    /**
     * set the numberOfRegisteredCars
     */
    void setNumberOfRegisteredCars(final int count) {
        RealCar.numberOfRegisteredCars = count;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * set the colour
     */
    public void setColour(final String colour) {
        this.colour = colour;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @return the engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}