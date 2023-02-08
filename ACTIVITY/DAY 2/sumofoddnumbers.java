import java.util.Scanner;

public class sumofoddnumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int number = s.nextInt();
        if (number < 0) {
            System.out.println("Number is too small");
        } else if (number > 32767) {
            System.out.println("Number is too large");

        }
        int sum = 0;
        while (number % 10 != 0) {
            int digit = number % 10;
            if (digit % 2 != 0)
                sum += digit;
            number = number / 10;
        }
        System.out.println("The sum of odd digits is " + sum);
    }
}
