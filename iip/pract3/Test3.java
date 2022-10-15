package pract3;

import java.util.Scanner;

/**
 *  Clase Test3.
 *  Una primera clase con lectura de datos desde teclado, 
 *  y uso de operaciones con int, long, Math y String.
 *  Contiene tres errores de compilacion.
 *  @author IIP 
 *  @version Curso 2022-23
 */
 
public class Test3{ 
    public static void main(String[] args){
        Scanner kbd=new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = kbd.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = kbd.nextInt();
        String hora = "0" + h;
        String minutos = "0" + m;
        String hora2 = hora.substring(hora.length()-2);
        String minutos2 = minutos.substring(minutos.length()-2);
    
        System.out.println("Hora introducida: "+ hora2 + ":" + minutos2);
        
        long tMinTotal = System.currentTimeMillis() / (60*1000);
        int tMinCurrent = (int) (tMinTotal % (24 * 60));
        int hours = tMinCurrent / 60;
        int minutes = tMinCurrent % 60;
        System.out.println("Hora actual: "+ hours + ":" + minutes + "(tiempo UTC)");
        
        int difMinHora = Math.abs((h-hours)*60);
        int difHoraMin = Math.abs(m-minutes);
        System.out.println("La diferencia en minutos entre ambas horas: " +(difMinHora+difHoraMin));
    }    
}
