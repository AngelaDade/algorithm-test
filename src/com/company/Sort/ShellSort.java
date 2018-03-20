package com.company.Sort;

/**
 * Created by lipeiyuan on 2017/10/31.
 */
//希尔排序
//public class ShellSort {
//    public static Comparable[] sort(Comparable[] arr){
//        //gap从length/2开始
//        for (int gap = arr.length/2 ; gap > 0 ; gap /= 2){
//            //从第一组的第一个数下标加上gap的数开始简单插入排序,逐个往后遍历，分别与改组前面一个数进行比较，也就是下标减去gap对应的数
//            for (int leftToRight = gap ; leftToRight < arr.length ; leftToRight++){
//                //要考虑到一个组可能会不止一个组,切记要把大小判断放在for条件中，只要有一个前面的数小于后面的即可终止循环
//                for (int rightToLeft = leftToRight ; rightToLeft-gap >= 0 && BasicTools.less(arr[rightToLeft],arr[rightToLeft-gap]);rightToLeft -= gap){
//                    BasicTools.exch(arr,rightToLeft,rightToLeft-gap);
//                }
//            }
//        }
//        return arr;
//    }
//
//
//}
public class ShellSort {
    public static int[] sort(int[] arr){
        //gap从length/2开始
        for (int gap = arr.length/2 ; gap > 0 ; gap /= 2){
            //从第一组的第一个数下标加上gap的数开始简单插入排序,逐个往后遍历，分别与改组前面一个数进行比较，也就是下标减去gap对应的数
            for (int leftToRight = gap ; leftToRight < arr.length ; leftToRight++){
                //要考虑到一个组可能会不止一个组,切记要把大小判断放在for条件中，只要有一个前面的数小于后面的即可终止循环
                for (int rightToLeft = leftToRight ; rightToLeft-gap >= 0 && arr[rightToLeft] <= arr[rightToLeft-gap];rightToLeft -= gap){
//                    BasicTools.exch(arr,rightToLeft,rightToLeft-gap);
                    int temp = arr[rightToLeft];
                    arr[rightToLeft] = arr[rightToLeft-gap];
                    arr[rightToLeft-gap] = temp;
                }
            }
        }
        return arr;
    }


}
