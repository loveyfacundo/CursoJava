import java.util.ArrayList;
import java.util.Scanner;
public class ModeloDeParcial {
  public static void mostrarMenu (){
    System.out.println("==================================");
    System.out.println("GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES");
    System.out.println("==================================");
    System.out.println("1. Agregar vehículo");
    System.out.println("2. Buscar vehículo");
    System.out.println("3. Eliminar vehículo");
    System.out.println("4. Listar vehículos");
    System.out.println("5. Ordenar vehículos alfabéticamente");
    System.out.println("6. Editar vehículo por índice");
    System.out.println("7. Salir");
    System.out.println("==================================");
    System.out.println("Por favor, ingrese el numero de la opción que desea realizar: ");
  }
  public static boolean buscarAuto(ArrayList list, String autoABuscar){
    for(Object auto : list){
      if(auto.equals(autoABuscar)){
        return true;
      } else{
        return false;
      }
    }
  }
  public static String eliminarAuto (ArrayList list, String autoAEliminar){
    String mensaje = new String();
    list.removeIf(auto -> auto.equals(autoAEliminar));
    if(list.removeIf(auto -> auto.equals(autoAEliminar)) == true){
      mensaje = "Auto eliminado correctamente";
    } else {
      mensaje = "Hubo un problema en la eliminación";
    }
    return mensaje;
  }
  public static ArrayList ListarVehiculos (ArrayList list){
    
  }

  public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    ArrayList<String> ListaVehiculos = new ArrayList<>();
    do{
      mostrarMenu();
      int opcion = leer.nextInt();
      switch(opcion){
        case 1:
          System.out.println("Ingrese el modelo y marca del vehiculo: ");
          ListaVehiculos.add(leer.nextLine());
          break;
        case 2:
          System.out.println("Ingrese el modelo y marca del vehiculo que desea buscar: ");
          String AutoDeseado = leer.nextLine();
          buscarAuto(ListaVehiculos, AutoDeseado);
          break;
        case 3:
          System.out.println("Ingrese el modelo y marca del vehiculo que desea buscar: ");
          String autoAEliminar = leer.nextLine();
          String mensaje = eliminarAuto(ListaVehiculos, autoAEliminar);
          System.out.println(mensaje);
      }

    }
  }
}
