package cars;

public class TestMyCar {
    public static void main(String[] args) {
        //RealCar myCar = new RealCar("Petrol", "Honda", "Blue");
        //RealCar myCar2 = new RealCar("Petrol", "VW", "Green");
        RealCar myCar3 = new RealCar("Diesel", "Ford", "SW1H 20T");

        //myCar.setNumberOfRegisteredCars(1);
        //myCar2.setNumberOfRegisteredCars(2);
        ModelCar myToy = new ModelCar("Clockwork");

        //System.out.println(myCar.write());
        //System.out.println(myCar2.write());
        System.out.println(myCar3.write());
        System.out.println(myToy.write());


        FamilyCar myCar = new FamilyCar("CD Player", "Petrol", "ABC 123D", "Toyota", 2, true);

        System.out.println(myCar.getMake());                
        System.out.println(myCar.getReg());
        System.out.println(myCar.getEntertainmentSystem());
        System.out.println(myCar.getNumberOfRegisteredCars());
        System.out.println(myCar.getNoCupHolders());
        System.out.println(myCar.getChildLock());


        RealCar myCar2 = new RealCar("Diesel", "BMW" ,"DEF 123G");
        RealCar myCar4 = new RealCar("Diesel", "BMW" ,"EFF 123G");

        System.out.println(myCar2.getMake());
        System.out.println(myCar2.getReg());
        System.out.println(myCar2.getNumberOfRegisteredCars());

        System.out.println(myCar.writeMakes());
    }
}

