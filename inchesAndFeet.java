class distance{
    int inches, feet;
    void setData(int a, int b){
        feet = a;
        inches = b;
    }
    void printData(){
        System.out.println("Feet: " + feet);
        System.out.println("Inch: " + inches);
    }
}
class inchesAndFeet {
    public static void main(String[] args){
        distance d1 = new distance();
        distance d2 = new distance();
        d1.setData(1, 2);
        d1.printData();
        d2.setData(5, 1);
        d2.printData();
    }
}
