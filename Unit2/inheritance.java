class parent{
    int a, b;
    public void sum(){
        System.out.println(a+b);
    }
}
class inheritance extends parent{
    int c;
    inheritance(int a, int b, int c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public void product(){
        System.out.println(a*b*c);
    }
    public static void main(String[] args){
        inheritance ob =  new inheritance(3,4, 5);
        ob.sum();
        ob.product();
    }
}
