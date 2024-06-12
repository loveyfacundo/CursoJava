import java.util.ArrayList;

/*
45) Mezcla de Arrays:
Escribe una función que combine dos arrays de entrada intercalando sus elementos.
Por ejemplo, dados los arrays [a, b, c] y [1, 2, 3], el resultado debería ser [a, 1, b, 2, c, 3].
*/
public class Ejercicio45 {
  //Función que hace la mezcla de los arrays
  public static ArrayList<Object> mezclarArrays(Object[] array1, Object[] array2) {
    ArrayList<Object> resultado = new ArrayList<>(); // Creamos un nuevo ArrayList para almacenar el resultado
    int longitudMinima = Math.min(array1.length, array2.length); // Determinamos la longitud mínima de los dos arrays

    // Iteramos hasta la longitud mínima de los dos arrays
    for (int i = 0; i < longitudMinima; i++) {
      resultado.add(array1[i]); // Agregamos el elemento del primer array al resultado
      resultado.add(array2[i]); // Agregamos el elemento del segundo array al resultado
    }
    return resultado;
  }

  public static void main(String[] args){
    Object[] array1 = { 'a', 'b', 'c' }; // Primer array
    Object[] array2 = { 1, 2, 3 }; // Segundo array

    System.out.println("Array 1: " + java.util.Arrays.toString(array1)); // Imprimimos el primer array
    System.out.println("Array 2: " + java.util.Arrays.toString(array2)); // Imprimimos el segundo array

    ArrayList<Object> resultado = mezclarArrays(array1, array2); // Mezclamos los dos arrays llamando al método
    // mezclarArrays

    System.out.println("Resultado de la mezcla: " + resultado); // Imprimimos el resultado



  }
}
