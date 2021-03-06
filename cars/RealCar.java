package cars;

import java.util.ArrayList;

public class RealCar {
    public static int numberOfRegisteredCars = 0;
    public static int numberOfCarMakes = 0;
    public static ArrayList<Make> CarMakes = new ArrayList<Make>();

    private final String make;  
    private final String reg;

    String engine;
    String colour;

    RealCar(final String petrolOrDiesel, final String make, final String colour, String reg) {
        
        //Neither reg or make can be sest to null. 
        try{
            this.reg = reg; 
            this.make = make;
        } catch (NullPointerException ex) {
            throw ex;
        }
        
        this.engine = petrolOrDiesel;
        this.colour = colour;

        numberOfRegisteredCars ++;
        auditCarMakes(make);
    }

    RealCar(final String petrolOrDiesel, final String make, String reg) {
        this.engine = petrolOrDiesel;
        this.make = make;
        this.reg = reg;
        this.colour = "Black";

        numberOfRegisteredCars ++;
        auditCarMakes(make);
    }

    String write() {
        return "Engine type: " + engine + "\n Make: " + make + "\n Colour: " + colour + "\n Reg Cars: "
                + numberOfRegisteredCars;
    }

    String writeMakes() {
        String o = "";
        for (Make m : CarMakes) {
            o = o + "\n Make: " + m.make + " Count: " + m.count + ", ";
        }
        return o;
    }

    private void auditCarMakes(String make) {
        boolean found = false;
        if(CarMakes.size()<1){
            CarMakes.add(new Make(make));
        } else {
            for (Make m : CarMakes) {
                if (m.make == make) {
                    found = true;
                    m.count++;
                }
            }
            if (!found) {
                CarMakes.add(new Make(make));
            }
        }
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