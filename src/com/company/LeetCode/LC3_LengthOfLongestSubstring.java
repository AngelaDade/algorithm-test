package com.company.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lipeiyuan on 2018/4/22.
 * 1、HashSet可以用来去重、查看是否有重复、查看是否已有要添加的元素（如果有的话add返回false）,
 * 2、取最大值可以直接用  Math.max()
 * 3、解法一利用HashSet做了一个滑动的窗口，用left和right指向窗口的两端【i,j】
 * 4、解法二用HashMap，HashMap的key值唯一，
 * 这样做的好处在于窗口左边界右移时，不再是一个元素一个元素的移动，而是直接移动到重复元素的下一个位置，从而进一步降低了算法复杂度。
 * 滑动窗法作为一种常见的数据处理手段，值得我在日后的学习过程中多多注意
 */
public class LC3_LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";
        int length = lengthOfLongestSubstring(s);
        int length2 = lengthOfLongestSubstring_2(s);
        System.out.println(length);
        System.out.println(length2);
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 1;
        if (s.length() == 0) {
            return 0;
        }
        int leftIndex = 0;
        int rightIndex = leftIndex+1;

        Set<Character> characterSet = new HashSet<>();
        char[] chars = s.toCharArray();
        characterSet.add(chars[leftIndex]);



        while (rightIndex < chars.length && leftIndex < chars.length) {
            // try to extend the range [i, j]
            boolean ifAddIn = characterSet.add(chars[rightIndex]);
            if (ifAddIn){
                rightIndex++;
                result = Math.max(result,characterSet.size());
            } else {
                //本来如果插入不到set，应该直接让leftIndex指向set中和要插入重复的数对应的index但是无法得到
                //于是可以直接remove set中的元素知道能插进去
                //而且可以顺带删掉det中不要的部分，只留下有用的部分（不相同的）
                characterSet.remove(chars[leftIndex++]);
            }
        }

        return result;
    }

    public static int lengthOfLongestSubstring_2(String s) {
        int result = 1;
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int left = 0 , ritht = 0 ; ritht < s.length() ;ritht++) {
            if (map.containsKey(s.charAt(ritht))) {
                left = Math.max(left , map.get(s.charAt(ritht))+1);
            }

            //因为map的vlaue表示如果接下来窗口的left移动的话要到的位置，所以直接加1表示当前位置的后一位
            map.put(s.charAt(ritht),ritht);
            result = Math.max(result , ritht-left+1);
        }



        return result;
    }


}
