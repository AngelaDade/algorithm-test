package com.company.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lipeiyuan on 2018/5/8.
 */
public class LC6_ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        LC6_ZigZagConversion lc6_zigZagConversion = new LC6_ZigZagConversion();
        System.out.println("1111111::   "+lc6_zigZagConversion.convert(s,4));
        System.out.println("2222222::   "+lc6_zigZagConversion.convert2(s,4));
        System.out.println("3333333::   "+lc6_zigZagConversion.convert3(s,4));
    }



    public String convert(String s, int numRows) {

        String result = new String();

        //用数组表示每一行最终的结果（每个元素存变为锯齿状后这一行的字符串），最后合并就可以了
        String[] rowResult = new String[numRows];
        Arrays.fill(rowResult , "");
        //flag为0表示从上往下，为1表示从下往上
        int flag = 1;
        int currentRow = 0;
        int i = 0;
        while (i < s.length()) {
            while (flag == 1 && i < s.length()) {
                rowResult[currentRow] += s.charAt(i);
                currentRow++;
                i++;
                //如果numRows为1，那么来不及等于就大于
                //如果numRows大于1，会经历等于1的过程
                if (numRows == 1) {
                    if (currentRow > numRows-1) {
                        flag = 0;
                        currentRow--;
                    }
                } else {
                    if (currentRow == numRows-1) {
                        flag = 0;
                    }
                }
            }
            while (flag == 0 && i < s.length()) {
                rowResult[currentRow] += s.charAt(i);
                currentRow--;
                i++;
                if (numRows == 1) {
                    if (currentRow < 0) {
                        flag = 1;
                        currentRow++;
                    }
                } else {
                    if (currentRow == 0) {
                        flag = 1;
                    }
                }
            }
        }
//        Arrays.stream(rowResult).forEach(rowResultStr -> {
//            result += rowResultStr;
//        });
        for (String rowResultStr : rowResult) {
            result += rowResultStr;
        }
        return result;

    }

    public String convert2(String s, int nRows) {
        int len = s.length();
        if (len == 0 || nRows <= 1) return s;

        String[] ans = new String[nRows];
        Arrays.fill(ans, "");
        int row = 0, step = 1;
        for (int i = 0; i < len; i++) {
            ans[row] += s.charAt(i);
            row += step;
            if (row >= nRows) {
                row = nRows-2;
                step = -1;
            }
            if (row < 0) {
                row = 1;
                step = 1;
            }
        }

        String ret = "";
        for (int i = 0; i < nRows; i++) {
            ret += ans[i];
        }
        return ret;
    }

    public String convert3(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        StringBuffer result = new StringBuffer();
        //直接根据规律一行一行录入（直接计算在字符串中的绝对下标）
        for (int currentRow = 0 ; currentRow < numRows ; currentRow++) {
            //每行的第一个数的在字符串中的下标就是行数
            for (int colIndex = currentRow ; colIndex < s.length();) {
                //第一行和最后一行的后一个数下标比前一个数下标大   2*numRows-2
                //中间行 每两个(满列)的中间都要插入一个数，这个数的坐标比本行前一个数下标大   2*numRows-2-2*currentRow
                //所以每一行都要做的是把colIndex加size得到下一个满列的下标，但是中间行要加一步操作添加两个满列中间的元素
                int size = 2*numRows-2;
                result.append(s.charAt(colIndex));
                //中间行要多一步操作添加两个满列中间的元素
                if (currentRow != 0 && currentRow != numRows-1) {
                    int midIndex = colIndex + size - 2*currentRow;
                    if (midIndex < s.length()) {
                        result.append(s.charAt(midIndex));
                    }

                }
                colIndex = colIndex + size;
            }
        }
        return result.toString();

    }
}
