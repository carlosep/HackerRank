package extralongfactorials;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ExtraLongFactorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        BigInteger bigResult = new BigInteger("1");
        BigInteger bigNum = BigInteger.valueOf(n);
        
        for (int i = 0; i < n; i++){
            if(i!=n){
                BigInteger bigI = BigInteger.valueOf(i);
                bigResult = bigResult.multiply(bigNum.subtract(bigI));
            }
        }
        
        System.out.println(bigResult);
        
    }
    
}
