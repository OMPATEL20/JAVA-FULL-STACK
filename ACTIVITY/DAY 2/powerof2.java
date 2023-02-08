import java.util.Scanner;

public class powerof2{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter number");
    int number=s.nextInt();
    
    if(number < 0)
{
   System.out.println("Number is too small");
 }
  else if(number > 32767)
   {
       System.out.println("Number is too large");
    }
   else{
       while(number%2 == 0){
        number = number/2;
         }
    if(number==1){
    System.out.println("Yes");
     }
      else{ 
       System.out.println("No");
   }
     }
}
}
