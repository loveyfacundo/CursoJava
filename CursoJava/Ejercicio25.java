import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Introduce dos número entre el 1 y el 9");
    int num = leer.nextInt();
    if (num > 0 && num < 10) {
      for (int i = 1; i < 10; i++) {
        System.out.println(num + " * " + i + " = " + num * i);

      }
    } else {
      System.out.println("El numero ingresado es menor a 1 o mayor a 9");
    }

  }
}
