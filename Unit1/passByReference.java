class cls{
    int a, b;
    cls(){
        System.out.println("Default constructor is called");
    }

    void swapFunction(cls obj){
        int c;
        c = obj.a;
        obj.a = obj.b;
        obj.b = c;
    }

    cls call(){
        cls obj = new cls();
        obj.a = 10;
        obj.b = 9;
        return obj;
    }
}
class passByReference {
    public static void main(String[] args){
        cls obj1 = new cls();
        obj1.a = 5;
        obj1.b = 4;
        System.out.println("a: " + obj1.a + "\nb: "+obj1.b);
        obj1.swapFunction(obj1);
        System.out.println("a: " + obj1.a + "\nb: "+obj1.b);
        cls obj2 = obj1.call();
        System.out.println("a: " + obj2.a + "\nb: "+obj2.b);
    }
}
