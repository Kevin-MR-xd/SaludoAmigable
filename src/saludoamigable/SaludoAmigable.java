package saludoamigable;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner
 * Este programa despliega un saludo Hola personalizado.
 *
 */

public class SaludoAmigable {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String nombre;
        System.out.print("Introduce tu nombre: ");
        nombre = stdIn.nextLine();
        System.out.println("¡Hola " + nombre + "!");

    }

}
