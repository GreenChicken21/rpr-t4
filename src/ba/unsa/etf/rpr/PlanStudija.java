package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class PlanStudija {
    private String nazivStudija;
    private ArrayList<Predmet> predmeti = new ArrayList<>();

    PlanStudija(String nazivStudija, ArrayList<Predmet> predmeti){
        setNazivStudija(nazivStudija);
        setPredmeti(predmeti);
    }
    public String getNazivStudija() {
        return nazivStudija;
    }

    public void setNazivStudija(String nazivStudija) {
        this.nazivStudija = nazivStudija;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
    
}
