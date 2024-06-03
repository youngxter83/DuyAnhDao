import java.util.ArrayList;
import java.util.List;

public class Container {
    public void addKoerper (Koerper Koerper) {
        KoerperList.add(Koerper);
    }
    public List<Koerper> KoerperList;

    public Container () {
        this.KoerperList = new ArrayList<>();
    }


    public double GesamtGewicht () {
        double GesamtGewicht = 0;
        for (Koerper k: KoerperList) {
            GesamtGewicht += k.calculateGewicht();
        }

        return  GesamtGewicht;



    }

    public double GesamtVolumen () {
        double GesamtVolumen = 0;
        for (Koerper v : KoerperList) {
            GesamtVolumen += v.calculateVolumen();
        }

        return GesamtVolumen;
    }




}
