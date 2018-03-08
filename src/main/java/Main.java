import bubble.Bubble;
import insertion.Insertion;
import selection.Selection;
import util.ArraysUtils;

/**
 * @author kangkang lou
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = ArraysUtils.generateArray(10, 100);
        ArraysUtils.print(arr, new Bubble());
        arr = ArraysUtils.generateArray(10, 100);
        ArraysUtils.print(arr, new Selection());
        arr = ArraysUtils.generateArray(10, 100);
        ArraysUtils.print(arr, new Insertion());
    }
}