package design.program_to_interface.typical;

public class Car {
    private final Engine engine;
    public Car(){
        engine = new Engine();
    }
    public void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}
