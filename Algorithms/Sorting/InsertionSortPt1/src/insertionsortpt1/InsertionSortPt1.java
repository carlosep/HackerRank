/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortpt1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class InsertionSortPt1 {

    /**
     * @param args the command line arguments
     */
    
    public static void insertIntoSorted(int[] ar) {
        int aux = ar[ar.length-1];
        ar[ar.length-1] = ar[ar.length-2];
        for(int i = ar.length-1; i > 0; i--){
            if(ar[i-1] > aux){
                ar[i] = ar[i-1];
                printArray(ar);
            }else{
                ar[i] = aux;
                printArray(ar);
                break;
            }
        }
        if(ar[0]>aux){
            ar[0] = aux;
            printArray(ar);
        } 
            
    }
    
    
/* Tail starts here */
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
