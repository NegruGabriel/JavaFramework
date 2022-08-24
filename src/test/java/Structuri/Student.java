package Structuri;

import org.testng.annotations.Test;

public class Student {

     @Test
     public void metodaTest(){
          //verificaNumarParPozitiv();
          //verificaNumarParPozitiv2(4);
         // verificaNumarParPozitiv2(-9);
          //verificaNumarParPozitiv2(5);
       // verificaNumarParPozitiv3(4);
        //verificaNumarParPozitiv3(7);
       // verificaNumarParPozitiv3(-2);
       // verificaNumarParPozitiv3(-5);
         verificaZiCurenta("Duminica");
     }

    //Structuri alternativa : if else , switch case ;
     public void verificaNumarParPozitiv(){
          if(6%2==0 && 6>0){
               System.out.println("Numarul este par si pozitiv");
          }
          else {
               System.out.println("Numarul este negativ");
          }
     }

    public void verificaNumarParPozitiv2(Integer numar){
        if(numar %2==0 && numar >0){
            System.out.println("Numarul este par si pozitiv");
        }
        else {
            System.out.println("Numarul este negativ");
        }
    }

    public void verificaNumarParPozitiv3(Integer numar){
        if (numar >0){
            if (numar%2==0){
                System.out.println("Numarul este par si pozitiv");
            }
            else {
                System.out.println("Numarul este impar si pozitiv");
            }
        }
        else {
            if (numar%2==0){
                System.out.println("Numarul este par si negativ");
            }
            else {
                System.out.println("Numarul este impar si negativ");
            }

        }
    }



    public void verificaZiCurenta(String ziua){
         switch (ziua){
             case "Duminica":
                 System.out.println("Astazi este Duminica");
                 break;
             case "Luni":
                 System.out.println("Astazi este Luni");
                 break;
             case "Marti":
                 System.out.println("Astazi este Marti");
                 break;
         }

    }
}
