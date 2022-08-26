package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Persoane {

    //Array, List, Hashmap
    @Test
    public void metodaTest() {
       //arrayExemplu();
       // listaExemplu();
       // obiecteHashmap();
        listaObiecteHashmap();
    }


    public void arrayExemplu() {
        String[] numePersoane = new String[4];
        numePersoane[0] = "Gabriel";
        numePersoane[1] = "Florin";
        numePersoane[2] = "Ino";
        numePersoane[3] = "George";
        for (Integer index = 0; index < numePersoane.length; index++) {
            System.out.println("Multimea este formata din " + numePersoane[index]);
        }
    }

    //lista Exemplu
    public void listaExemplu() {
        List<String> numePersoane = new ArrayList<>();
        numePersoane.add("Georgiana");
        numePersoane.add("Dina");
        numePersoane.add("Andrei");

        for (Integer index = 0; index < numePersoane.size(); index++) {
            System.out.println("Multimea este formata din " + numePersoane.get(index));
        }
    }

    public void obiecteHashmap() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("obiect","laptop");
        obiecte.put("fruct","mar");
        obiecte.put("leguma","morcov");

        for(String key: obiecte.keySet()){
            System.out.println("Cheia curenta este "+key);
            System.out.println("Valoarea curenta este "+obiecte.get(key));
        }
    }

    public  void listaObiecteHashmap(){
        List<String> numeFructe = new ArrayList<>();
        numeFructe.add("Portocala");
        numeFructe.add("Visina");
        numeFructe.add("Kiwi");

        List<String> numeLegume = new ArrayList<>();
        numeLegume.add("Cartofi");
        numeLegume.add("Ardei");
        numeLegume.add("Rosii");

        List<String> numeObiecte = new ArrayList<>();
        numeObiecte.add("Frigider");
        numeObiecte.add("Aragaz");
        numeObiecte.add("Laptop");

        HashMap<String,List<String>> multime = new HashMap<>();
        multime.put("fructe",numeFructe);
        multime.put("legume",numeLegume);
        multime.put("obiecte",numeObiecte);

        for(String key:multime.keySet()){
            System.out.println("Cheia curenta este "+key);
            System.out.println("Valoarea curenta este "+multime.get(key));
        }


    }
}