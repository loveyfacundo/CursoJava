
/*
Ejercicio 38) Inversión de un Array:
Escribe un programa que invierta los elementos de un array dado. Por ejemplo, si el array de entrada es [1, 2, 3, 4, 5], el programa debería retornar [5, 4, 3, 2, 1].
*/
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio38 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[] arrayOrigen = new int[5];
    int[] newArray = new int[5];
    int j = 4;
    for (int i = 0; i < 5; i++) {
      System.out.println("Ingrese un número:");
      arrayOrigen[i] = leer.nextInt();
    }
    for (int numero : arrayOrigen) {
      newArray[j--] = numero;
    }
    System.out.println(Arrays.toString(arrayOrigen));
    System.out.println(Arrays.toString(newArray));
  }
}