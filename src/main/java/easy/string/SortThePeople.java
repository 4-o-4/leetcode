package easy.string;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] arr = new String[names.length];
        Map<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < names.length; i++)
            map.put(heights[i], names[i]);
        Iterator<String> iterator = map.values().iterator();
        for (int i = names.length - 1; iterator.hasNext(); i--)
            arr[i] = iterator.next();
        return arr;
    }
}
