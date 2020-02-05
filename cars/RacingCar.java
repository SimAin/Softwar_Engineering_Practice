package cars;

public class RacingCar {
    String name;
    RacingCar(String name) {                          // <1>
            this.name = name;
    }
    RacingCar() {                                      // <2>
            this("Brabham");                           // <3>
    }
    public static void main(String args[]) {
            RacingCar car1 = new RacingCar("Ferrari"); // <4>
            RacingCar car2 = new RacingCar();          // <5>
    }
}

