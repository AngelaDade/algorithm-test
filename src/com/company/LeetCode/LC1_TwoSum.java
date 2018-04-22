package com.company.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lipeiyuan on 2018/4/21.
 * 当需要使用嵌套for循环来查找或者定位的时候，尽量优先考虑是否能使用Map，存储之前遍历过的结果，只需要遍历一次
 * 因为可以利用Map的containsKey方法，如果将关键字存入key就可以直接用这个方法获取之前存储过的数据，而不需要自己遍历
 * Map里key存储nums对应下标的值，value存储对应的下标
 */
public class LC1_TwoSum {
    public int[] twoSum (int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer , Integer> numMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (numMap.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = numMap.get(target - nums[i]);
                return result;
            }
            numMap.put(nums[i] , i);
        }

        return result;
    }
}
