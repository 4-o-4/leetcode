package easy.array;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int pair = 0;

        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j])
                    pair++;
        return pair;
    }
}
