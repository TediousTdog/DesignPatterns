package com.jd.zero.designPatterns.strategy;

import java.util.Arrays;

public class SorterComparator<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        System.out.println(arr.length);
        //外层循环
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                //两两比较
                minpos = comparator.compare(arr[j], arr[minpos]) == -1 ? j : minpos;
            }
            T temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }



}
