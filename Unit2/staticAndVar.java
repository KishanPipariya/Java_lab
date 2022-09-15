class staticAndVar {

    static int count;
    static void sum(int ... a){
        count++;
        int s =0;
        for(int n : a){
            s += n;
        }
        System.out.println("Sum: " + s);
    }

    public static void main(String[] args){
        staticAndVar.sum(1, 7 ,8);
        staticAndVar.sum(3, 4);
        System.out.println("Calls: " + staticAndVar.count);
    }

}
