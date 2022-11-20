package com.jd.zero.designPatterns.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(5,5), new Cat(3,3), new Cat(9,9) ,new Cat(7,7)};
        SorterComparator<Cat> sorter = new SorterComparator<Cat>();
        sorter.sort(cats, new CatComparator());

//        sorter.sort(cats, (o1, o2)->{
//            if (o1.weight < o2.weight) {
//                return -1;
//            }
//            else if (o1.weight > o2.weight) {
//                return 1;
//            }
//            return 0;
//        });
        System.out.println(Arrays.toString(cats));
    }
}
