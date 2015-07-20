package utopiantree;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class UtopianTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testcases,cycles;
        testcases = in.nextInt();
        
        for(int i = 0; i < testcases; i++){
            cycles = in.nextInt();
            int sampleSize = 1;
            for(int j = 0; j < cycles; j++){
                if(j%2 == 0){
                    sampleSize *= 2;
                }else{
                    sampleSize += 1;
                }
            }
            System.out.println(sampleSize);
        }
        
        
        
    }
    
}
