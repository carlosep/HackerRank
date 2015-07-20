package sherlockandsquares;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class SherlockAndSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testcases = in.nextInt();
        
        for(int t = 0; t < testcases; t++){
            int min = in.nextInt();
            int max = in.nextInt();
            int result = 0;
            
            result = (int)(Math.floor(Math.sqrt(max)) - Math.ceil(Math.sqrt(min))) +1;
            
            System.out.println(result);
        }
    }
}
