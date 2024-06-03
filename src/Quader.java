public class Quader extends Koerper {
    public Quader(double a, double b, double h, IMaterial material) {
        super (material);
        this.a = a;
        this.b = b;
        this.h = h;

    }
private double a, b, h;

    public double calculateVolumen() {
        return a * b * h;
    }
}
