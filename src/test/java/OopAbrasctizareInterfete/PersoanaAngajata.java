package OopAbrasctizareInterfete;

public class PersoanaAngajata extends Persoana implements IAngajat {

    public PersoanaAngajata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void mergeLaLucru() {
        System.out.println("Angajatul merge la lucru ");

    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul primeste salariu ");

    }
}
