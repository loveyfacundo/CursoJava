import java.util.Scanner;

public class Ejercicio34 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Introduce la cantidad de numeros que quiere sumar: ");
    int cantidad = leer.nextInt();
    int numero = 1;
    int suma = 0;
    for (int i = 1; i <= cantidad; i++) {
      suma = suma + numero;
      numero = numero + 2;
    }
    System.out.println("La suma de los impares es: " + suma);
  }
}
