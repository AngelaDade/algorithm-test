package com.company.Sort;

/**
 * Created by lipeiyuan on 2017/10/31.
 */
public class Test {
    public static void main(String[] args){
//        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] longArr = new int[1000];
        for(int i = 0 ; i < longArr.length ; i++){
            longArr[i] = longArr.length - i;
        }
        for (int i = 0 ; i < longArr.length ; i++){
            System.out.print(longArr[i]+" ");

        }
        System.out.println();


//        SelectionSort.sort(arr);
//        InsertSort.sort(arr);
//        ShellSort.sort(arr);
        long start = System.currentTimeMillis();
//        QuickSort.sort(longArr,0,longArr.length-1);
        ShellSort.sort(longArr);
//        SelectionSort.sort(longArr);
//        InsertSort.sort(longArr);
        long end = System.currentTimeMillis();
        long time = end - start;
        for (int i = 0 ; i < longArr.length ; i++){
            System.out.print(longArr[i]+" ");
        }
        System.out.println();
        System.out.println("用时"+time+"毫秒");
    }
}
