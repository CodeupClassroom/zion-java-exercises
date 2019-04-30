package algorithms;

import java.util.Arrays;

public class AlgorithmsApp {

    public static void main(String[] args) {
        int[] numbers = {25,7,9184,77,16,83,700,5644,84,777};

        Sort sorter = new SelectionSort();
//        Sort sorter = new InsertionSort();
//        Sort sorter = new BubbleSort();
        for(int i : numbers) System.out.print(i + ", ");
        System.out.println();
//        Arrays.sort(numbers);
        int[] sorted = sorter.sort(numbers);
        for(int i : sorted) System.out.print(i + ", ");
    }
}
