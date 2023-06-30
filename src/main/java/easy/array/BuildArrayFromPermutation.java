package easy.array;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ints = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            ints[i] = nums[nums[i]];
        return ints;
    }
}
