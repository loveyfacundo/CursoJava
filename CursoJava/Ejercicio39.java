
/*
39) Concatenación de Arrays:
Crea una función que tome dos arrays como argumentos y retorne un nuevo array que sea la concatenación de los dos arrays de entrada. Por ejemplo, concatenar [1, 2, 3] y [4, 5, 6] debería dar como resultado [1, 2, 3, 4, 5, 6].
*/
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio39 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[] arrayUno = new int[3];
    int[] arrayDos = new int[3];
    int[] arrayConcatenado = new int[arrayUno.length + arrayDos.length];
    System.out.println("Ingrese los valores del primer array");
    for (int i = 0; i < 3; i++) {
      arrayUno[i] = leer.nextInt();
    }
    System.out.println("Ingrese los valores del segundo array");
    for (int i = 0; i < 3; i++) {
      arrayDos[i] = leer.nextInt();
    }
    arrayConcatenado = Arrays.copyOf(arrayUno, arrayUno.length + arrayDos.length);
    System.arraycopy(arrayDos, 0, arrayConcatenado, arrayUno.length, arrayDos.length);
    System.out.println(Arrays.toString(arrayConcatenado));
  }
}
