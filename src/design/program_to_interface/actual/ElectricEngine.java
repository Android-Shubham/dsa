package design.program_to_interface.actual;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine is driving");
    }
}
