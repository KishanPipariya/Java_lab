package Unit2;
import Unit1.passByValue;

class accessSpecifier1{
    private int p=10;
    public int q=10;
    int r=10;
    protected int s=10;
}

class accessSpecifier2{
    private int p=10;
    public int q=10;
    int r=10;
    protected int s=10;
}

class accessSpecifier3 extends passByValue{
    public void test() {
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}

private class hello{

}


class accessSpecifier extends accessSpecifier2{
    private int p=10;
    public int q=10;
    int r=10;
    protected int s=10;

    public static void main(String[] args){
        accessSpecifier ob = new accessSpecifier();//Same class
        System.out.println(ob.p);
        System.out.println(ob.q);
        System.out.println(ob.r);
        System.out.println(ob.s);

        passByValue ob1 = new passByValue();//Class from different package
        System.out.println(ob1.p);
        System.out.println(ob1.q);
        System.out.println(ob1.r);
        System.out.println(ob1.s);

        accessSpecifier1 ob2 = new accessSpecifier1();//Class in same package
        System.out.println(ob2.p);
        System.out.println(ob2.q);
        System.out.println(ob2.r);
        System.out.println(ob2.s);

        accessSpecifier2 ob3 = new accessSpecifier2();//Parent class
        System.out.println(ob3.p);
        System.out.println(ob3.q);
        System.out.println(ob3.r);
        System.out.println(ob3.s);
    }

    public void test(){

    }
}
