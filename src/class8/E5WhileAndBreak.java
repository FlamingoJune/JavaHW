package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        //create a boolean variable summer,store true in it,then a loop
        //that runs as long as it is summer,create temp variable,store 85 and
        //inside the loop check the temperature.if its less than 100 print "Its good i enjoy summer"
        //as soon as temp exceeds 100,print "Its very hot" and break the loop with break keyword

        boolean summer=true;
        int temp=85;
        while (summer){
            if(temp<100){
                System.out.println("I enjoy summer");
            }else{
                System.out.println("Its very hot");
                break;
            }
            temp=temp+2;
        }
    }
}
