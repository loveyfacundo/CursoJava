import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese los kilometros a recorrer");
    int km = leer.nextInt();
    int precio = 45;
    System.out.println("El precio total a pagar es: $" + (km * precio));
  }
}
