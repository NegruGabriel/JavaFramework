package OopAbrasctizareInterfete;

public class PersoanaStudent extends Persoana implements IStudent {
    public PersoanaStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul merge la cursuri");

    }

    @Override
    public void primesteBursa() {
        System.out.println("Studentul primeste bursa");

    }
}
