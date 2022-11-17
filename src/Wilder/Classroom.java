package Wilder;

public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("David", true);
        Wilder wilder2 = new Wilder("Pauline", false);
        Wilder wilder3 = new Wilder("Maxime", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}
