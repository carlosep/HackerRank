package intrototutorialchallenges;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class IntroToTutorialChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = in.nextInt();
        int size = in.nextInt();
        int ini = 0, mid = 0, end = size;
        boolean found = false;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        while (ini <= end && !found) {
            mid = (ini + end) / 2;
            if (array[mid] == value) {
                found = true;
            } else if (array[mid] > value) {
                end = mid - 1;
            } else {
                ini = mid + 1;
            }
        }
        System.out.println(mid);
    }

}
