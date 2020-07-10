// Below is my code that got 10 out of 12 cases right
// Again read the question and try to get all cases right
// 2 test cases that failed were confusing

import java.util.Scanner;
import java.lang.Math;

public class Append_and_delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        String q = scanner.next();
        int nOfOperations = scanner.nextInt();
        int nOfIndicesToCheck = Math.min(p.length() ,q.length());

        CharSequence c = "";

        for (int i=0; i<=nOfIndicesToCheck; i++) {
            CharSequence a = p.subSequence(0, i);
            CharSequence b = q.subSequence(0, i);
            if (a.equals(b)) c = a;
        }

        int n = Math.abs(c.length()-p.length());
        int k = Math.abs(c.length()-q.length());
        if(n + k <= nOfOperations) System.out.println("Yes");
        else System.out.println("No");
    }
}
