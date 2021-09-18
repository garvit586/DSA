package class_and_object;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(20,30);
        f1.print();

        f1.setNumerator(10);
        f1.setDenomerator(30);
        f1.print();
    }
}
