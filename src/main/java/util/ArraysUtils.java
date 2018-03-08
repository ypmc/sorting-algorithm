package util;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kangkang lou
 */
public class ArraysUtils {
    public static int[] generateArray(int length, int seed) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(seed);
        }
        return arr;
    }

    public static void print(int[] arr, Sorting sorting) {
        System.out.println("b: " + Arrays.toString(arr));
        sorting.sort(arr);
        System.out.println("a: " + Arrays.toString(arr));
    }
}
