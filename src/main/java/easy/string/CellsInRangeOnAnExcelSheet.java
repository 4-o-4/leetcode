package easy.string;

import java.util.ArrayList;
import java.util.List;

public class CellsInRangeOnAnExcelSheet {
    public List<String> cellsInRange(String s) {
        List<String> arr = new ArrayList<>();
        char colBegin = s.charAt(0);
        char colEnd = s.charAt(3);
        int min = Math.min(s.charAt(1) - 48, s.charAt(4) - 48);
        int max = Math.max(s.charAt(1) - 48, s.charAt(4) - 48);

        for (int i = colBegin; i <= colEnd; i++)
            for (int j = min; j <= max; j++)
                arr.add((char) i + "" + j);
        return arr;
    }
}
