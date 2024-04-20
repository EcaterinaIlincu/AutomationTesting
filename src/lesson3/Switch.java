package lesson3;

public class Switch {
    public static void main(String[] args) {
        String curs = "Java";

        switch (curs) {
            case ("testing"):
                System.out.println("ok");
                break;
            case ("Automation"):
                System.out.println("not ok");
                break;
            case ("Java"):
                System.out.println("perfect");
                break;
            default:
                System.out.println(false);


        }
    }
}
