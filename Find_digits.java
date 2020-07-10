import java.util.Scanner;

public class Find_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOftestCases = scanner.nextInt();
        int number;
        int count=0;
        int rem = -1;
        int newNum;
        boolean run = true;

        int countArray[] = new int[nOftestCases];
        for (int i=0; i<nOftestCases; i++) {
            count = 0;
            run = true;
            int num = scanner.nextInt();
            number = num;
                while (run) {
                rem = num % 10;
                newNum = num / 10;
                if (rem != 0 && number % rem == 0) count++;
                num = newNum;
                if (num < 10 && number % num == 0) {count++; run = false;}
                }
            countArray[i] = count;
       }
        for (int i=0; i<countArray.length; i++) {
            System.out.println(countArray[i]);
        }
    }
}

