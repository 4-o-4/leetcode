package easy.dynamic_programming;

public class CountingBits {
    public int[] countBits(int n) {
        int[] counter = new int[n + 1];

        for (int i = 0; i <= n; i++)
            counter[i] = Integer.toBinaryString(i).replace("0", "").length();
        return counter;
    }
}
