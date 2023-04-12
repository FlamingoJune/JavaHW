package class9;

public class E6Arrays {
    public static void main(String[] args) {

        //create array ,store 10,50,60,45,100 and print elements which are present on odd indexes

        int[] numbers = {10, 50, 60, 45, 100};
        for (int i = 0; i < numbers.length; i++) { //or use i+=2 to get odd numbers
            if (i % 2 != 0) {
                System.out.println(numbers[i]);

            }
        }
    }}
