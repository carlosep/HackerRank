package songofpi;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class SongOfPi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testcases = in.nextInt();in.nextLine(); 
        final int[] pi = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,
                          9,3,2,3,8,4,6,2,6,4,3,3,8,3,3};
        
        for(int i = 0; i < testcases; i++){
            String song = in.nextLine();
            String[] songsWords = song.split(" ");
            int count = 0;
            for(int j = 0; j < songsWords.length; j++){
                if(songsWords[j].length() == pi[j]){
                    count++;
                }else{
                    System.out.println("It's not a pi song.");
                    break;
                }
            }
            if(count == songsWords.length){
                System.out.println("It's a pi song.");
            }
        }
    }
    
}
