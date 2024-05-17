import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la  cantidad de horas trabajadas durante el mes:");
    int horasTrabajadas = leer.nextInt();
    System.out.println("Ingrese el sueldo por hora");
    double sueldoPorHora = leer.nextDouble();
    double sueldoTotal = horasTrabajadas * sueldoPorHora;
    if (horasTrabajadas > 120) {
      int horasExtras = horasTrabajadas - 120;
      sueldoTotal = sueldoTotal + (horasExtras * (sueldoPorHora * 2));
      System.out.println("Por trabajar " + horasExtras + " horas extras, se le duplica la paga por hora");
    }
    System.out.println("Sueldo total: " + sueldoTotal);
  }

}
