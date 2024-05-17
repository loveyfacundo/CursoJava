
/*
40) Encontrar el Elemento Máximo:
Desarrolla una función que encuentre el elemento máximo en un array de números. Por ejemplo, para el array [10, 3, 4, 15, 7], la función debe retornar 15.
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio40 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[] array = new int[5];
    int max = array[0];
    System.out.println("Ingrese cinco valores para el array:");
    for (int i = 0; i < 5; i++) {
      array[i] = leer.nextInt();
    }
    for (int numero : array) {
      if (numero > max) {
        max = numero;
      }
    }
    System.out.println("El mayor numero del array es: " + max);
  }
}
