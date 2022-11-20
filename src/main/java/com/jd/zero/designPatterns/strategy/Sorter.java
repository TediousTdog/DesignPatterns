package com.jd.zero.designPatterns.strategy;

public class Sorter {
    public void sort(Comparable[] arr){
        MaoPao(arr);
    }
    public static void MaoPao(Comparable[] arr) {
        //外层循环
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                //两两比较
                minpos = arr[j].compareTo(arr[minpos]) == -1 ? j : minpos;

            }
            Comparable temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }

//    public static void MaoPao(int[] arr) {
//        //外层循环
//        for (int i = 0; i < arr.length - 1; i++) {
//            //内层循环
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                //两两比较
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }


}
