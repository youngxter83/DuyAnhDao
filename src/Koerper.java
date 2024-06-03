public abstract class Koerper {
    public abstract double calculateVolumen();
    protected IMaterial material;
    public double calculateGewicht() {
        return material.getDichte() * calculateVolumen();

    }

    public Koerper (IMaterial Material) {
        this.material = Material;
    }


}
