package OopAbrasctizareInterfete;

public class PersoanaSomer extends Persoana implements ISomer {
    public PersoanaSomer(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void staDegeaba() {
        System.out.println("Somerul sta degeaba");

    }

    @Override
    public void primesteSomaj() {
        System.out.println("Somerul primeste somaj");

    }
}
