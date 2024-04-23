package lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

//System.out.println(nr[1][2]); first is the idex for massive, second is the index for number in that array
// in case of tridemensional massive, [0][0][4] first number is for the tridemensional array, second is for the idex of array *in array list, third is for the  idex of the number in selected array
public class MultidimensionalArray {
    public static void main(String[] args) {
        //int[][][] nr = {{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {0,5,11}}};
        //System.out.println(nr[0][0][4]);

        int[] nr = {4, 6, 7, 6, 7, 4};
        int[] copy = Arrays.copyOfRange(nr, 0, 2);
        int[] copy1 = Arrays.copyOfRange(nr, 3, 5);
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < copy1.length; i++) {
            sum1 += copy[i];
            sum2 += copy1[i];
        }
        System.out.println(sum1 == sum2);

    }

}









//suma primelor 3 cifre egala cu suma ultimelelor 3 cifre - bilet succesful

