package algorithms;

public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] numbers) {
        int[] sorted = new int[numbers.length];
        sorted[0] = numbers[0];
        for (int i =1; i< numbers.length;i++) {
            insert(numbers[i],sorted);
        }
        return sorted;
    }

    private void insert(int num, int[] nums) {
        // assumption: there is room for num in nums
        int i = 0;
        while (i < (nums.length - 1) && nums[i] > 0 && nums[i] < num)
            i++;
        // i is now the intended location for num in nums
        for (int j=nums.length-2; j >= i; j--) {
            nums[j+1] = nums[j];
        }
        // now there is room for num
        nums[i] = num;
    }
}
