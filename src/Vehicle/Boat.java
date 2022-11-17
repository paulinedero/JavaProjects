package Vehicle;

public class Boat extends Vehicle {
    private String name;

    public Boat(String brand, int kilometers, String name) {
        super(brand, kilometers);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String doStuff() {
        return "Je suis " + this.name + " et je fais glou glou !";
    }
}
