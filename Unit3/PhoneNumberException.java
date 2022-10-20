package Unit3;

import java.util.Scanner;

public class PhoneNumberException extends Exception{
    PhoneNumberException(String error){
        super(error);
    }
}

class UserDefinedExceptionTest{
    static boolean lengthCheck(String s){
        return s.length() == 10;
    }

    static boolean characterCheck(String s){
        long phoneNumber;
        try{
            phoneNumber = Long.parseLong(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String phoneNo = sc.nextLine();
        try{
            if(!lengthCheck(phoneNo)){
                throw new PhoneNumberException("Phone number should contain exactly 10 digits");
            }
            if(!characterCheck(phoneNo)){
                throw new PhoneNumberException("Phone number should contain only digits");
            }
        }
        catch(PhoneNumberException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Goodbye");
        }
    }
}
