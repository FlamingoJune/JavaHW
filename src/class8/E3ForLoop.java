package class8;

public class E3ForLoop {
    public static void main(String[] args) {

        // write a loop to add all even number from 1 to 30

        int sum=0;             //creating varieable to hold the sum
        for (int i=1; i<=30;i++){
            if(i%2==0){       //to see if its even number
                sum=sum+i;   //sum+=i //adding all even numbers to the sum variable one by one

            }
        }
        System.out.println(sum);
    }
}
