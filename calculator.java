import java.lang.Math;
import java.util.Scanner;

public class calculator 
{    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String resp, prompt;
        String pr[];
        float a, b;
        while(true)
        {
            System.out.println("Do you want to perform an operation?");
            resp = sc.nextLine();

            if (resp.equals("y"))
            {
                System.out.println("Enter the eqaution in the form operand1 operator operand2");
                prompt = sc.nextLine();
                pr = prompt.split(" ");
                a = Float.parseFloat(pr[0]);
                b = Float.parseFloat(pr[2]);
                switch(pr[1])
                {
                    case "+":
                    System.out.println(a+b);
                    break;
                    case "-":
                    System.out.println(a-b);
                    break;
                    case "*":
                    System.out.println(a*b);
                    break;
                    case "/":
                    System.out.println(a/b);
                    break;
                    case "%":
                    System.out.println(a%b);
                    break;
                    case "^":
                    System.out.println(Math.pow(a,b));
                    break;
                    default:
                    System.out.println("Invalid operation");
                    
                }                
            }
            else
            {
                break;
            }

        }
        sc.close();
    }
}
