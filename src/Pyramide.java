public class Pyramide extends Koerper {
    public Pyramide(double a , double h, IMaterial material) {
        super (material);
        this.a = a;
        this.h = h;


    }


        private double a, h;

    @Override
    public double calculateVolumen() {
        return a * a *h / 3  ;
    }
}
