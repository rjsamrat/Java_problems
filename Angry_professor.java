import java.util.Scanner;

public class Angry_professor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfTestCases = scanner.nextInt();

        int nOfStudents; int lateThreshold; int beforeTime = 0; int onTime = 0;
        int[] yesNoArray = new int[nOfTestCases];

        for (int i=0; i<nOfTestCases; i++) {
            nOfStudents = scanner.nextInt();
            lateThreshold = scanner.nextInt();
            for (int j = 0; j < nOfStudents; j++) {
                int entry = scanner.nextInt();
                if (entry==0) onTime++;
                if (entry < 0) beforeTime++;
            }
            if (beforeTime + onTime >= lateThreshold) yesNoArray[i] = 0;
            else yesNoArray[i] = 1;
            beforeTime = 0;
            onTime = 0;
        }
        for (int i=0; i<nOfTestCases; i++) {
            if (yesNoArray[i] == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
