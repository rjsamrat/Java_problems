


import java.util.Scanner;

public class Utopian_tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=1;

         int nOfTestCases = scanner.nextInt();
         int periodInputs[] = new int[nOfTestCases];
         int allPossiblePeriodOutputs[] = new int[61];

        for (int i=0; i<nOfTestCases; i++) {
            periodInputs[i] = scanner.nextInt();
        }
        for (int i=0; i<=60; i++) {
            if (i==0) {
                allPossiblePeriodOutputs[0] = 1;
            }
            else if (i % 2 != 0) {
                n = n * 2;
                allPossiblePeriodOutputs[i] = n;
            }
            else if (i % 2 == 0) {
                n++;
                allPossiblePeriodOutputs[i] = n;
            }
        }
        for (int i=0; i<nOfTestCases; i++) {
            System.out.println(allPossiblePeriodOutputs[periodInputs[i]]);
        }
    }
}
