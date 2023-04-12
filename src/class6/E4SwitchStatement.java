package class6;

public class E4SwitchStatement {
    public static void main(String[] args) {

        int day=1;

        switch (day){
            case 1:
            System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                    System.out.println("Thursday");
            case 5:
                        System.out.println("friday");
                        break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day number");
        }
    }
}
