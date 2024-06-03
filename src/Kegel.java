public class Kegel extends Koerper {
    public Kegel(double r, double h, IMaterial material) {
        super (material);
        this.r = r;
        this.h = h;


    }

    private double r, h;

    public double calculateVolumen() {
        return r * r * h / 3;
    }
}
