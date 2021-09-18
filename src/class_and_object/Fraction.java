package class_and_object;

public class Fraction {
    private int numerator;
    private int denomerator;

    public Fraction(int numerator, int denomerator) {
        this.numerator = numerator;
        if (denomerator == 0) {
            // TODO error out
        }
        this.denomerator = denomerator;
        simplify();
    }

    public int getDenomerator() {
        return denomerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenomerator(int denomerator) {
        if (denomerator == 0) {
            return;
        }
        this.denomerator = denomerator;
        this.simplify();
    }

    public void print() {
        if (denomerator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denomerator);
        }
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denomerator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denomerator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denomerator = denomerator / gcd;
    }
}
