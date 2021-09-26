package percobaan1;

public class MainP1 {

    public static void main(String[] args) {

        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        L1.info();
    }
}
