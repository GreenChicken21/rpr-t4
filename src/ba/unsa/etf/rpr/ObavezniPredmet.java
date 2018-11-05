package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class ObavezniPredmet extends Predmet {

    private String imePredmeta;
    private int ECTS;
    ArrayList<Student> studentiNaPredmetu = new ArrayList<>();

    ObavezniPredmet(String ime, int ECTS){
        setImePredmeta(ime);
        setECTS(ECTS);
    }


    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    @Override
    public int getECTS() {
        return ECTS;
    }

    @Override
    public String ispisiStudenteNaPredmetu() {
        String s = "";
        for(int i = 0; i < studentiNaPredmetu.size(); i++)
            s = s + (i+1) + ". " + studentiNaPredmetu.get(i).getImePrezime() + "\n";
        return s;
    }



}
