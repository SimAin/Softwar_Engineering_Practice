package cars;

public class TestMyCar {
    public static void main(String[] args) {
        RealCar myCar = new RealCar("Petrol", "Honda", "Blue");
        ModelCar myToy = new ModelCar("Clockwork");
        System.out.println(myCar.write());

        System.out.println(myToy.write());
    }
}

