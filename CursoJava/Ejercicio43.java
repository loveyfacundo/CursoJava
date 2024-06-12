
/*
 * 43) Suma de Subarrays:
Diseña una función que tome un array de números y devuelva un nuevo array donde cada elemento es la suma de los elementos hasta esa posición en el array original. Por ejemplo, para el array [1, 2, 3, 4], el resultado sería [1, 3, 6, 10].
 */
import java.util.Scanner;

public class Ejercicio43 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int array[] = new int[5];
    // Llenando el array
    System.out.println("Ingrese cinco valores para el array: ");
    for (int i = 0; i < 5; i++) {
      array[i] = leer.nextInt();
    }
    // Imprimiendo el array
    for (int numero : array) {
      System.out.print(numero + ", ");
    }
    System.out.println("");
    int acumulador = 0;
    int newArray[] = new int[5];
    int i = 0;
    for (int numero : array) {
      acumulador = acumulador + numero;
      newArray[i] = acumulador;
      i++;
    }
    // Imprimiendo el segundo array
    for (int numero : newArray) {
      System.out.print(numero + ", ");
    }

  }
}
