public class Kugel extends Koerper  {
    public Kugel(double r,  IMaterial material) {
        super (material);
        this.r = r;
    }

    private double r;

    public double calculateVolumen() {
        return  4 * Math.PI * r * r * r  / 3;
    }
}
