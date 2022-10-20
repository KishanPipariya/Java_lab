class distance3{
    int inches, feet;

    distance3(){
        System.out.println("Default constructor");
    }
    distance3(int inches, int feet){
        this.inches = inches;
        this.feet = feet;
    }
    void setData(int a, int b){
        feet = a;
        inches = b;
    }
    void printData(){
        System.out.println("Feet: " + feet);
        System.out.println("Inch: " + inches);
    }
}
class inchesAndFeet3 {
    public static void main(String[] args){
        distance3 d1 = new distance3();
        distance3 d2 = new distance3(2, 5);
        d1.setData(1, 2);
        d1.printData();
        d2.printData();
        distance3 d3 = d2;
        d3.feet = 50;
        d2.printData();
    }
}

