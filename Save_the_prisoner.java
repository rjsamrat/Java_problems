// Code from Hackerrank that did work. But still coudnt understand the logic.

import java.io.*;
import java.util.*;

public class Save_the_prisoner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int numPrisoners = scanner.nextInt();
            int numSweets = scanner.nextInt();
            int startFrom = scanner.nextInt();
            if((startFrom - 1 + numSweets) % numPrisoners == 0) System.out.println(numPrisoners);
            else System.out.println((startFrom - 1 + numSweets) % numPrisoners);
        }
    }
}



//import java.io.*;
//import java.util.*;
//
//public class Save_the_prisoner {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int cases = scanner.nextInt();
//        for (int i = 0; i < cases; i++) {
//            int numPrisoners = scanner.nextInt();
//            int numSweets = scanner.nextInt();
//            int firstPrisoner = scanner.nextInt() - 1;
//
//            int luckyPrisoner = (firstPrisoner + numSweets - 1) % numPrisoners + 1; // didnt understand this logic
//
//            System.out.println(luckyPrisoner);
//        }
//
//    }
//}

// My code that didnt work -

//import java.util.Scanner;
//
//public class Save_the_prisoner {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int nOfTestCases = scanner.nextInt();
//        int warnPrisonerAt[] = new int[nOfTestCases];
//
//        for (int i=0; i<nOfTestCases; i++) {
//            int nOfPrisoners = scanner.nextInt();
//            int nOfSweets = scanner.nextInt();
//            int startDistributionFrom = scanner.nextInt();
//            warnPrisonerAt[i] = (nOfSweets % nOfPrisoners) + (startDistributionFrom - 1);
//        }
//        for (int i=0; i<nOfTestCases; i++) {
//            System.out.println(warnPrisonerAt[i]);
//        }
//    }
//}
