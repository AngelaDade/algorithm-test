package com.company;

/**
 * Created by lipeiyuan on 2017/11/15.
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        //应该考虑便捷情况，如数组第一个数右边和为0，所以i要从0开始，最右端也可能是是pivot所以i要能取到num.length-1
        for(int i = 0 ; i <= nums.length - 1 ; i++){
            //应该将两边的和作为外层for循环的临时变量，不同的i要是新的
            int sumLeft = 0;
            int sumRight = 0;
            for(int left = 0 ; left < i ; left ++){
                sumLeft = sumLeft + nums[left];
            }
            for(int right = nums.length - 1 ; right > i ; right--){
                sumRight = sumRight + nums[right];
            }
            if(sumRight == sumLeft){

                return pivotIndex = i;


            }
        }
        return -1;
    }
}
