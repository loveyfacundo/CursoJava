
/*
 * 41) Filtrado de Array:
Implementa una función que elimine todos los elementos inferiores a 0. 
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio41 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[] array = new int[5];
    System.out.println("Ingrese cinco valores para el array: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = leer.nextInt();
    }
    int newArray[] = new int[array.length];
    int i = 0;
    for (int numero : array) {
      if (numero >= 0) {
        newArray[i] = numero;
        i++;
      } else {
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
      }
    }
    System.out.println(Arrays.toString(newArray));
  }

}