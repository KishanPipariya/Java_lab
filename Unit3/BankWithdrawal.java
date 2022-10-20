package Unit3;
class NegativeFundException extends Exception{
    NegativeFundException(String s){
        super(s);
    }
}
public class BankWithdrawal {
    static int account=0;
    static void deposit(int value){
        account += value;
    }

    static void withdraw(int value){
        try{
            account -= value;
            if(account<0){
                account += value;
                throw new NegativeFundException("Not Sufficient fund");
            }
        }
        catch(NegativeFundException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        deposit(1000);
        withdraw(400);
        withdraw(300);
        withdraw(500);
    }

}
