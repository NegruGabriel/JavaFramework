package OopAbrasctizareInterfete;

public class PersoanaAngajatStudent extends Persoana implements IAngajat,IStudent {
    public PersoanaAngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void mergeLaLucru() {

    }

    @Override
    public void primesteSalar() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void primesteBursa() {

    }
}
