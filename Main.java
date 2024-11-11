import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] array = { 34, 7, 23, 32, 5, 62 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 > Busca Linear");
            System.out.println("2 > Busca Binária");
            System.out.println("3 > Tabela Hash");
            System.out.println("4 > Ordenação Bubble Sort");
            System.out.println("5 > Ordenação Insertion Sort");
            System.out.println("6 > Ordenação Selection Sort");
            System.out.println("7 > Ordenação Merge Sort");
            System.out.println("8 > Ordenação Quick Sort");
            System.out.println("0 > Sair");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BuscaLinear.linearSearch(array, 7);
                    break;
                case 2:
                    Arrays.sort(array);
                    BuscaBinaria.binarySearch(array, choice);
                    break;
                case 3:
                    TabelaHash.main(args);
                    break;
                case 4:
                    BubbleSort.bubbleSort(array);
                    break;
                case 5:
                    InsertionSort.insertionSort(array);
                    break;
                case 6:
                    SelectionSort.selectionSort(array);
                    break;
                case 7:
                    MergeSort.mergeSort(array, 0, array.length - 1);
                    System.out.println("Array ordenado (Merge Sort): " + Arrays.toString(array));
                    break;
                case 8:
                    QuickSort.quickSort(array, 0, array.length - 1);
                    System.out.println("Array ordenado (Quick Sort): " + Arrays.toString(array));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 0);
        scanner.close();
    }
}