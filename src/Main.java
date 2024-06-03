
public class Main {
    public static void main(String[] args) {
       Koerper Pyramide = new Pyramide(1, 5, Material.GOLD);
       Koerper Kegel = new Kegel(5.9,8.8, Material.Blei);
       Koerper Kugel = new Kugel(3.3,Material.plati);
       Koerper Zylinder = new Zylinder(7,2.66, Material.TITAN);
       Koerper Quader = new Quader(6,7,8, Material.silbe);

       Container container = new Container();
       container.addKoerper(Pyramide);
       container.addKoerper(Kegel);
       container.addKoerper(Kugel);
       container.addKoerper(Zylinder);
       container.addKoerper(Quader);


       System.out.println ("Gesamt Gewicht =" + container.GesamtGewicht());
       System.out.println ("Gesamt Volumen =" + container.GesamtVolumen());
    }


}
