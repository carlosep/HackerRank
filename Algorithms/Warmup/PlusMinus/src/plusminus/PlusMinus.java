package plusminus;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Carlos
 */
public class PlusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float countPositives = 0, countNegatives = 0, countZeros = 0;
        int arraySize;
        arraySize = in.nextInt();
        float[] myArray = new float[arraySize];
        
        for (int i = 0; i < arraySize; i++){
            myArray[i] = in.nextInt();
            if(myArray[i] > 0){
                countPositives++;
            }else if(myArray[i] < 0){
                countNegatives++;
            }else{
                countZeros++;
            }
        }
        
        System.out.printf("%.3f\n%.3f\n%.3f\n", 
                           countPositives/arraySize, 
                           countNegatives/arraySize, 
                           countZeros/arraySize);       
    }
    
}
