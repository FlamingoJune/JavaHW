package class9;

public class E3Arrays {
    public static void main(String[] args) {
        // create an array of chars and print all chars on even indexes

        char [] chars={'a','b','c','d','e'};

        for (int i = 0; i < chars.length; i+=2) {

                System.out.println(chars[i]);
            }


    }
}
