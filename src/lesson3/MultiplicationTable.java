package lesson3;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int y = 1; y <= 10; y++) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(y + " * " + i + " = " + y * i);
            }
        }
    }
}