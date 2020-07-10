import java.util.Scanner;

public class Library_fine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int returnDate[] = new int[3];
        int dueDate[] = new int[3];

        for (int i=0; i<3; i++) {
            returnDate[i] = scanner.nextInt();
        }
        for (int i=0; i<3; i++) {
            dueDate[i] = scanner.nextInt();
        }
        int ans = -345;
        if (returnDate[2] > dueDate[2]) ans = 10000;
        else if (returnDate[2] < dueDate[2]) ans = 0;
        else if (returnDate[1] < dueDate[1]) ans = 0;
        else {
            if (returnDate[1] == dueDate[1]) {
                int a = returnDate[0] - dueDate[0];
                if (a<=0) ans = 0;
                else ans = a * 15;
            }
            else ans = (returnDate[1] - dueDate[1]) * 500;
        }
        System.out.println(ans);

    }
}
