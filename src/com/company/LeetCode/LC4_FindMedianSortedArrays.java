package com.company.LeetCode;

/**
 * Created by lipeiyuan on 2018/4/22.
 */
public class LC4_FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;

        int allNumsIndex = 0;

        int allLength = nums1.length + nums2.length;
        int[] allNums = new int[allLength];


        int nums1Index = 0;
        int nums2Index = 0;
        while (nums1Index < nums1.length && nums2Index < nums2.length) {
            if (nums1[nums1Index] <= nums2[nums2Index]) {
                allNums[allNumsIndex++] = nums1[nums1Index++];

            } else {
                allNums[allNumsIndex++] = nums2[nums2Index++];
            }
        }
        while (nums1Index < nums1.length) {
            allNums[allNumsIndex++] = nums1[nums1Index++];
        }
        while (nums2Index < nums2.length) {
            allNums[allNumsIndex++] = nums2[nums2Index++];
        }
        if(allLength%2 == 0) {
            int midLeft = allLength/2 - 1;
            int midRight = allLength/2;
            result = (allNums[midLeft]*1.0+allNums[midRight]*1.0)/2;
        } else {
            int mid = allLength/2;
            result = allNums[mid];
        }



        return result;
    }
}
