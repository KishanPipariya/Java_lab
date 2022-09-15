import java.util.Scanner;

class grading
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s=0, c=0;
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the marks of subject: ");
            int s1 = sc.nextInt();
            System.out.print("Enter the credits of subject: ");
            int c1 = sc.nextInt();
            String grade;
            if(s1>=80)
            {
                grade = "O";
            }
            else if(s1>=70)
            {
                grade = "A+";
            }
            else if(s1>=60)
            {
                grade = "A";
            }
            else if (s1>=50)
            {
                grade = "B";
            }
            else if (s1>=40)
            {
                grade = "P";
            }
            else
            {
                grade = "F";
            }
            int gradeP=0;
            switch(grade)
            {   
                case "O":
                    gradeP=10;
                    break;
                case "A+":
                    gradeP=9;
                    break;
                case "A":
                    gradeP=8;
                    break;
                case "B":
                    gradeP=7;
                    break;
                case "P":
                    gradeP=6;
                    break;
                case "F":
                    gradeP=0;
            }
            s += gradeP*c1;
            c += c1;
        }
        float SPI = s/c;
        System.out.println(SPI);
    }
}


























