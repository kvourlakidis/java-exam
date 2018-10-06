interface Gadget {
    void doStuff(); // implicit public access-level
}

abstract class Electronic {
    void getPower() { System.out.print("plug in "); }
}

public class Tablet extends Electronic implements Gadget {
    void doStuff() { System.out.print("show book "); } // implicit default access-level
    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}