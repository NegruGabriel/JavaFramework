package OopAbstractizareClasaAbstracta;

public class PersoanaAngajat extends PersoanaAbstracta {   private String nume;
    private String prenume;
    private Integer varsta;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public PersoanaAngajat(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    @Override
    void mergeLaLucru() {

    }

    @Override
    void primesteSalariu() {

    }

    @Override
    void mergeLaCursuri() {

    }

    @Override
    void primesteBursa() {

    }

    @Override
    void staDegeaba() {

    }

    @Override
    void primesteSomaj() {

    }
}
