package Unit2;
interface pop_{
    void pop();
}
interface push_ {
    void push(String s);
}

interface stackInterface extends pop_, push_{
    void print();
}

public class stack1 implements stackInterface{

    String[] stk;
    int len;
    stack1(String[] stk)
    {
        this.stk = stk;
        len = stk.length;
    }
    public void pop(){
        if (stk[0] == null){
            System.out.println("Invalid operation as stack is empty");
        }
        else{
            stk[stk.length-1] = null;
            len = len - 1;
        }
    }

    public void push(String s){
        if (stk[stk.length-1] == null){
            stk[len] = s;
        }
        else{
            String[] temp = new String[stk.length*2];
            for(int i=0; i<stk.length; i++)
            {
                temp[i] = stk[i];
            }
            temp[stk.length] = s;
            stk = temp
            ;
        }
        len = len +1;

    }

    public void print(){
        for(int i=0; i<len; i++){
            System.out.print(stk[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        String[] s = {"h", "e"};
        stack1 stack = new stack1(s);
        stack.pop();
        stack.print();
        stack.push("e");
        stack.push("y");
        stack.print();

    }
}
