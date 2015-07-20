package averybigsum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Carlos
 */
public class AVeryBigSum {

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int arraySize;            
        long sum = 0;
        arraySize = in.nextInt();
        long[] myArray = new long[arraySize];
        
        for(int i = 0; i < arraySize; i ++){
            myArray[i] = in.nextLong();
            sum += myArray[i];
        }
        System.out.println(sum);
        
    }
    
}
