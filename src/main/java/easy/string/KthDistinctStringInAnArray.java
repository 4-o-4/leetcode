package easy.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new LinkedHashMap<>();

        for (String str : arr) {
            if (!map.containsKey(str))
                map.put(str, true);
            else
                map.put(str, false);
        }
        for (Map.Entry<String, Boolean> m : map.entrySet()) {
            if (m.getValue()) {
                k--;
                if (k == 0)
                    return m.getKey();
            }
        }
        return "";
    }
}
