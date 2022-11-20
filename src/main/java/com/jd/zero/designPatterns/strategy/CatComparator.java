package com.jd.zero.designPatterns.strategy;

public class CatComparator implements Comparator<Cat>{

    public int compare(Cat o1, Cat o2) {
        if (o1.height < o2.height) {
            return -1;
        }
        else if (o1.height > o2.height) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
