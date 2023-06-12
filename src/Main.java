package src;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan);
        while(scan.hasNextLine()) {
            String a = scan.next();
            String b = scan.next();
            System.out.println(a + "--" + b);
        }
        System.out.println("hjh");
    }



    public static int fact(int a, int b) {
        return a + b;
    }

}