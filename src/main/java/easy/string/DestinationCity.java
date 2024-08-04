package easy.string;

import java.util.LinkedList;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        List<List<String>> tmp = new LinkedList<>();
        List<String> city = new LinkedList<>();
        List<List<String>> pathsTmp = paths;

        do {
            for (List<String> list : pathsTmp)
                if (isCity(list, city))
                    tmp.add(list);
            pathsTmp = tmp;
            tmp = new LinkedList<>();
        } while (!pathsTmp.isEmpty());
        return city.get(city.size() - 1);
    }

    private boolean isCity(List<String> list, List<String> city) {
        if (city.isEmpty()) {
            city.addAll(list);
        } else {
            if (city.get(0).equals(list.get(1))) {
                city.add(0, list.get(1));
                city.add(0, list.get(0));
            } else if (city.get(city.size() - 1).equals(list.get(0))) {
                city.add(list.get(0));
                city.add(list.get(1));
            } else
                return true;
        }
        return false;
    }
}
