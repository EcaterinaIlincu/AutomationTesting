package lesson4_homework;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 10, 11, 12, 13, 14};

        System.out.println("Reversed array: ");
        for (int i = array.length -1; i>= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}


