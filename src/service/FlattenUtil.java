package service;


import java.util.LinkedList;
import java.util.List;
/**
 * Created by 60923 on 27/06/2016.
 */
public class FlattenUtil {
    public static List<Object> flatten(List<?> list) {
        List<Object> retVal = new LinkedList<Object>();
        flatten(list, retVal);
        return retVal;
    }
    public static void flatten(List<?> fromTreeList, List<Object> toFlatList) {
        for (Object item : fromTreeList) {
            if (item instanceof List<?>) {
                flatten((List<?>) item, toFlatList);
            } else {
                toFlatList.add(item);
            }
        }
    }
}