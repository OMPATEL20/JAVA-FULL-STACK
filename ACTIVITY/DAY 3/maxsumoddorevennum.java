import java.util.Scanner;

public class maxsumoddorevennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("invalid array size ");
        }
        int numbers[] = new int[size];
        for (int p = 0; p < size; p++)
         {
            numbers[p] = sc.nextInt();
            if (numbers[p] < 0) {
                System.out.println("invalid input");
                return;
            }
        }
        int sumeven = 0, sumodd = 0;
        for (int number : numbers) {
            if (number % 2 == 0)
                sumeven += number;
            else
                sumodd += number;
        }
        int maximum = sumeven >= sumodd ? sumeven : sumodd;
        System.out.println(maximum);
    }

}
