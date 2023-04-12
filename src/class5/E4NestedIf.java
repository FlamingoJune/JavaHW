package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        int money = 5000;
        String day = "Monday";
        if (money>10000) {
            if (day.equals("sunday")) {

                System.out.println("Lets go shopping");
            } else {

                System.out.println("Lets wait for sunday");
            }
        }else{
            System.out.println("Lets save more");
        }
    }
}
