package design.program_to_interface.actual;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine is driving");
    }
}
