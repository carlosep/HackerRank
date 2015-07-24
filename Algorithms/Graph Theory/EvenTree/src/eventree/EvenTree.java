package eventree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class EvenTree {

    /**
     * @param args the command line arguments
     */
    
    
    public static void separateTrees(int root, int[] uiArray, int[]viArray){
        ArrayList<Integer> vertList = new ArrayList<Integer>();
        boolean first = true;
        
        for(int i = 0; i < uiArray.length-1; i++){
            int ui = uiArray[i];
            int vi = viArray[i];
            if(vi == root){
                if(first == true){
                    vertList.add(ui);
                    first = false;
                }else{
                    vertList.add(0);
                    vertList.add(ui);
                }
            }else{
                for(int j = 0; j < vertList.size(); j++){
                    if(vertList.get(j) == vi){
                        if(j+1 != vertList.size()){
                            vertList.add(j+1, ui);
                            break;
                        }else{
                            vertList.add(ui);
                            break;
                        }
                    }
                }
            }
        }
        /*for(int i = 0; i < vertList.size(); i++){   //Don't forget to remove this by the end.
            System.out.println(vertList.get(i));
        }*/
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vertices = in.nextInt();
        int edges = in.nextInt();
        int counter = 0;
        
        int[] ui = new int[vertices];
        int[] vi = new int[vertices];
        
        for(int i = 0; i < vertices-1; i++){
            ui[i] = in.nextInt();
            vi[i] = in.nextInt();
        }
        
        separateTrees(1, ui, vi);
    }
}
/* Stack Overload Solution
 * int tree[];int count[];Scanner scan = new Scanner(System.in);int vertices = scan.nextInt(); //points
 * int edges = scan.nextInt();tree = new int[vertices];count = new int[vertices];Arrays.fill(count, 1);
 * for (int i = 0; i < edges; i++) {int u1 = scan.nextInt();int v1 = scan.nextInt();tree[u1 - 1] = v1;
 * count[v1 - 1] += count[u1 - 1];int root = tree[v1 - 1];while (root != 0) {count[root - 1] += count[u1 - 1];
 * root = tree[root - 1];}}System.out.println("");int counter = -1;for (int i = 0; i < count.length; i++){
 * if (count[i] % 2 == 0){counter++;}}System.out.println(counter);
 */
