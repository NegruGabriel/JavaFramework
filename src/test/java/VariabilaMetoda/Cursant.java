package VariabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    //clasa= colectie de variabile si metode
    //Intr-un fisier Java putem avea mai multe clase diferentiate prin nume(nu este un lucru bun sa avem mai multe clase intr-un fisier java)
    //Variabila = Atributul unei clase
    //Exista 2 tipuri de variabila  Global si Local
    //Variabila Globala = este vizibila peste tot in fisier.
    //Variabila Locala = este vizibila doar in locul in care ai declarato.
    //Structura Variabila Globala = Public tip variabila , nume variabila
    public String Nume;
    public String Prenume;
    public String Adresa;
    public Integer Varsta;
    public Double Intaltimea;
    public Float Greutatea;
    public Character Gen;
    public Boolean AreLiceu;

    // Metoda= actiune pe care o poate face o clasa.
    //Metodele sunt de 2 feluri: void si return
    @Test
    public void initializeazaVariabile(){
        Nume ="Ion";
        Prenume= "Vlad";
        Adresa= " Lebedei br";
        Varsta = 25;
        Intaltimea = 1.45;
        Greutatea= 65.8f;
        Gen= 'M';
        AreLiceu=Boolean.TRUE;

        System.out.print("Numele cursantului este"+ Nume + Prenume+ "el are adresa de domiciliu la"+Adresa);

    }
}
