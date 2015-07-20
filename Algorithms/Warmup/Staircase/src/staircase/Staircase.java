/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staircase;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Staircase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int aux = 1;
        
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height; j++){
                if(aux < height){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
                aux++;
            }
            aux=i+2;
            System.out.println();
        }
    }
    
}
