package class7;

public class E9WhileLoopIf {
    public static void main(String[] args) {

        int counter=25;
        while (counter>=5) {
            if(counter!=15 && counter!=10) {

                System.out.print(counter + " ");
            }
            counter -= 5;
        }
    }
}
