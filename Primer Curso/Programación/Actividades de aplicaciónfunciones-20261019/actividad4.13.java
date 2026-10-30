import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      System.out.println("Cuántos pares desea mostrar?");
      int n =  new Scanner(System.in).nextInt();
      
      muestraPares(n);
   }
   
   static void muestraPares(int cuantos) {
      for(int par=2; cuantos>0; cuantos--, par+=2) {
         System.out.println(par);
      }
   }
}
