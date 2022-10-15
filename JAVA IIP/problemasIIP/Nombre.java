import java.util.Scanner;
/**
 * Write a description of class Nombre here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nombre
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca nombre, primer apellido y segundo"
            + " apellido (Separados por -)");
        String linea = teclado.nextLine();
        int pos1 = linea.indexOf('-');
        int pos2 = linea.indexOf('-', pos1 + 1);
        String nombre = ;
        String ape1 = ;
        String ape2 = ;
    }
}
