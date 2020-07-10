import java.util.Scanner;

public class Repeated_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); int aCount = 0; long ans = 0;
        long num = scanner.nextLong();
        char[] c = new char[s.length()];
        c = s.toCharArray();
        for (int i=0; i<c.length; i++) {
            if (c[i] == 'a') aCount++;
        }
        if (num % s.length() == 0) {
            ans = (num/s.length()) * aCount;
        }
        else {
            long answer = (num/s.length()) * aCount;
            long rem = num % s.length();
            int rem_aCount = 0;
            for (int i=0; i<rem; i++) {
              if (c[i] == 'a') rem_aCount++;
            }
            ans = answer + rem_aCount;
        }
        System.out.println(ans);

    }
}
