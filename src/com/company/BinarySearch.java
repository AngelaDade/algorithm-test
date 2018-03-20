package com.company;

import java.util.Arrays;

public class BinarySearch {

    public static int rank( int key ,int arr[] ){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (left <= right){
            mid = (left+right)/2;
            if(arr[mid] == key ){
                return mid;
            }else if (arr[mid] < key){

                left = mid+1;

            }else if (arr[mid] > key){
                right = mid-1;
            }

        }
        return -1;
    }

//    public static void main(String[] args) {
//
//        int[] whiteList = {2,3,4,5,1};
//        Arrays.sort(whiteList);
//        for (int i = 0; i < whiteList.length ;i++){
//            System.out.println(whiteList[i]);
//        }
//        System.out.println("hello");
//        System.out.println(rank(2,whiteList));
//
//    }
}
