package com.company.Sort;

/**
 * Created by lipeiyuan on 2017/11/18.
 */
public class QuickSort {
    //该方法用于返回传入的数组的中枢点，即该点左边都比其小右边都比其大，每一轮快排都能确定中枢点的坐标
    public static int getPivotIndex(int[] arr , int low , int high){

        //固定切分发把数组的第一个数当做中枢值
        int pivotIndex = low;
        int pivot = arr[low];
        while (low < high){
            //从右往左扫描，碰到比pivot中枢值大或等于的就继续向左
            while (arr[high] >= pivot && high >low){
                high--;
            }
            //遇到比pivot值小的就直接让（注意：是最左边的值变化）最左边的值取现在最右边的值，因为最左边的存为了pivot值所以不用担心被覆盖
            //该方法中的交换值发生了延迟，总体来看是先将最左边的值存到pivot中，然后最左边取到最右边小于pivot的值，左边坐标右移直到大于pivot然后最右边获得该值
            arr[low] = arr[high];
            //从左往右扫描，碰到币pivot中枢值小或等于的就继续向右
            while (arr[low] <= pivot && high > low){
                low++;
            }
            arr[high] = arr[low];
        }
        //退出循环后low和high值应该是相等的，所以pivotIndex取两个都可以,并写需要将pivot值赋予到对应位置
        arr[high] = pivot;
        pivotIndex = low;


        return pivotIndex;
    }

    //用pivotIndex递归的将数组分为两部分，递归停止条件是low>=high

    public static void sort(int arr[] , int low , int high){
        if (low >= high){
            return;
        }
        int pivotIndex = getPivotIndex(arr,low,high);
        sort(arr,low,pivotIndex-1);
        sort(arr,pivotIndex+1,high);



    }
}
