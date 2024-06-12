import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la distancia del viaje");
    int distancia = leer.nextInt();
    double precioPorKM = 10.50;
    double precioTotal = distancia * precioPorKM;
    System.out.println("El precio total a pagar es: $" + precioTotal);
  }

}
