package class4;

import java.util.Scanner;

public class E10ScannerString {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(0);
        System.out.println("You entered " +gender);
    }
}
