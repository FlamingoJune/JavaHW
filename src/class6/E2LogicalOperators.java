package class6;

public class E2LogicalOperators {
    public static void main(String[] args) {

        int age=70;
        boolean flag=age>1;
        System.out.println(flag); //true

        double markInMath=80;
        double markInScience=95;

        if(markInMath>90 && markInScience>90){
            System.out.println("You are bril");
        }else{
            System.out.println("You need to work hard");
        }

    }
}
