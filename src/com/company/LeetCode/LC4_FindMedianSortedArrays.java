package com.company.LeetCode;

/**
 * Created by lipeiyuan on 2018/4/22.
 * 查找两个排序数组的第 k 小 数字：  https://segmentfault.com/a/1190000011092563
 */
public class LC4_FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
//        double result = findMedianSortedArrays(nums1,nums2);
        LC4_FindMedianSortedArrays lc4_findMedianSortedArrays = new LC4_FindMedianSortedArrays();

        double result = lc4_findMedianSortedArrays.findMedianSortedArrays2(nums1,nums2);
        System.out.println(result);
    }

    //方案一
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

    //方案二、查找第k小的数
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int allLength = nums1.length+nums2.length;
        if (allLength%2 == 0) {
            int midLeft = findKth(nums1,0,nums1.length,nums2,0,nums2.length,allLength/2);
            int midRight = findKth(nums1,0,nums1.length,nums2,0,nums2.length,allLength/2+1);
            return (midLeft*1.0+midRight*1.0)/2;

        } else {
            int mid = findKth(nums1,0,nums1.length,nums2,0,nums2.length,allLength/2+1);
            return mid*1.0;
        }
    }
    //参数含义：aStart表示a数组的开始下标，aLength表示当前a数组的元素还在考虑范围内的个数,而不是数组下标，也不是a的总个数
    // k也表示第k个小的，也是从1开始，而不是下标
    public int findKth(int[] a , int aStart , int aLength , int[] b , int bStart , int bLength , int k) {
        //为了方便讨论，保证函数里的a的长度小于等于b的长度
        if (aLength > bLength) {
            return findKth(b,bStart,bLength,a,aStart,aLength,k);
        }
        //如果短的长度为零，第k小在长的b中,注意要用aLength而不是a.length
        if (aLength == 0) {
            return b[bStart+k-1];
        }
        //如果k==1，就返回最小值
        if (k == 1) {
            return Math.min(a[aStart],b[bStart]);
        }

        //对于较短的a，要保证取的下标不能越界，在选 k/2个数 和 所有数 中去较小的值
        //a选第aKMid个数，b选第bKMid个数（都是个数，从1开始，不是下标）
        int aKMid = Math.min(k/2 , aLength);
        //对于b要用k减去a选的剩下的个数
        int bKMid = k-aKMid;

        //注意这里不能直接用a[aKMid-1] < b[bKMid-1] ，因为是要用绝对下标（从0开始）而不是相对下标（从start开始）
        if (a[aStart+aKMid-1] < b[bStart+bKMid-1]) {
            return findKth(a,aStart+aKMid,aLength-aKMid,b,bStart,bKMid,k-aKMid);
        } else if (a[aStart+aKMid-1] > b[bStart+bKMid-1]){
            return findKth(a,aStart,aKMid,b,bStart+bKMid,bLength-bKMid,k-bKMid);
        } else {
            return a[aStart+aKMid-1];
        }

    }


}
