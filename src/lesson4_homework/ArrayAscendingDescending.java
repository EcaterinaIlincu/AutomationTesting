package lesson4_homework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayAscendingDescending {
    public static void main(String[] args) {
        int [] array  = {9,2,3,4,5,6,7,8,1,10,13,12,11};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }
}
