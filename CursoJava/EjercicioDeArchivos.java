
//Importaciones:
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class EjercicioDeArchivos {
  public static void main(String[] args) {
    // Creando el menú de Selección
    Scanner leer = new Scanner(System.in);
    System.out.println("Elija la opcion que desee: ");
    System.out.println("1. Crear un archivo");
    System.out.println("2. Listar un archivo");
    System.out.println("3. Salir");
    int opcion = leer.nextInt();
    // Creando como variables la dirección de destino y el nombre del archivo en el
    // caso de que quiera crear uno
    String archivoPath = "C:\\Users\\facuf\\OneDrive\\Documentos\\GitHub\\CursoJava\\Carpeta de Destino\\nuevoArchivo.txt";
    String adrresFile = "C:\\Users\\facuf\\OneDrive\\Documentos\\GitHub\\CursoJava\\Carpeta de Destino";
    File file = new File(archivoPath);
    File carpeta = new File(adrresFile);
    /*
     * Con un Switch generamos las respuestas en caso de que el usuario elija una de
     * las opciones del menú, si no es el caso, la respuesta es inválida.
     */
    switch (opcion) {
      case 1:
        // Creando el archivo
        try {
          if (file.createNewFile()) {
            System.out.println("El archivo se ha creado correctamente");
          } else {
            System.out.println("Error al crear el archivo");
          }
        } catch (IOException e) {
          System.out.println("Se produzco un error al crear el archivo");
          e.printStackTrace();
        }
        break;
      case 2:
        // Listando el archivo
        String[] lista = carpeta.list();

        if (lista != null) {
          for (String nombre : lista) {
            System.out.println(nombre);
          }
        } else {
          System.out.println("El directorio está vacío o no existe.");
        }
        break;
      case 3:
        // Saliendo del Programa
        System.out.println("Saliendo del programa...");
        break;
      default:
        /*
         * En caso de que elija una respuesta que no esté el menú, muestra en pantalla
         * "opcion inválida"
         */
        System.out.println("Opción inválida");
        break;
    }
  }
}
