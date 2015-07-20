package diagonaldifference;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Carlos
 */
public class DiagonalDifference {

    /**
     * @param n
     * @return 
     */
    
    public static int absoluteValue(int n){
        return (n<= 0)?0 - n : n;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int matrixSize = 0, mainDiagonalSum = 0, antiDiagonalSum = 0, result = 0;
        matrixSize = in.nextInt();
        
        int[][] myMatrix = new int[matrixSize][matrixSize];
        
        for(int i = 0; i < matrixSize; i++){
            for(int j = 0; j < matrixSize; j++){
                myMatrix[i][j] = in.nextInt();
            }
        }
        
        for (int i = 0; i < matrixSize; i++){
            mainDiagonalSum += myMatrix[i][i];
            antiDiagonalSum += myMatrix[i][(matrixSize-1) - i];
        }
        
        if((mainDiagonalSum <=0 && antiDiagonalSum <=0) 
            || (mainDiagonalSum >=0 && antiDiagonalSum >=0)){
            result = absoluteValue(mainDiagonalSum) - absoluteValue(antiDiagonalSum);
        }else if((mainDiagonalSum <=0 && antiDiagonalSum >=0) 
                  || (mainDiagonalSum >=0 && antiDiagonalSum <=0)){
            result = absoluteValue(mainDiagonalSum) + absoluteValue(antiDiagonalSum);
        }
        
        //result = result <= 0? 0-result: result;  //<<submitted>>
        result = absoluteValue(result); //more efficient
        
        System.out.println(result);
    }
    
}
