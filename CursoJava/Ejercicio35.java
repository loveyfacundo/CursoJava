import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    final String codigo = "111MIL";
    boolean result = false;
    int intentos = 2;
    System.out.println("Introduce la clave: ");
    String claveIngresada = leer.nextLine();
    if (claveIngresada.equals(codigo)) {
      System.out.println("Clave correcta");
      result = true;
    }
    while (result == false && intentos > 0) {
      System.out.println("Las claves no coinciden");
      System.out.println("Intentos restantes: " + intentos--);
      System.out.println("Introduce la clave: ");
      claveIngresada = leer.nextLine();
      if (claveIngresada.equals(codigo)) {
        System.out.println("Clave correcta");
        result = true;
      }

    }
    if (intentos == 0) {
      System.out.println("Intentos agotados");
    }
  }
}
