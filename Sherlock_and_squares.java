// Could'nt do this one at first. commented code below is the code that got only 75% test cases right.
// Below code is the code that worked

import java.util.Scanner;
import java.lang.Math;

public class Sherlock_and_squares {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nOfTestCases = scanner.nextInt();
    int ans;
    int ansArray[] = new int[nOfTestCases];
    for (int i=0; i<nOfTestCases; i++) {
        String num1 = scanner.next();
        String num2 = scanner.next();

        int min = (int)Math.ceil(Math.sqrt(Integer.parseInt(num1)));
        int max = (int)Math.floor(Math.sqrt(Integer.parseInt(num2)));
        ans = max - min + 1;
        ansArray[i] = ans;
    }
    for (int i=0; i<nOfTestCases; i++) System.out.println(ansArray[i]);
    }
}


// This below code did'nt work

//import java.util.Scanner;
//import java.lang.Math;
//
//public class Sherlock_and_squares {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int nOfTestCases = scanner.nextInt();
//        int ans[] = new int[nOfTestCases];
//        for (int i=0; i<nOfTestCases; i++) {
//            Double num1 = scanner.nextDouble();
//            Double num2 = scanner.nextDouble();
//            Double sqrt1 = Math.sqrt(num1);
//            Double sqrt2 = Math.sqrt(num2);
//            if (Math.abs(sqrt1-sqrt2) < 1) ans[i] = 0;
//            else {
//                Double no1 = Math.ceil(sqrt1);
//                Double no2 = Math.floor(sqrt2);
//                Double answer = (Math.abs(no1 - no2) + 1);
//                int answer2 = answer.intValue();
//                ans[i] = answer2;
//            }
//        }
//        for (int i=0; i<nOfTestCases; i++) {
//            System.out.println(ans[i]);
//        }
//    }
//}
//
