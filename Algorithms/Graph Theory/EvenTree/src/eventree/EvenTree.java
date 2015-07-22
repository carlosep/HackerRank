package eventree;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class EvenTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vertices = in.nextInt();
        int edges = in.nextInt();
        int counter = 0;
        boolean first = true;

        for (int i = 0; i < vertices - 1; i++) {
            int ui = in.nextInt();
            int vi = in.nextInt();

            if (vi == 1) {
                if (first == true) {
                    first = false;
                } else {
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
