package bubble;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kangkang lou
 */
public class Main {
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int LENGTH = 10;
        int[] arr = new int[LENGTH];
        Random random = new Random(100);
        for (int i = 0; i < LENGTH; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("b: " + Arrays.toString(arr));
        bubble(arr);
        System.out.println("a: " + Arrays.toString(arr));
    }
}
