package design.program_to_interface.actual;

public class Bmw {
    public static void main(String[] args) {
        ElectricEngine engine = new ElectricEngine();
        Car car = new Car(engine);
        car.drive();
    }
}
