import java.util.Scanner;

public class Sequence_equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfElements = scanner.nextInt();
        int array[] = new int[nOfElements + 1];
        int newArray[] = new int[nOfElements + 1];

        for (int i=1; i<=nOfElements; i++) {
           array[i] = scanner.nextInt();
        }
        for (int i=1; i<=nOfElements; i++) {
            for (int j=1; j<=nOfElements; j++) {
                if (array[j] == i) {
                    newArray[array[i]] = j;
                }
            }
        }
        for (int i=1; i<=nOfElements; i++) {
            System.out.println(newArray[i]);
        }
        }
}
