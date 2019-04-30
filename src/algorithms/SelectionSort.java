package algorithms;

public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] numbers) {
        int[] sorted = new int[numbers.length];
        // loop over the items and select the lowest
        int lastLowest = -1000000;
        for (int i = 0; i < numbers.length; i++) {
            int nextLowest = 1000000;

            // do this for each item in the list
            for (int j : numbers) {
                if (j > lastLowest && j < nextLowest)
                    nextLowest = j;
            }
            sorted[i] = nextLowest;
            lastLowest = nextLowest;
        }
        return sorted;
    }












}
