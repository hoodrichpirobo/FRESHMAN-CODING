
/**
 * Write a description of class Dado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dado
{
    public static void main(String[] args) {
        int dado= (int)(Math.random()*6+1)                            ;       
        System.out.println("Se ha lanzado el dado y ha salido "+ dado);
    }
}
