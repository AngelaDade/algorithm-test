package com.company.Sort;


/**
 * Created by lipeiyuan on 2017/10/31.
 */
public class SelectionSort {

   public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            //注意此处应考虑的是最小值的下标，而不是最小值得值
            int minIndex = i;
            for (int j = i+1;j < arr.length;j++ ){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
//                BasicTools.exch(arr,i,minIndex);
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

}
