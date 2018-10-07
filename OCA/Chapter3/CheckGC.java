import java.util.Date;

public class CheckGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " + rt.totalMemory());
        System.out.println("Before memory: " + rt.freeMemory());

        Date d = null;
        for (int i=0; i < 10_000; i++) {
            d = new Date();
            d = null;
        }
	try { Thread.sleep(1000); }
	catch (InterruptedException ex) { }
        System.out.println("After memory: " + rt.freeMemory());
        rt.gc(); // request garbage collection run
        System.out.println("After GC memory: " + rt.freeMemory());
    }
}
