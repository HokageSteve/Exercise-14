import java.util.Scanner;

/*
*Steven Allen
*ITSE-1302
*4/6/2017
*Exercise 14
*Code creates program that reads the string and determines how many vowels and constants. 
*/

public class Vowels{
    
    public static void main (String[]args){
        
        String strInput;
        int  intA = 0, intE = 0, intI = 0, intO = 0, intU = 0, intConsonant = 0;
        char chrVowels;
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter word: ");
        strInput =  scan.nextLine();

        for (int intCount = 0; intCount < strInput.length(); intCount++)
        {
            chrVowels = strInput.charAt(intCount);
            switch (chrVowels)
            {
                case 'a':
                    intA++;
                    break;
                case 'e':
                    intE++;
                    break;
                case 'i':
                    intI++;
                    break;
                case 'o':
                    intO++;
                    break;
                case 'u':
                    intU++;
                    break;
                default:
                    intConsonant++;
            }
        }
        System.out.println("Total number of a's: " + intA);
        System.out.println("Total number of e's: " + intE);
        System.out.println("Total number of i's: " + intI);
        System.out.println("Total number of o's: " + intO);
        System.out.println("Total number of u's: " + intU);
        System.out.println("Total number of consonants " + intConsonant);
    }
}