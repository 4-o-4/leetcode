package easy.array;

public class TransformArrayByParity {
    public int[] transformArray(int[] nums) {
        int[] arr = new int[nums.length];
        int tmp = 0;

        for (int num : nums)
            if (num % 2 != 0)
                tmp++;
        tmp = nums.length - tmp;
        for (int i = tmp; i < nums.length; i++)
            arr[i] = 1;
        return arr;
    }
}
