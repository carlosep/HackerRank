package angryprofessor;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class AngryProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCases;
        int totalStudents, minStudents;

        testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            totalStudents = in.nextInt();
            minStudents = in.nextInt();
            int aux = 0, countEarly = 0;
            for (int j = 0; j < totalStudents; j++) {
                aux = in.nextInt();
                if (aux <= 0) {
                    countEarly++;
                }
            }

            if (countEarly >= minStudents) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }

}
