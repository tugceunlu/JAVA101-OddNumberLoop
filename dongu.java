import java.util.Scanner;
public class Numbers2 {
    public static void main(String[] args) {
        int a;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a positive integer: ");
            a = input.nextInt();
            if (a % 4 == 0) {
                total += a;
            }

        }

        while (a % 2 == 0);

        System.out.print(total);

    }


}
