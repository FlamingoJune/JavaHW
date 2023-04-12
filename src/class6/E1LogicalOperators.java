package class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean chocolates=true;
        boolean flowers=true;
        if(chocolates||flowers){
            System.out.println("Im happy");
        }else{
            System.out.println("Im sad");
        }

        boolean fiveG=true;
        boolean wifi=false;

        if(wifi||fiveG){
            System.out.println("You can browse the internet");

        }else{
            System.out.println("Not connected");
        }
    }
}
