import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el presupuesto que dispone en el año");
    int presupuesto = leer.nextInt();
    System.out.println("El presupuesto anual para el área Urgencias es de: $" + (presupuesto * 0.37));
    System.out.println("El presupuesto anual para el área Pediatría es de: $" + (presupuesto * 0.42));
    System.out.println("El presupuesto anual para el área Traumatología es de: $" + (presupuesto * 0.21));

  }
}
