import java.util.Scanner;
import java.lang.Math;

public class Beautiful_days_at_the_movies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        int rev = 0; int count = 0;
        int num; int number;

        for (int l=i; l<=j; l++) {
            num = l;
            number = num;
            while(num != 0) {
                int rem = num % 10;
                rev = rev*10 + rem;
                num=num/10;
            }
            int difference = Math.abs(rev-number);
            if (difference % k ==0) {count++;}
            rev = 0;
        }
        System.out.println(count);
    }
}
