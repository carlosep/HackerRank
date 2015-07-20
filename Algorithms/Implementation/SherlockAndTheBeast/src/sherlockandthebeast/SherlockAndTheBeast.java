package sherlockandthebeast;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class SherlockAndTheBeast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*F A I L-----*/
        /*-F A I L----*/
        /*--F A I L---*/
        /*---F A I L--*/
        /*----F A I L-*/
        /*-----F A I L*/
        Scanner in = new Scanner(System.in);
        
        int testcases = in.nextInt();
        int n = 0;
        for(int i = 0; i < testcases; i++){
            n = in.nextInt();
            if(n < 3){
                System.out.print(-1);
            }else if((n-3)%5 == 0 || (n-5)%3 == 0){
                if(n%3 != 0){
                    //nao vai poder ser so 5
                    for(int j = 0; j<n; j++){
                        if(j < n-5){
                            System.out.print(5);
                        }else{
                            System.out.print(3);
                        }
                    }
                }else if(n%3 == 0){
                    //é inteiro de 5
                    for(int j = 0; j < n; j++){
                        System.out.print(5);
                    }
                }
            }else if(n%3==0){
                for(int j = 0; j < n; j++){
                        System.out.print(5);
                    }
            }else if(n%5==0){
                for(int j = 0; j < n; j++){
                        if(j < n-(n%3)){
                            System.out.print(5);
                        }else{
                            System.out.print(3);
                        }
                    }
            }else{
                System.out.print(-1);
            }
            if(i != testcases-1){
                System.out.println();
            }
        }
        
    }
    
}
