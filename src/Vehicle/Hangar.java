package Vehicle;

public class Hangar {
    public static void main(String[] args) {
        Car peugeot = new Car("Peugeot", 200000, "308");
        Boat zodiac = new Boat("Zodiac", 1000, "Zodiac 420");

        System.out.println(peugeot.doStuff());
        System.out.println(zodiac.doStuff());
    }
}
