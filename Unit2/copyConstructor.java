package Unit2;

public class copyConstructor {
    int a;
    copyConstructor(int a){
        this.a=a;
    }
    copyConstructor(copyConstructor ob){
        this.a = ob.a;
    }

    public static void main(String args[]){

    }
}
