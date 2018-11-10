package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private int index;
    private Studij studij;
    private

    Student(String ime, String prezime, int index, Studij studij){
        setIme(ime);
        setPrezime(prezime);
        setIndex(index);
        setStudij(studij);
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

    public String getImePrezime(){
        return this.getIme() + " " + this.getPrezime();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Studij getStudij() {
        return studij;
    }

    public void setStudij(Studij studij) {
        this.studij = studij;
    }
}
