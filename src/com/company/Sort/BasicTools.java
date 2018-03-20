package com.company.Sort;

/**
 * Created by lipeiyuan on 2017/10/31.
 */
public class BasicTools {
    //less()用于元素比较
    public static boolean less(Comparable v ,Comparable w){
        return v.compareTo(w)<0;
    }
    //exch()用于交换元素
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    //show()用来打印数组
    public static void show(Comparable[] a){
        for (int i = 0;i < a.length; i++){
            System.out.print(a[i]+"   ");

        }
        System.out.println();
    }
    //isSorted()判断是否有序,从小到大
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++ ){
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }
    //findMin()选出两个数较小的
    public static Comparable findMin(Comparable a, Comparable b){
        if(a.compareTo(b)<0){
            return a;
        }else return b;
    }

}
