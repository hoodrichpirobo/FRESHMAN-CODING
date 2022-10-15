package pract4;

/**
 * Clase TimeInstant. 
 *
 * Esta clase permite representar instantes o marcas de tiempo
 * (Timestamp) con detalle de horas y minutos. Así, la clase 
 * representa un instante de tiempo o momento del día, en este
 * caso, las horas y los minutos de un día cualquiera.
 *
 * @author IIP - ETSINF - UPV 
 * @version Curso 2022-23
 */
public class TimeInstant {
    // ATRIBUTOS:
    /** 
     *  Variable entera para almacenar las horas. 
     *  Debe pertenecer al rango [0..23].
     */
    /* COMPLETAR */
    private int hours;
    /** 
     *  Variable entera para almacenar los minutos. 
     *  Debe pertenecer al rango [0..59]. 
     */
    /* COMPLETAR */    
    private int minutes;
    // CONSTRUCTORES:
    /**
     *  Crea un TimeInstant con el valor de las horas y 
     *  los minutos que recibe como argumentos,iniHours
     *  y iniMinutes, respectivamente.
     *  Precondición: 0 <= iniHours < 24, 0 <= iniMinutes < 60.
     */
   
    /* COMPLETAR */
    public TimeInstant(int iniHours, int iniMinutes){
        
    }
    /**
     * Crea un TimeInstant con el valor del instante
     * actual UTC (tiempo universal coordinado).
     */
    /* COMPLETAR */
    public TimeInstant(){
        
    }
    // CONSULTORES Y MODIFICADORES:
    
    /** Devuelve las horas del TimeInstant. */ 
    /* COMPLETAR */
    public int getHours(){
        
    }
    /** Devuelve los minutos del TimeInstant. */
    /* COMPLETAR */
    public int getMinutes(){
        
    }
    /** Actualiza las horas del TimeInstant. */ 
    /* COMPLETAR */
    public void setHours(int hh){
        
    }
    /** Actualiza los minutos del TimeInstant. */ 
    /* COMPLETAR */
    public void setMinutes(int mm){
        
    }
    // OTROS MÉTODOS:
    /** Devuelve el TimeInstant en el formato "hh:mm". */
    /* COMPLETAR */
    public String toString(){
        
    }
    /** Devuelve true sii o es un objeto de la clase
     *  TimeInstant y sus horas y minutos coinciden con
     *  los del objeto en curso this. 
     */
    /* COMPLETAR */
    public boolean equals(Object o){
        o instanceof TimeInstant;
        && this.hours == ((TimeInstant) o).hours;
        && this.minutes == ((TimeInstant) o).minutes;
    }
    /** Devuelve el número de minutos transcurridos desde las 00:00 
     *  hasta el instante representado por this.
     */
    /* COMPLETAR */
    public int toMinutes(){
        
    }
    /** Compara cronológicamente el instante del objeto en curso con 
     *  el del objeto de la clase TimeInstant referenciado por tInstant.
     *  El resultado es negativo si this es anterior a tInstant,
     *  cero si son iguales, y positivo si this es posterior a tInstant. 
     *  Se calcula como la resta entre la conversión a minutos
     *  de ambos objetos.
     */
    /* COMPLETAR */
    public int compareTo(TimeInstant tInstant){
        
    }
    // ACTIVIDAD EXTRA:
    /** Devuelve un TimeInstant a partir de la descripción 
     *  textual (String) en formato "hh:mm".
     */
    /* COMPLETAR */
    public static TimeInstant valueOf(String textInstant){
        
    }
}
