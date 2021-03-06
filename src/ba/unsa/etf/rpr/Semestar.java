package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {

    private String imeSemestra;
    private ArrayList<Predmet> predmet = new ArrayList<>();
    int ECTS;
    Semestar(String ime, ArrayList<Predmet> predmeti){
        setImeSemestra(ime);
        setPredmet(predmeti);
        for(int i = 0; i < predmeti.size(); i++)
            ECTS += predmeti.get(i).getECTS();
    }

    public String getImeSemestra() {
        return imeSemestra;
    }

    public void setImeSemestra(String imeSemestra) {
        this.imeSemestra = imeSemestra;
    }

    public Predmet getPredmetByIndex(int i) {
        return predmet.get(i);
    }

    public void setPredmet(ArrayList<Predmet> predmet) {
        this.predmet = predmet;
    }

    public ArrayList<Predmet> getPredmet() {
        return predmet;
    }

    public void addIzborni(Predmet izborni){
        if(ECTS >= 30) {
            System.out.println("Nema potreba da dodajes nove predmete imas vec " + ECTS + "  ECTS bodova.");
            return;
        }
        predmet.add(izborni);
    }


}
