package pract2;


/**
 * Write a description of class TestProgramII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestProgramII
{
    public static void main (String[]args) {
        Blackboard miPizarraII = new Blackboard("Que más pues",250,250);
        Circle circleII=new Circle(50,"yellow",50,50);
        miPizarraII.add(circleII);
        Rectangle recnangulo=new Rectangle(30,20,"blue",100,100);
        miPizarraII.add(recnangulo);
        TrIsosceles tri2= new TrIsosceles(45,20,"red",150,150);
        miPizarraII.add(tri2);
    }
}
