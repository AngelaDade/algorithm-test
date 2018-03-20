package com.company.Sort;

/**
 * Created by lipeiyuan on 2017/10/31.
 */
public class InsertSort {
    public static int[] sort(int[] arr){
        //外循环从数组第二个开始往后不断的选择一个数进行插入，每轮i前面的数已经从小到大排好序
        for (int leftToRight = 1;leftToRight < arr.length;leftToRight++){
            //内循环从要插入的数的前一个开始不断往前走进行比较,如果不是从小到大就交换位置
            //内层循环应加个条件，当前的小于前一个的，因为默认为已经插好的是排好序的，所以不一定要比较到头
            for (int rightToLeft = leftToRight; rightToLeft > 0 && arr[rightToLeft] < arr[rightToLeft-1] ; rightToLeft-- ){

//                BasicTools.exch(arr,rightToLeft,rightToLeft-1);
                int temp = arr[rightToLeft];
                arr[rightToLeft] = arr[rightToLeft-1];
                arr[rightToLeft-1] = temp;

            }
        }

        return arr;
    }

}
