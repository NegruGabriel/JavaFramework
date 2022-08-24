package Homework;

import org.testng.annotations.Test;

public class Homework1 {
   @Test
   public void metodaTest(){
       verificaHelloWorld();
       verificaVarstaTa(45);
       verificaNumePrenume("Vlad","Ionela");
       verificaDataDeAzi();
       verificaRezultatul();
       verificaSuma();
       verificaProdusul();
       verificaProdusul2();
       verificaLiteraLaFinal();
       verificaLiteraLaInceput();
       verificaAddVowel();

   }

   String endGreeting= " Poti pleca acasa dupa ce iti verific munca!";


    public void verificaHelloWorld(){
        System.out.println("Hello world!");
        System.out.println(endGreeting);
    }

    public void verificaVarstaTa(Integer varsta){
        System.out.println("Varsta este "+varsta+ " ani");
        System.out.println(endGreeting);
    }

    public void verificaNumePrenume(String nume, String prenume){

        System.out.println("Numele este "+nume);
       System.out.println("Prenumele este "+prenume);
        System.out.println(endGreeting);
    }

    public void verificaDataDeAzi(){
       Integer monthNumber=1;
       Integer dayNumber=13;
       Integer yearNumber=2019;
       String todayData=monthNumber+"/"+dayNumber+"/"+yearNumber;

       Double todayHour=18.3;
       String dayOfWeek1="Marti";
       String dayOfWeek2="Joi";


        System.out.println("Today day is "+todayData+" the hour "+todayHour +" PM"+ " the day"+dayOfWeek1);
        System.out.println("Today day is "+ todayData +" the hour "+todayHour +" PM"+ " the day"+dayOfWeek2);
        System.out.println(endGreeting);
    }

    public void verificaRezultatul(){
       Double rezultat=(2.0+(3*4)-3)/3;

       System.out.println( "Rezultatul corect este "+rezultat);
        System.out.println(endGreeting);

    }


    public void verificaSuma(){
        Double numar1=6.5;
        Double numar2=5.6;
        Double numar3=8.1;
        Double sum;
        sum=numar1+numar2+numar3;
        System.out.println(sum+ " Is the sum of 3 numbers");
        System.out.println(endGreeting);
    }
 public void verificaProdusul()   {
       Integer number1=8;
       Integer number2=4;
       Integer prod;
       prod=number1*number2;
     System.out.println("The product is "+prod);
     System.out.println(endGreeting);
 }
    public void verificaProdusul2()   {
        Integer number1=8;
        Integer number2=4;
        Integer prod;
        prod=number1*number2;
        System.out.println("The product is "+prod+" Stiu ca am calculat bine");
        System.out.println(endGreeting);
    }

    public void verificaLiteraLaFinal(){
       String introduction ="Salut";
       Character letter = 'M';
        System.out.println(introduction+letter);
        System.out.println(endGreeting);
    }

    public void verificaLiteraLaInceput(){
        String introduction ="Hello";
        Character letter = 'H';
        System.out.println(letter+introduction);
        System.out.println(endGreeting);
    }

// Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"

    public void  verificaAddVowel(){
        Character letter= 'Z';

        System.out.println("Ana"+letter+" are"+letter+"mere"+letter+" ,pere"+letter+" ,prune"+letter);
        System.out.println(endGreeting);

    }

}
