/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortpt2;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class InsertionSortPt2 {

    /**
     * @param ar
     */
    public static void insertIntoSorted(int[] ar) {
        int aux;
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] > ar[j]){
                    aux = ar[j];
                    ar[j] = ar[i];
                    ar[i] = aux;
                    printArray(ar);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
}
