import java.util.ArrayList;

/*
*44) Eliminación de Duplicados:
Desarrolla un programa que elimine todos los elementos duplicados de un array. Utiliza un método que optimice la búsqueda
de duplicados sin usar funciones predefinidas como Set.
*/
public class Ejercicio44 {
    public static void main(String[] args){
        ArrayList<String> conjuntoDePalabras = new ArrayList<>();
        conjuntoDePalabras.add("Facundo");
        conjuntoDePalabras.add("Facundo");
        conjuntoDePalabras.add("Facundo");
        conjuntoDePalabras.add("Lovey");
        conjuntoDePalabras.add("Alfredo");
        conjuntoDePalabras.add("Facundo");
        ArrayList<String> conjuntoDePalabrasUnicas = new ArrayList<>();
        conjuntoDePalabras.removeIf(x-> {
          if (conjuntoDePalabrasUnicas.contains(x)) {
            return true;
          }else {
            conjuntoDePalabrasUnicas.add(x);
            return false;
          }
        });

        System.out.println(conjuntoDePalabras);

    }
}
