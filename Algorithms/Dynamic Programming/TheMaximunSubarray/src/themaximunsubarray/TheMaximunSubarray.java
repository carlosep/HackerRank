package themaximunsubarray;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class TheMaximunSubarray {

    /**
     * @param args the command line arguments
     */
    
    public static int kadaneAlg(int[] array){               // looks for all positive contiguous
        int maxSum = Integer.MIN_VALUE, currentMaxSum = 0;  // segments of the array and determine the biggest sum.
        
        for(int i = 0; i< array.length; i++){
            currentMaxSum += array[i];
            if (currentMaxSum > maxSum){
                maxSum = currentMaxSum;
            }
            if(currentMaxSum < 0){
                currentMaxSum = 0;
            }
        }
        return maxSum;
    }
    
    public static int MaxPositiveSum(int[] array){
        int sum = 0;
        int largestNegative = Integer.MIN_VALUE;
        int count = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sum += array[i];
            }else if(array[i] < 0){
                if(array[i] > largestNegative){
                    largestNegative = array[i];
                }
                count++;
            }
        }
        if(count == array.length){
            return largestNegative;
        }else{
            return sum;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcases = in.nextInt();
        for(int t = 0; t < testcases; t++){
            int size = in.nextInt();
            int[] myArray = new int[size];
            for(int i = 0; i < size; i++){
                myArray[i] = in.nextInt();
            }
            int maxCont = kadaneAlg(myArray);
            int maxNonCont = MaxPositiveSum(myArray);
            
            System.out.println(maxCont + " " + maxNonCont);
        }
        
    }
    
}
