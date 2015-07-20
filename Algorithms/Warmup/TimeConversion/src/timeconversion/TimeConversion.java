package timeconversion;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class TimeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        String newTime = time.substring(0, 8);
        int h = Integer.parseInt(time.substring(0,2));
        
        if(time.toLowerCase().contains("am")){
            if(h == 12)
                newTime = newTime.replaceFirst("12", "00");
            System.out.println(newTime);
        }if(time.toLowerCase().contains("pm")){
           if(h < 12){
                if("0".equals(time.substring(0,1))){
                    newTime = newTime.replaceFirst("0"+Integer.toString(h), Integer.toString(h + 12));
                }else{
                    newTime = newTime.replaceFirst(Integer.toString(h), Integer.toString(h + 12));
                }
            }
            System.out.println(newTime);
        }
    }
}
