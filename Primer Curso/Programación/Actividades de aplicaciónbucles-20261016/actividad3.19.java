import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      System.out.println("Escriba un número para calcular su raiz cuadrada:");
      int n = new Scanner(System.in).nextInt();

      int aproximacion = 0;

      do {
         aproximacion++;
      } while (Math.pow(aproximacion, 2) <= n);

      aproximacion --;
      
      System.out.println("Raiz cuadrada: " + aproximacion);
      System.out.println("Resto: " + (n - Math.pow(aproximacion, 2)));
   }
}
