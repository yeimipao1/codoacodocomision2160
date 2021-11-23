
package actividad.obligatoria.pkg2docuatri;

import java.util.Scanner;

public class ActividadObligatoria2doCuatri {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    String nombre = entrada.nextLine();
    System.out.println("Ingrese su apellido");
    String apellido = entrada.nextLine();
    System.out.println("Ingrese su hobbie");
    String hobbie = entrada.nextLine();
    System.out.println("Ingrese editor de codigo preferido");
    String editor = entrada.nextLine();
    System.out.println("Ingrese su sistema operativo que utiliza");
    String sistema = entrada.nextLine();
    System.out.println("Ingrese su edad");
    int edad = entrada.nextInt();
    
    System.out.println("Bienvenid@!"+ nombre + apellido);
    System.out.println("Su edad es:" + edad);
    System.out.println("Su hobbie es:" + hobbie );
    System.out.println("Su editor de codigo preferido es :" + editor);
    System.out.println("Su sistema operativo es:" + sistema);
    
    }
    
}
