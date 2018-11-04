package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private int ECTS;

    Student(String ime, String prezime){
        setIme(ime);
        setPrezime(prezime);
        setECTS(0);
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }
}
