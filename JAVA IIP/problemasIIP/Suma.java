
/**
 * Write a description of class Suma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Suma
{
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);//Escribir un programa en Java que lea de teclado un entero cualquiera
        System.out.print("Introduzca un entero: ");
        int n = teclado.nextInt();
        n =Math.abs(n);
        int sumaCifras = n%10;
        n = n / 10; sumaCifras += n % 10;
        n = n / 10; sumaCifras += n % 10;
        
        System.out.print("La suma de sus tres ultimas cifras vale "); 
        System.out.println(sumaCifras);
    }
}
