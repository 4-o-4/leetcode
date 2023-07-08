package easy.string;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsCharArray = jewels.toCharArray();
        int size = 0;

        for (char c : jewelsCharArray) {
            for (int i = 0; i < stones.length(); i++) {
                int j = stones.indexOf(c, i);
                if (j != -1) {
                    i = j;
                    size++;
                }
            }
        }
        return size;
    }
}
