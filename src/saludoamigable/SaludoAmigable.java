package saludoamigable;
import java.util.Scanner;

/**
 *
 * @author El Chistes (Kevin MR
 *
 * Scanner
 * Este programa despliega un saludo Hola personalizado.
 *
 */

public class SaludoAmigable {
    Scanner stdIn = new Scanner(System.in);
    static String nombre;
    public void Salude(String nombre){
        System.out.print("Introduce tu nombre: ");
        nombre = stdIn.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

    public static void main(String[] args) {
        SaludoAmigable salude = new SaludoAmigable();
        salude. Salude(nombre);
    }

}
