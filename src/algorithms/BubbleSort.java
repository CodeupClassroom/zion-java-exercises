package algorithms;

public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] numbers) {
        for (int i = 0; i<numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j+1] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}
