package finddigits;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class FindDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testcases = in.nextInt();
        
        for (int i = 0; i < testcases; i++){
            int number = in.nextInt();
            int count = 0;
            
            String temp = Integer.toString(number);
            int[] numberArray = new int[temp.length()];
            for(int j = 0; j < temp.length(); j++){
                numberArray[j] = Character.getNumericValue(temp.charAt(j));
                
                if(numberArray[j] != 0 && number%numberArray[j] == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
