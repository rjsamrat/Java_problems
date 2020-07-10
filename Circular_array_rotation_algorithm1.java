import java.util.Scanner;

public class Circular_array_rotation_algorithm1 {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();  // rotate by k places
        int[] a = new int[n];   // array a
        int Ra[] = new int[n];  // rotated array Ra

        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i=0; i<n; i++) {
            Ra[(i+k) % n] = a[i]; // key algorithm
         }
        for (int i=0; i<n; i++) {
        System.out.println(Ra[i]);
    }
    }
}
