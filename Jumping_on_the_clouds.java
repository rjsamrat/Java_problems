// Could'nt do this one. Below is code from Hackerrank.
// In the testcases there are no consecutive 1s. ex - 0 0 1 1. That means one's are not together anywhere.

import java.util.Scanner;

public class Jumping_on_the_clouds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfClouds = scanner.nextByte();
        int clouds[] = new int[nOfClouds];
        int currentCloud = 0; int jumpsTaken = 0;

        for(int i = 0; i < nOfClouds; i++) clouds[i] = scanner.nextInt();

        while(currentCloud != nOfClouds - 1) {
            if(currentCloud + 2 < nOfClouds && clouds[currentCloud + 2] == 0)
                currentCloud++;
            currentCloud++;
            jumpsTaken++;
        }
        System.out.println(jumpsTaken);
    }
}