package class7;

public class E12WhileLoop {
    public static void main(String[] args) {

        //add all of the numbers 1 to 10 and display result 55

        int counter=1;
        int sum=0;
        while(counter<=10){
            sum=sum+counter; //or sum+=counter -->same thing
            counter++;
        System.out.print(sum);
        }


    }
}
