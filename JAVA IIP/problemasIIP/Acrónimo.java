import java.util.Scanner; 

/**
 * Write a description of class Acrónimo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Acrónimo
{
    public static void main(String[]args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduzca una palabra: ");
        String primera = teclado.next();
        System.out.print("Introduzca otra palabra: ");
        String segunda = teclado.next();
        System.out.print("Introduzca otra palabra más: ");
        String tercera = teclado.next();
        
        String acronimo = primera.charAt(0) + "" + segunda.charAt(0) + "" + tercera.charAt(0);
        acronimo = acronimo.toUpperCase();
        System.out.println(acronimo);
    }
}
