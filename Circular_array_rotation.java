import java.util.Scanner;

public class Circular_array_rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        k = k % n;

        int array[] = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] queries = new int[q];
        for (int i=0; i<q; i++) {
            queries[i] = scanner.nextInt();
        }

        int Rarray[] = new int[n];
        for (int i=0; i<n; i++) {
            Rarray[(i+k) % n] = array[i];
        }
        for (int i=0; i<q; i++) {
            System.out.println(Rarray[queries[i]]);
        }
    }
}
