import java.util.Scanner;

import javax.management.ValueExp;

public class simpleApp {

    public static void main(String[] args) {
        try (Scanner objScanner = new Scanner(System.in)) {
            System.out.println("Please Enter a Positive Number between 1 and 100:");
            Integer x = objScanner.nextInt();

            if (x <= 0 || x > 100) {
                try {
                    throw new ValueExp("Value Error");
                } catch (ValueExp e) {
                    System.out.println(e.getMessage());
                }            
            } else {
                System.out.println("You Entered a Positive Number Successfully: " + x);
                System.out.println("Please Enter the Sentence you want to print:");
                try (Scanner strScanner = new Scanner(System.in)) {
                    String str = strScanner.nextLine();

                    if (str == null || str.isEmpty() || str.matches(".*\\d.*")) {
                        /* check if the string contains any digit character (\d). 
                            The .* at the beginning and end of the pattern allows 
                            any characters to appear before and after the digit. */
                            
                        //TODO: if the user presses enter or if the string is empty it should throw value error
                        try {
                            throw new ValueExp("Value Error");
                        } catch (ValueExp e) {
                            System.out.println(e.getMessage());
                        }            
                    } else {
                        for (int i = 0; i < x; i ++)
                            System.out.println(str);
                    }
                }
            }
        }
    }
    
    private static class ValueExp extends Exception {
        public ValueExp(String string){
            super(string);
        }
    }
}