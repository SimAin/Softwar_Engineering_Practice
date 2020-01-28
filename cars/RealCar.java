package cars;

public class RealCar {
    String engine;
    String make;
    String colour;

    RealCar(String petrolOrDiesel, String make, String colour) {
        engine = petrolOrDiesel;
        this.make = make;
        this.colour = colour;
    }

    String write() {
        return "Engine type: " + engine + 
            "\n Make: " + make + 
            "\n Colour: " + colour;
    }
}