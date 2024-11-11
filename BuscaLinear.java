public class BuscaLinear {

    public static void main(String[] args) {

        int[] array = { 4, 5, 9, 7, 1 };

        int target = 7;

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Elemento encontrado no índice: " + index);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}