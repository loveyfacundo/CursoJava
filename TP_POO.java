import java.util.ArrayList;
import java.util.Scanner;

public class TP_POO {
  class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private int dni;

    // Constructor
    public Persona(String nombre, String apellido, int dni) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.dni = dni;
    }

    // Getters
    public String getNombre() {
      return nombre;
    }

    public String getApellido() {
      return apellido;
    }

    public int getDni() {
      return dni;
    }

    // Setters
    public void setNombre(String nuevoNombre) {
      this.nombre = nuevoNombre;
    }

    public void setApellido(String nuevoApellido) {
      this.apellido = nuevoApellido;
    }

    public void setDni(int nuevoDni) {
      this.dni = nuevoDni;
    }

    // Metodos
    public void verAtributos() {
      System.out.println("Nombre: " + getNombre());
      System.out.println("Apellido: " + getApellido());
      System.out.println("DNI: " + getDni());
    }
  }

  class Empleado extends Persona {
    // Atributos de Empleados
    private double sueldo;
    private String cargo;

    // Constructor
    public Empleado(String nombre, String apellido, int dni, double sueldo, String cargo) {
      super(nombre, apellido, dni);
      this.sueldo = sueldo;
      this.cargo = cargo;
    }

    // Getters
    public double getSueldo() {
      return sueldo;
    }

    public String getCargo() {
      return cargo;
    }

    // Metodos
    public void verAtributos() {
      super.verAtributos();
      System.out.println("Sueldo: $" + getSueldo());
      System.out.println("Cargo: " + getCargo());
    }
  }

  class Estudiante extends Persona {
    // Atributos
    private int matricula;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, String apellido, int dni, int matricula, String carrera) {
      super(nombre, apellido, dni);
      this.matricula = matricula;
      this.carrera = carrera;
    }

    // Getters
    public int getMatricula() {
      return matricula;
    }

    public String getCarrera() {
      return carrera;
    }

    // Setters
    public void setMatricula(int nuevaMatricula) {
      this.matricula = nuevaMatricula;
    }

    public void setCarrera(String nuevaCarrera) {
      this.carrera = nuevaCarrera;
    }

    // Metodos
    public void verAtributos() {
      super.verAtributos();
      System.out.println("Matrícula: " + getMatricula());
      System.out.println("Carrera: " + getCarrera());
    }

  }

  class Profesor extends Persona {
    // Atributos
    private String materia;
    private int antigüedad;

    // Constructor
    public Profesor(String nombre, String apellido, int dni, String materia, int antigüedad) {
      super(nombre, apellido, dni);
      this.materia = materia;
      this.antigüedad = antigüedad;
    }

    // Getters
    public String getMateria() {
      return materia;
    }

    public int getAntigüedad() {
      return antigüedad;
    }

    // Metodos
    public void verAtributos() {
      super.verAtributos();
      System.out.println("Materia:" + getMateria());
      System.out.println("Antigüedad: " + getAntigüedad());
    }
  }

  class Comision {
    // Metodos
    public void eliminarEstudiante(ArrayList<Estudiante> Estudiantes, int dni) {
      for (Estudiante alumno : Estudiantes) {
        if (alumno.getDni() == dni) {
          Estudiantes.remove(alumno);
        }
      }
    }

    public void listarComision(ArrayList<Estudiante> Estudiantes, Profesor Docente) {
      System.out.println("Alumnos:");
      for (Estudiante alumno : Estudiantes) {
        System.out.println("Apellido y Nombre: " + alumno.getApellido() + "" + alumno.getNombre());
        System.out.println("DNI: " + alumno.getDni());
        System.out.println("Carrera: " + alumno.getCarrera());
        System.out.println("Matrícula: " + alumno.getMatricula());
      }

      System.out.println("Profesor: ");
      System.out.println("Apellido y Nombre: " + Docente.getApellido() + " " + Docente.getNombre());
      System.out.println("DNI: " + Docente.getDni());
      System.out.println("Materia: " + Docente.getMateria());
      System.out.println("Antigüedad: " + Docente.getAntigüedad());
    }

    public void altaEstudiante(ArrayList<Object> Estudiantes, Persona Persona) {
      Estudiantes.add(Persona);
    }

    public void modificarEstudiante(ArrayList<Estudiante> Estudiantes, int dni, String nombre, String apellido,
        String carrera, int matricula) {
      for (Estudiante alumno : Estudiantes) {
        if (alumno.getDni() == dni) {
          alumno.setApellido(apellido);
          alumno.setNombre(nombre);
          alumno.setCarrera(carrera);
          alumno.setMatricula(matricula);
        }
      }
    }

  }

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    ArrayList<Object> Estudiantes = new ArrayList<>();
    ArrayList<Object> Profesores = new ArrayList<>();
    ArrayList<Object> Empleados = new ArrayList<>();
    // Menu
    System.out.println("BIENVENIDO AL SISTEMA DE GESTIÓN DE PERSONAS");
    System.out.println("===============================================");
    System.out.println("Por favor, seleccione una de las siguientes opciones:");
    System.out.println("1. Crear Empleado");
    System.out.println("2. Crear Estudiante");
    System.out.println("3. Crear Profesor");
    System.out.println("4. Modificar Estudiante");
    System.out.println("5. Listar Estudiantes");

    int op = leer.nextInt();
    boolean repetir = true;
    switch (op) {
      case 1:
        // Crear Empleado
        while (repetir = true) {
          System.out.println("Ingrese el/los nombre/s del empleado:");
          String nombre = leer.next();
          System.out.println("Ingrese el apellido:");
          String apellido = leer.next();
          System.out.println("Ingrese el DNI:");
          int dni = leer.nextInt();
          System.out.println("Ingrese el sueldo:");
          double sueldo = leer.nextDouble();
          System.out.println("Ingrese el cargo:");
          String cargo = leer.next();

          Empleado newEmpleado = new Empleado(nombre, apellido, dni, sueldo, cargo);
          newEmpleado.verAtributos();
          Empleados.add(newEmpleado);
          System.out.println("¿Quiere añadir otro empleado más? 1. Si  2.No");
          int op2 = leer.nextInt();
          if (op2 == 2) {
            repetir = false;
          }
        }
        break;

      case 2:
        // Crear Estudiante
        while (repetir = true) {
          System.out.println("Ingrese el/los nombre/s del estudiante:");
          String nombre = leer.next();
          System.out.println("Ingrese el apellido:");
          String apellido = leer.next();
          System.out.println("Ingrese el DNI:");
          int dni = leer.nextInt();
          System.out.println("Ingrese el Matrícula:");
          int matricula = leer.nextInt();
          System.out.println("Ingrese la Carrera:");
          String carrera = leer.next();

          Estudiante newEstudiante = new Estudiante(nombre, apellido, dni, matricula, carrera);
          newEstudiante.verAtributos();
          Estudiantes.add(newEstudiante);
          System.out.println("¿Quiere añadir otro estudiante más? 1. Si  2.No");
          int op2 = leer.nextInt();
          if (op2 == 2) {
            repetir = false;
          }
        }
        break;

      case 3:
        // Crear Profesor
        while (repetir = true) {
          System.out.println("Ingrese el/los nombre/s del profesor:");
          String nombre = leer.next();
          System.out.println("Ingrese el apellido:");
          String apellido = leer.next();
          System.out.println("Ingrese el DNI:");
          int dni = leer.nextInt();
          System.out.println("Ingrese el Matrícula:");
          int antigüedad = leer.nextInt();
          System.out.println("Ingrese la Carrera:");
          String materia = leer.next();

          Profesor newProfesor = new Profesor(nombre, apellido, dni, materia, antigüedad);
          newProfesor.verAtributos();
          Profesores.add(newProfesor);
          System.out.println("¿Quiere añadir otro profesor más? 1. Si  2.No");
          int op2 = leer.nextInt();
          if (op2 == 2) {
            repetir = false;
          }
        }
        break;
    }
  }
}
