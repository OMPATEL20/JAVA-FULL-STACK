import java.util.Scanner;

public class activityday2{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter your salary");
    int Salary=s.nextInt();
    Scanner s1=new Scanner(System.in);
    System.out.println("enter your Shift");
    int Shift=s1.nextInt();
     if(Salary>8000)
     {
        System.out.println("Salary is very Large.");
     }
     else if(Salary<0)
     {
        System.out.println("Salary is too small.");
     }
     else if(Shift<0)
     {
        System.out.println("Shift is too small.");
     }
     else{
        double fullincome=Salary+Salary*0.02*Shift;
        double saving=fullincome-(0.5*Salary);
        System.out.println("Saving income is:" + saving);
     
     }





}
}