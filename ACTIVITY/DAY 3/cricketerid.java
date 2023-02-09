import java.util.Scanner;

public class cricketerid {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 0) {
            System.out.println("Invalid Array");
            return;
        }
        int cricketers[] = new int[i];
        for (int j = 0; j < i; j++) {
            cricketers[j] = sc.nextInt();
            if (cricketers[j] < 0) {
                System.out.println("Invalid Input");
                return;
            }
        }
        int score = sc.nextInt();
        if (score < 0) {
            System.out.println("Invalid score input");
        }
        for (int j = 0; j < i; j = j + 2) {
            if (cricketers[j + 1] > score) {
                System.out.println(cricketers[j]);
            }
        }
    }
}
