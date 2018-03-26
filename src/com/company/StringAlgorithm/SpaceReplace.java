package com.company.StringAlgorithm;

/**
 * Created by lipeiyuan on 2018/3/26.
 */
//将一串字符串的空格替换为   %20
// 题目网址：https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
// 主要思路有两个：1、不在重新建一个数组存储，分别用两个指针指向原来的数组和现在的数组最后一个位置的的指针   2、从后往前替换的话元素只需要移动一次
// 使用StringBuffer包装
public class SpaceReplace {

    public String replaceSpace (String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        if (stringBuffer.length() == 0)
            return null;
        int oldLength = stringBuffer.length();
        int newLength = 0;
        int spaceNumber = 0;
        int oldPoint = stringBuffer.length() - 1;

        for (int i = 0 ; i < oldLength ; i++) {
            if (stringBuffer.charAt(i) == ' ') {
                spaceNumber++;
            }
        }

        newLength = oldLength + spaceNumber*2;
        //一个指针从原字符串最后一个从后往前走，一个指针从扩容后最后一个从后往前走
        //注意要先把字符串长度设为最新的以防超出范围,String不能直接设置长度，需要用StringBuffer包裹才可以
        stringBuffer.setLength(newLength);
        int newPoint = stringBuffer.length()-1;

        for (;oldPoint >= 0 ; --oldPoint) {

            if (stringBuffer.charAt(oldPoint) == ' ') {
                stringBuffer.setCharAt(newPoint-- , '0');
                stringBuffer.setCharAt(newPoint-- , '2');
                stringBuffer.setCharAt(newPoint-- , '%');

            } else {
                stringBuffer.setCharAt(newPoint-- , stringBuffer.charAt(oldPoint));
            }
        }

        return stringBuffer.toString();
    }
}
