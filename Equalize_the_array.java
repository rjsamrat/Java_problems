import java.util.Scanner;

public class Equalize_the_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfElements = scanner.nextInt();
        int[] array = new int[101];
        int max = 0; int nOfDistinctElements = 0;
        for (int i=1; i<=nOfElements; i++) {
            array[scanner.nextInt()]++;
        }
        for (int i=1; i<array.length; i++) {
            if (array[i] != 0) nOfDistinctElements++;
        }

        if (nOfDistinctElements == nOfElements) {
            System.out.println(nOfElements - 1);
        }
        else {
            for (int i = 1; i<array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println(nOfElements - max);
        }
     }
}
