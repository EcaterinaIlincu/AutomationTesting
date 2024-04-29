package lesson5;

public class ex1 {
    public static void main(String[] args) {
        ex1 test = new ex1();
        test.verifyIfOdd(44, 23);

    }

    void verifyIfOdd(int numb1, int numb2){
        if (numb1 % 2 == 0 || numb2 % 2 == 0){
            System.out.println("Unul din aceste numere este par");
        }
        else System.out.println("Unul din aceste numere este impar");

    }
}
