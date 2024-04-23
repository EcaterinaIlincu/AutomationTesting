package lesson4;

public class ArrayMaxSum {
    public static void main(String[] args) {
       int [] array1 = {1,5,6,7,8,9};
       int max = array1[0];

       for (int i = 1; i < array1.length; i++) {
           //sum -  System.out.println("Suma este: " + (array1[i] + array2[i]));
           max = Math.max(max, array1[i]);
       }
        System.out.println(max);


       }



        }


