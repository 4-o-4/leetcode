package easy.array;

import java.util.HashSet;
import java.util.Set;

public class SumMultiples {
    public int sumOfMultiples(int n) {
        int[] nums = new int[]{3, 5, 7};
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.addAll(sumNum(n / num, num));
        return set.stream().reduce(0, Integer::sum);
    }

    private Set<Integer> sumNum(int length, int num) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= length; i++)
            set.add(i * num);
        return set;
    }
}
