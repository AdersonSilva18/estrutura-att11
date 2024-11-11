import java.util.Arrays;

public class BuscaBinaria {

    public static void main(String[] args) {

        int[] array = { 1, 4, 5, 7, 9 }; // Array deve estar ordenado para busca binária

        int target = 7;
        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Elemento encontrado no índice: " + index);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2; // Evita overflow

            // Verifica se o elemento do meio é o alvo
            if (array[middle] == target) {
                return middle;
            }

            // Se o alvo é maior, ignora a metade esquerda
            if (array[middle] < target) {
                left = middle + 1;
            }

            // Se o alvo é menor, ignora a metade direita
            else {
                right = middle - 1;
            }
        }

        // Retorna -1 se o elemento não foi encontrado
        return -1;
    }

}