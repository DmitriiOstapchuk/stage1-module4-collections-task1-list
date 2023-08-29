package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int aFunction = (int) (5 * Math.pow(aInt, 2) + 3);
        int bFunction = (int) (5 * Math.pow(bInt, 2) + 3);
        if (aFunction == bFunction) {
            return aInt - bInt;
        } else {
            return aFunction - bFunction;
        }
    }
}
