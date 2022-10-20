package Unit2;

class A {
public void methodA()
        {
        System.out.println("\nHello JAVA!");
        }
        }
class B extends A {
    public void methodB()
    {
        System.out.println("Single Inheritance");
    }
}
class C extends B {
    public void methodC()
    {
        System.out.println("Multilevel Inheritance");
    }
}
class D extends A{
    public void methodD()
    {
        System.out.println("Calling class D - Hierarchical inheritance");
    }
}
class E extends A{
    public void methodE()
    {
        System.out.println("Calling class E - Hierarchical inheritance");
    }
}
public class inheritances{
    public static void main(String args[])
    {
//Single Inheritance
        B objs = new B();
        objs.methodA();
        objs.methodB();
//Multilevel Inheritance
        C objm = new C();
        objm.methodA();
        objm.methodB();
        objm.methodC();
//Hierarchical Inheritance
        D objh = new D();
        objh.methodA();
        objh.methodD();
        E objhe = new E();
        objhe.methodA();
        objhe.methodE();
    }
}
