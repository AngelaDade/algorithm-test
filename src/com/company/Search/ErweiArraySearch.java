package com.company.Search;

/**
 * Created by lipeiyuan on 2018/3/27.
 */
//从二维数组（从左到右和从上到下都是从小变大）中寻找一个数是否存在
public class ErweiArraySearch {

    public boolean isExist (int[][] array , int target) {

        //从左下角开始遍历（有个问题：怎么表示左下角的坐标）
        //要注意二维数组{{}}的length为1而不是0
        if (array.length == 0 || (array.length == 1 && array[0].length==0)) {
            return false;
        }
        int row = array.length-1;
        int col = 0;
        int point = array[row][col];
        while (point != target && col < array[0].length-1 && row > 0) {
            if (target > point) {
                point = array[row][++col];
            } else {
                point = array[--row][col];
            }
        }
        if (point == target) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ErweiArraySearch erweiArraySearch = new ErweiArraySearch();
        int[][] array = {{1,2},{3,4},{5,6}};
        System.out.println(erweiArraySearch.isExist(array,1));
        int[][] a = {{}};
        System.out.println(a.length);
    }
}
