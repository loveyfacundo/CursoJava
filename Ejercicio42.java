
/*
42) Rotación de Arrays:
Escribe un programa que rote los elementos de un array hacia la derecha n veces. Por ejemplo, si el array es [1, 2, 3, 4, 5] y n = 2, el resultado debe ser [4, 5, 1, 2, 3].
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio42 {
  public static ArrayList<Integer> rotarArray(ArrayList<Integer> array, int n) {
    Collections.rotate(array, n);
    return array;
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<Integer>();
    Scanner leer = new Scanner(System.in);
    array.add(1);
    array.add(2);
    array.add(3);
    array.add(4);
    array.add(5);
    System.out.println("Ingrese el numero de la cantidad de veces que quiere que roten lo elementos del array: ");
    int n = leer.nextInt();
    System.out.println("El array original es: " + array);
    ArrayList arrayRotado = rotarArray(array, n);
    System.out.println(arrayRotado);
  }
}
