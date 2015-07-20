package libraryfine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class LibraryFine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] actualReturn = new int[3]; //0-day 1-month 2-year
        int[] expectedReturn = new int[3];
        int fine = 0;
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                if(i==0){
                    actualReturn[j] = in.nextInt();
                }else{
                    expectedReturn[j] = in.nextInt();
                }
            }
        }
        
        if(actualReturn[0] > expectedReturn[0] && actualReturn[1] == expectedReturn[1] && actualReturn[2] == expectedReturn[2]){
            fine = (actualReturn[0] - expectedReturn[0]) * 15;
        }else if(actualReturn[1] > expectedReturn[1] && actualReturn[2] == expectedReturn[2]){
            fine = (actualReturn[1] - expectedReturn[1]) * 500;
        }else if(actualReturn[2] > expectedReturn[2]){
            fine = 10000;
        }
        
        System.out.println(fine);
        
    }
    
}
