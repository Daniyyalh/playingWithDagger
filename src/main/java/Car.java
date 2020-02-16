import javax.inject.Inject;

public class Car {

    @Inject Wheels wheels;
    @Inject Engine engine;
    @Inject Rims rims;

    public Car() {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", engine=" + engine +
                ", rims=" + rims +
                '}';
    }
}