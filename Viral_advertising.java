import java.util.Scanner;

public class Viral_advertising {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        int cumulativeLikes = 0; int likes = 0;
        int shared = 5;

        for (int i=0; i<dayNumber; i++) {
            likes = shared/2;
            cumulativeLikes += likes;
            shared = likes * 3;
        }
        System.out.println(cumulativeLikes);
    }
}
