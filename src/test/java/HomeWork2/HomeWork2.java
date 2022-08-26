package HomeWork2;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeWork2 {
    @Test
    public void metodaTest() {
       retetaIngredienteCiorbaTaraneascaHashmap();
       retetaIngredientePrajituraCuFructeHashMap();
       retetaGuliiUmpluteCuCarne();

    }

    public  void retetaIngredienteCiorbaTaraneascaHashmap(){
        List<String> numeCarne = new ArrayList<>();
        numeCarne.add("vaca");
        numeCarne.add("porc");

        List<String> numeLegume = new ArrayList<>();
        numeLegume.add("morcov");
        numeLegume.add("telina");
        numeLegume.add("ceapa");
        numeLegume.add("ardei gras");
        numeLegume.add("rosii");
        numeLegume.add("cartofi");
        numeLegume.add("mazare");
        numeLegume.add("pastai fasole");

        List<String> numeVerdeata = new ArrayList<>();
        numeVerdeata.add("marar");
        numeVerdeata.add("patrunjel");
        numeVerdeata.add("leustean");
        numeVerdeata.add("leurda");
        numeVerdeata.add("ustroi verde");
        numeVerdeata.add("loboda");

        List<String> numeCondimente = new ArrayList<>();
        numeCondimente.add("sare");
        numeCondimente.add("piper mozaic");
        numeCondimente.add("busuioc");
        numeCondimente.add("ardei iute");
        numeCondimente.add("coriandru");

        List<String> numeLichide = new ArrayList<>();
        numeLichide.add("apa");
        numeLichide.add("bors");
        numeLichide.add("suc de rosii");

        HashMap<String,List<String>> ingrediente = new HashMap<>();
        ingrediente.put("carne",numeCarne);
        ingrediente.put("legume",numeLegume);
        ingrediente.put("verdeata",numeVerdeata);
        ingrediente.put("condimente",numeCondimente);
        ingrediente.put("lichide",numeLichide);

        for(String key:ingrediente.keySet()){
            System.out.println("Cheia curenta este "+key);
            System.out.println("Valoarea curenta este "+ingrediente.get(key));
        }


    }

    public void retetaIngredientePrajituraCuFructeHashMap(){
        List<String> numeOua  = new ArrayList<>();
        numeOua.add("OuaGaina");

        List<String>numeUleioase =new ArrayList<>();
        numeUleioase.add("unt");

        List<String> numeZahar= new ArrayList<>();
        numeZahar.add("zahar tos");
        numeZahar.add("zahar brun");
        numeZahar.add("zahar vanilinat");

        List<String> numeFainoase = new ArrayList<>();
        numeFainoase.add("faina alba");
        numeFainoase.add("praf de copt");
        numeFainoase.add("pesment");

        List<String> numeEsente = new ArrayList<>();
        numeEsente.add("esenta Rom");

        List<String> numeCondimente = new ArrayList<>();
        numeCondimente.add("scortisoara");
        numeCondimente.add("sare");

        List<String> numeFructe = new ArrayList<>();
        numeFructe.add("caise");
        numeFructe.add("visine");

        HashMap<String,List<String>> ingredients = new HashMap<>();
        ingredients.put("oua",numeOua);
        ingredients.put("ulei",numeUleioase);
        ingredients.put("zahar",numeZahar);
        ingredients.put("fainoase",numeFainoase);
        ingredients.put("esente",numeEsente);
        ingredients.put("condimente",numeCondimente);
        ingredients.put("fructe",numeFructe);

        for(String key:ingredients.keySet()){
            System.out.println("Cheia curenta este "+key);
            System.out.println("Valoarea curenta este "+ingredients.get(key));
        }
    }

    public  void retetaGuliiUmpluteCuCarne(){
        List<String> numeCondimente = new ArrayList<>();
        numeCondimente.add("sare");
        numeCondimente.add("boia");
        numeCondimente.add("piper");

        List<String> numeLichide = new ArrayList<>();
        numeLichide.add("otet");
        numeLichide.add("zeama de lamaie");
        numeLichide.add("apa");

        List<String> numeVerdeata = new ArrayList<>();
        numeVerdeata.add("marar");

        List<String> numeFainoase = new ArrayList<>();
        numeFainoase.add("faina alba");

        List<String> numeSmantana = new ArrayList<>();
        numeSmantana.add("Laptaria cu Caimac");

        List<String> numeCarne = new ArrayList<>();
        numeCarne.add("carne slaba de vitel");
        numeCarne.add("piept de pui");

        List<String> numeLegume =new ArrayList<>();
        numeLegume.add("gulii");
        numeLegume.add("ceapa");
        numeLegume.add("orez");

        HashMap<String,List<String>> ingrediente = new HashMap<>();
        ingrediente.put("condimente",numeCondimente);
        ingrediente.put("lichide",numeLichide);
        ingrediente.put("verdeata",numeVerdeata);
        ingrediente.put("fainoase",numeFainoase);
        ingrediente.put("smantana",numeSmantana);
        ingrediente.put("carne",numeCarne);
        ingrediente.put("legume",numeLegume);

        for (String key:ingrediente.keySet()){
            System.out.println("Cheia currenta este "+key);
            System.out.println("Valoarea currenta este "+ingrediente.get(key));
        }




    }
}
