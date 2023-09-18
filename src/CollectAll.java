import java.util.ArrayList;
import java.util.List;

public class CollectAll {
    public static List<Object> collectAll(Object[] objects, Filter filter) {
        List<Object> resultList = new ArrayList<>();
        for (Object obj : objects) {
            if (filter.accept(obj)) {
                resultList.add(obj);
            }
        }
        return resultList;
    }
}
