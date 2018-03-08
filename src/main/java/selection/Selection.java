package selection;

import util.Sorting;

/**
 * @author kangkang lou
 */
public class Selection implements Sorting {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
