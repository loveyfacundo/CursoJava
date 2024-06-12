import java.util.Scanner;

public class Ejercicio30 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int num = leer.nextInt();
    boolean esPrimo = true;
    if (num <= 1) {
      esPrimo = false;
    } else {
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          esPrimo = false;
          break;
        } else {
          esPrimo = true;
        }
      }
    }
    if (esPrimo == true || num == 2) {
      System.out.println(num + " es primo");
    } else {
      System.out.println(num + " no es primo");
    }
  }
}
