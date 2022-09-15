package Unit2;

abstract class shape {
    double ar=0;
    abstract double area();
}

class rectangle extends shape{
    double l, b;
    rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }
    double area(){
        ar = l*b;
        return ar;
    }
}

class circle extends shape{
    double r;
    circle(double r){
        this.r=r;
    }
    double area(){
        ar = 3.14*r*r;
        return ar;
    }
}

class triangle extends shape{
    double l, h;
    triangle(double l, double h){
        this.l=l;
        this.h=h;
    }
    double area(){
        ar = l*h*0.5;
        return ar;
    }
}

class testShape{
    public static void main(String[] args){

        rectangle ob1 = new rectangle(3,4);
        circle ob2 = new circle(4);
        triangle ob3 = new triangle(1,4);
        double a;
        a=ob1.area();
        System.out.println(a);
        a=ob2.area();
        System.out.println(a);
        a=ob3.area();
        System.out.println(a);
    }
}