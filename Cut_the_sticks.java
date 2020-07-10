import java.util.ArrayList;
import java.util.Scanner;

public class Cut_the_sticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean singleElementLeft = false;
        int min = Integer.MAX_VALUE;
        int nOfSticks = scanner.nextInt();
        int[] sticksArray = new int[nOfSticks];
        ArrayList<Integer> answerList = new ArrayList<>();
        int zeroCount = 0; int ans = 0;

        for (int i=0; i<nOfSticks; i++) sticksArray[i] = scanner.nextInt();
        System.out.println(nOfSticks);
        while (!singleElementLeft) {
            ans = 0;
            for (int i=0; i<nOfSticks; i++) {
                if (sticksArray[i] < min && sticksArray[i] > 0) min = sticksArray[i];
            }
            for (int i=0; i<nOfSticks; i++) {
                sticksArray[i] = sticksArray[i] - min;
                if (sticksArray[i] > 0) ans ++;
            }
            if (!answerList.contains(ans) && ans > 0) {
                answerList.add(ans);
            }
            for (int i=0; i<nOfSticks; i++) {
                if (sticksArray[i] == 0) zeroCount++;
                if (sticksArray.length - zeroCount == 1) {
                    singleElementLeft = true;
                }
            }
        }
        Integer[] arrayAnswer = new Integer[answerList.size()];
        answerList.toArray(arrayAnswer);
        for (int i=0; i<arrayAnswer.length; i++) {
            System.out.println(arrayAnswer[i]);
        }
    }
}