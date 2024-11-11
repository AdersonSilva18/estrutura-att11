import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = { 4, 3, 2, 1 };

        selectionSort(array);

        System.out.println("Array ordenado: " + Arrays.toString(array));

    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {

                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}