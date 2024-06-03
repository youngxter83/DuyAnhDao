public class Zylinder extends Koerper {
    public Zylinder ( double h, double r, IMaterial material) {
        super (material);
        this.h = h;
        this.r = r;

    }

    private double h, r;

    public double calculateVolumen() {
        return  h * Math.PI * Math.pow(r, 2);

    }
}
