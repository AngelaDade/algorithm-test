package com.company.Sort;

import java.util.stream.Stream;

/**
 * Created by lipeiyuan on 2018/4/16.
 * 归并排序，递归实现
 * 分为两个部分，一个是merge数组一个是递归排序
 */
public class MergeSort {

    public  void merge(int[] arr , int low , int mid, int high) {
        int[] temp = new int[high-low+1];

        int tempIndex = 0;
        int fromLowIndex = low;
        int fromMidIndex = mid+1;

        while (fromLowIndex <= mid && fromMidIndex <= high) {
            if (arr[fromLowIndex] < arr[fromMidIndex]) {
                temp[tempIndex++] = arr[fromLowIndex++];
            } else if (arr[fromMidIndex] < arr[fromLowIndex]) {
                temp[tempIndex++] = arr[fromMidIndex++];
            }
        }

        while (fromLowIndex <= mid) {
            temp[tempIndex++] = arr[fromLowIndex++];
        }

        while (fromMidIndex <= high) {
            temp[tempIndex++] = arr[fromMidIndex++];
        }

        for (int i = 0 ; i < temp.length ; i++ ) {
            arr[low+i] = temp[i];
        }

    }

    public int[] mergeSort(int[] arr , int low , int high) {

        //递归要先给出出栈的条件
        if (low >= high) {
            return null;
        }
        int mid = (high+low)/2;

        //左边归并排序
        mergeSort(arr, low, mid);
        //右边归并排序
        mergeSort(arr, mid + 1, high);
        //将已排序的两个数组合并
        merge(arr, low, mid, high);

        return arr;

    }

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();

        int[] arr = {5,4,3,2,1};
        int low = 0;
        int high = arr.length-1;

        for (int i: arr) {
            System.out.print(i+",");
        }

        mergeSort.mergeSort(arr , low , high);

        System.out.println();

        for (int i: arr) {
            System.out.print(i+",");
        }

    }


}
