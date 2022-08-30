package OopAbstractizareClasaAbstracta;

public  abstract class PersoanaAbstracta {
    //recunoastem o clasa abstracta dupacuvantul abstract.
    //intr-o clasa abstracta putem sau nu sa avem metode abstracte
    //intr-o clasa abstracta putem sa avem un contructor rezulta nu putem sa facem un obiect
    //o clasa abstracta se mosteneste.
    //o clasa abstracta poate implementa o interfata.
    //metodele abstracte dintr-o clasa abstracta vor avea abstract in fata (cuvantul).

    abstract void mergeLaLucru();
    abstract void primesteSalariu();
    abstract void mergeLaCursuri();
    abstract void primesteBursa();
    abstract void staDegeaba();
    abstract void primesteSomaj();

    public void metodaNormala(){
        System.out.println("Aceasta e o metoda normala");
    }
}
