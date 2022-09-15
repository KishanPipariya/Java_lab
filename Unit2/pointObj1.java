import java.lang.Math;
class point{
    
    double x, y, z;

    point(){
        x=0;
        y=0;
        z=0;
        System.out.println("Default constructor");
    }

    point(double x1, double y1, double z1){
        x=x1;
        y=y1;
        z=z1;
        System.out.println("Second constructor");
    }

    point(point p){
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }



    void setData(double x1, double y1, double z1)
    {
        x=x1;
        y=y1;
        z=z1;
    }

    void printData()
    {
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
    }

    void distance()
    {
        System.out.println("Distance:" + Math.sqrt(x*x + y*y + z*z));
    }

    void translate(double x1, double y1, double z1)
    {
        x += x1;
        y += y1;
        z += z1;
    }



}
class pointObj {
    public static void main(String args[]){
        point p1 = new point();
        p1.printData();
        p1.setData(4, 3, 9);
        p1.printData();
        point p2 = new point(5, 1, 7);
        p2.printData();
        p2.distance();
        p2.translate(8, 9 ,2);
        p2.printData();
        point p3 = new point(p2);
        p3.printData();
    }

}
