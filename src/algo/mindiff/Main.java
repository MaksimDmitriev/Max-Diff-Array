package algo.mindiff;

public class Main {

    // http://www.careercup.com/question?id=5185822661804032
    // http://codereview.stackexchange.com/q/85857/23821
    public static void main(String[] args) {
        System.out.println(minDiff(new int[] { 10, 1, 12, 3, 4, 28, 1 }));
    }

    private static int minDiff(int[] array) {
        int diff = 0;
        int result = 0;
        for (int i = 0; i < array.length;) {
            int maxIndex = maxIndex(array, i);
            int minIndex = minIndex(array, i, maxIndex);
            diff = array[maxIndex] - array[minIndex];
            if (result < diff)
                result = diff;
            i = maxIndex + 1;
        }
        return result;
    }

    private static int minIndex(int[] array, int start, int end) {
        int min = start;
        for (int i = start + 1; i < end; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

    private static int maxIndex(int[] array, int start) {
        int max = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] >= array[max]) {
                max = i;
            }
        }
        return max;
    }

}
