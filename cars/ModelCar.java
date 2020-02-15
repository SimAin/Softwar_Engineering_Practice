package cars;

public class ModelCar {
    String engine;

    ModelCar(String engine) {
        this.engine = engine;
    }

    String write() {
        return "My model car is powered by  " + engine;
    }
}