package com.jd.zero.designPatterns.strategy;

import java.util.Arrays;

public class Strategy {
    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 2, 4, 6, 1};
        Cat[] cats = {new Cat(1, 1), new Cat(4, 4)
                , new Cat(2, 2)
                , new Cat(6, 6)};
        Sorter sorter = new Sorter();
        sorter.sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
