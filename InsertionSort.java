import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = { 3, 2, 4, 1 };

        insertionSort(array);

        System.out.println("Array ordenado: " + Arrays.toString(array));

    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int key = array[i];

            int j = i - 1;

            while (j >= 0 && array[j] > key) {

                array[j + 1] = array[j];

                j--;

            }

            array[j + 1] = key;

        }

    }

}