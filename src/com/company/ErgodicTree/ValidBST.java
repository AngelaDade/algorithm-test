package com.company.ErgodicTree;

import com.company.Beans.Node;

/**
 * Created by lipeiyuan on 2018/4/24.
 * 判断一个二叉树是否是二叉搜索树
 * https://blog.csdn.net/sunzz_pku/article/details/44495235
 * （假定当前结点值为k。对于二叉树中每个结点，判断其左孩子的值是否小于k，其右孩子的值是否大于k。如果所有结点都满足该条件，则该二叉树是一棵二叉搜索树。）
 * 思路一：如果是的话中序遍历是按升序排列的
 * 思路二：对方法一进行改进。在方法一中，需要先全部遍历一遍树，然后再做判断；
 * 显然，我们可以一边遍历树一边进行节点值的比较，
 * 如果出现父节点值小于等于左孩子节点值或者父节点值大于等于右孩子节点值的情况，就可以立即终止遍历，返回false结果即可。平均效率高于方法一。
 */
public class ValidBST {


    //用来标识是否是第一次进行比较，如果是第一次的话就为preValue第一次赋值,并在compareValue返回true
    boolean firstCompare = true;
    int preValue = 0;




    public  boolean isValidBST(Node root){
        if (root == null) {
            return true;
        }
        return isValidBST(root) && compareValue(Integer.parseInt(root.getData())) && isValidBST(root.getRightChild());
    }

    //判断根节点的值是否比前一个值小，如果小的话返回false
    public  boolean compareValue(int value){
        if (firstCompare) {
            firstCompare = false;
            preValue = value;
            return true;
        }
        if(preValue >= value){
            return false;
        } else {
            preValue = value;
            return true;
        }

    }
}
