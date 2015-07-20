package caesarcipher;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class CaesarCipher {

    /**
     * @param initPos
     * @param count
     * @return
     */
    public static char findNum(int initPos, int count) {
        final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                                 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                 'o', 'p', 'q', 'r', 's', 't', 'u',
                                 'v', 'w', 'x', 'y', 'z'};
        while (count != 0) {
            if (initPos == 25) {
                initPos = 0;
            } else {
                initPos++;
            }
            count--;
        }
        return alphabet[initPos];
    }

    public static int returnNumCode(char letter) {
        letter = Character.toLowerCase(letter);
        switch (letter) {
            case 'a':return 0;  case 'b':return 1;
            case 'c':return 2;  case 'd':return 3;
            case 'e':return 4;  case 'f':return 5;
            case 'g':return 6;  case 'h':return 7;
            case 'i':return 8;  case 'j':return 9;
            case 'k':return 10; case 'l':return 11;
            case 'm':return 12; case 'n':return 13;
            case 'o':return 14; case 'p':return 15;
            case 'q':return 16; case 'r':return 17;
            case 's':return 18; case 't':return 19;
            case 'u':return 20; case 'v':return 21;
            case 'w':return 22; case 'x':return 23;
            case 'y':return 24; case 'z':return 25;
            default:return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, key;
        String expression;

        size = in.nextInt();
        in.nextLine();
        expression = in.nextLine();
        key = in.nextInt();
        
        char[] charExpression = expression.toCharArray();

        for (int i = 0; i < size; i++) {
            boolean isUpper = Character.isUpperCase(charExpression[i]);
            int numCode = returnNumCode(charExpression[i]);

            if (numCode != -1) {
                char newChar;
                newChar = findNum(numCode, key);
                if (isUpper) {
                    newChar = Character.toUpperCase(newChar);
                }
                charExpression[i] = newChar;
            }
            System.out.print(charExpression[i]);
        }
    }
}
