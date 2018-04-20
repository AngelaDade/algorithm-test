package com.company.Sort;

/**
 * Created by lipeiyuan on 2018/4/19.
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = sort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static int[] sort(int[] arr) {

        //外层循环控制循环的次数,需要循环数组长度减一次(也可以理解为从右到左内循环需要比较到的上限的index)
        for (int cycleIndex = arr.length-1 ; cycleIndex > 0 ; cycleIndex--) {
            //内层循环控制比较的位置
            for (int leftToRight = 0 ; leftToRight < cycleIndex ; leftToRight++) {
                if (arr[leftToRight] > arr[leftToRight+1]) {
                    int temp = arr[leftToRight];
                    arr[leftToRight] = arr[leftToRight+1];
                    arr[leftToRight+1] = temp;

                }
            }
        }

        return arr;
    }
}
