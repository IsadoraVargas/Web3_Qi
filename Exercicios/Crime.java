package Exercicios;
import java.util.Scanner;
public class Crime {
  static Scanner leia = new Scanner(System.in); 

    public static void main(String[] args){
        int i = 0;
        int b = 0;

        System.out.println("Telefonou para a vítima? S = sim / N = não");
        String r1 = leia.nextLine() ;
        if(r1.equalsIgnoreCase("S")){ 
            i = i + 1; 
        }else { b = b + 1; }
        
        System.out.println("Esteve no local do crime? S = sim / N = não");
        String r2 = leia.nextLine();
        if(r2.equalsIgnoreCase("S")){
            i = i + 1;
         }else { b = b + 1; }

        System.out.println("Mora perto da vítima? S = sim / N = não");
        String r3 = leia.nextLine();
        if(r3.equalsIgnoreCase("S")){
            i = i + 1;
         }else { b = b + 1; }

        System.out.println("Devia para a vítima?  S = sim / N = não");
        String r4 = leia.nextLine();
        if(r4.equalsIgnoreCase("S")){
            i = i + 1;
         }else { b = b + 1; }
         
        System.out.println("Já trabalhou com a vítima? S = sim / N = não");
        String r5 = leia.nextLine();
        if(r5.equalsIgnoreCase("S")){
            i = i + 1;
         }else { b = b + 1; }
        
         if(i == 5 ){
             System.out.println("ASSASSINO");
         } else if(i == 4 || i == 3) {
             System.out.println("CÚMPLICE");
         }else if(i == 2) {
             System.out.println("SUSPEITO");
         }else { 
             System.out.println("INOCENTE"); }
}
}
