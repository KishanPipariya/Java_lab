package Unit2;

public class overiding {
    public static void main(String[] args)
    {
        Quadrilateral a1=new Quadrilateral();
        a1.getInfo();
        Quadrilateral a2=new Parallelogram();
        a2.getInfo();
        Quadrilateral a3=new Rhombus();
        a3.getInfo();
        Quadrilateral a4=new Square();
        a4.getInfo();
    }
}
class Quadrilateral
{
    void getInfo()
    {
        System.out.println("No. of sides in a Quadrilateral is:4");
    }
}
class Parallelogram extends Quadrilateral
{
    void getInfo()
    {
        System.out.println("No. of sides in a Parallelogram is:4");
        System.out.println("Opposite sides in a Parallelogram has same length");
    }
}
class Rhombus extends Quadrilateral
{
    void getInfo()
    {
        System.out.println("No. of sides in a Rhombus is:4");
        System.out.println("All sides in a Rhombus have same length");
    }
}
class Square extends Quadrilateral
{
    void getInfo()
    {
        System.out.println("No. of sides in a Square is:4");
        System.out.println("All sides in a Square have same length");
        System.out.println("All angles in Square measure same ie.90 degrees");
    }
}