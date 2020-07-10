import java.util.Scanner;

public class Circular_array_rotation_algorithm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        int s = 0;
        int e = n-1; // or [a.length - 1]
        int eElement = -2345; int sElement = -2523;
        while (s<e) {
            eElement = a[e];
            sElement = a[s];
            a[s] = eElement;
            a[e] = sElement;
            s++; e--;
        }
        for (int i=0; i<n; i++) {
            System.out.println(a[i]);
        }
    }
}
