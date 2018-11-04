package ba.unsa.etf.rpr;

public class Predmet {

    private String imePredmeta;
    private int ects;

    Predmet(String ime, int ects){
        setImePredmeta(ime);
        setEcts(ects);
    }


    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

}
