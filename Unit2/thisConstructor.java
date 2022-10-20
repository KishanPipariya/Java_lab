package Unit2;
public class thisConstructor {
    int a, b;
    thisConstructor(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Parameterized constructor");
    }
    thisConstructor(){
        this(1, 1);
        System.out.println("Default constructor");
    }

    public static void main(String[] args){
        thisConstructor obj1 = new thisConstructor();
        System.out.println("a: " + obj1.a + "\nb: "+obj1.b);
        thisConstructor obj2 = new thisConstructor(2,3);
        System.out.println("a: " + obj2.a + "\nb: "+obj2.b);
    }
}
