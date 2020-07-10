import java.util.Scanner;

public class Jumping_on_the_clouds_revisited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfClouds = scanner.nextInt();
        int jumpDistance = scanner.nextInt();
        int[] cloudArray = new int[nOfClouds];
        int[] newCloudArray = new int[(nOfClouds / jumpDistance)+1];
        int energy = 100;

        for (int i=0; i<nOfClouds; i++) {
            cloudArray[i] = scanner.nextInt();
        }
        for (int i=0; i<newCloudArray.length; i++) {
            newCloudArray[i] = cloudArray[(i*jumpDistance) % nOfClouds];
        }
        for (int i=1; i<newCloudArray.length; i++) {
            if (newCloudArray[i-1]==0 && newCloudArray[i]==1) {
                energy = energy - 3;
            }
            else if (newCloudArray[i-1]==1 && newCloudArray[i]==1) {
                energy = energy - 3;
            }
            else {
                energy = energy - 1;
            }
        }
        System.out.println(energy);
    }
}
