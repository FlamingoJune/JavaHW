package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        /*int start=15;
        int end=30;

        int number=start;

        while (number<=30){

            System.out.print(number + " ");
            number++;
        }*/

//print all numbers from starting point to ending point
        //ask user for starting and ending number

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter starting and ending number,ending point and step");

        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();
        int counter =start;

        while (counter<=end){
            System.out.println(counter + " ");
            counter=counter+step; //counter++
        }


    }
}
