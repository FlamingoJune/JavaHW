package class9;

public class E4Arrays {
    public static void main(String[] args) {

        /* create an array of strings ,store 5 names in that array and print all the names with the help of for loop
        and try printing with help of while loop
         */

        String []names={"Rus","Alia","Adil","Adelia","Liza"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+ " ");

        }

        int counter=0;
        System.out.println();
        while (counter < names.length) {
            System.out.println(names[counter]);
            counter++;
        }

    }
}
