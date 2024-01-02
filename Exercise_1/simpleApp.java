import java.util.Scanner;

import javax.management.ValueExp;

public class simpleApp {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
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
            Scanner strScanner = new Scanner(System.in);
            String str = strScanner.nextLine();

            if (str == null) {
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
    
    private static class ValueExp extends Exception {
        public ValueExp(String string){
            super(string);
        }
    }
}