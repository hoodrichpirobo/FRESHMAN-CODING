
/**
 * Write a description of class Cambio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; //importa lo necesario
import java.util.Locale;
public class Cambio
{
    public static void main(String args[]) {
        final double PTSXEURO= 166.386;// constante de valor de pesetas
        Scanner teclado = new Scanner(System.in) .useLocale(Locale.US);
        System.out.print("Escriba la cantidad de euros: ");
        double euros = teclado.nextDouble(); //pide euros
        double pts = euros * PTSXEURO; // sin redondear
        System.out.println(pts + " pesetas.");
    }
}
