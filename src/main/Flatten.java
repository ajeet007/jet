package main;

import service.FlattenUtil;
import static java.util.Arrays.asList;
import java.util.List;

/**
 * Created by 60923 on 27/06/2016.
 */
public class Flatten {
    public static void main(String[] args) {
        List<Object> treeList = a(a(1), 2, a(a(3, 4), 5));
        List<Object> flatList = FlattenUtil.flatten(treeList);
        System.out.println(treeList);
        System.out.println("flatten: " + flatList);
    }

    private static List<Object> a(Object... a) {
        return asList(a);
    }
}