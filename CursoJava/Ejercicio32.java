import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    final int codigo = 1024;
    final int contraseña = 4567;
    boolean result = false;
    int intentos = 5;
    System.out.println("Introduce el codigo: ");
    int codigoIngresado = leer.nextInt();
    System.out.println("Introduce la contraseña: ");
    int contraseñaIngresada = leer.nextInt();
    if (codigoIngresado != codigo && contraseñaIngresada != contraseña) {
      result = false;
      while (result == false && intentos > 0) {
        System.out.println("El codigo y/o la contraseña no coinciden");
        System.out.println("Intentos restantes: " + intentos--);
        System.out.println("Introduce el codigo: ");
        codigoIngresado = leer.nextInt();
        System.out.println("Introduce la contraseña: ");
        contraseñaIngresada = leer.nextInt();
      }
    }
  }

}
