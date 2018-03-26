package com.company.ErgodicTree;

import com.company.Beans.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lipeiyuan on 2018/3/22.
 */
//二叉树中序遍历
public class MidOrder {
    List<Node> nodeList = new ArrayList<>();
    public MidOrder (){}

    //递归实现
    public List midErgodic (Node root) {
        if(root != null) {

            //这个就表示递归进去的条件,只要有左孩子节点就不断往左遍历直到没有左孩子
            if (root.getLeftChild() != null) {
                midErgodic(root.getLeftChild());
            }
//            else if (root.getLeftChild() == null) {
//                nodeList.add(root);
//            }

            //递归走到头的时候执行
            nodeList.add(root);


            if (root.getRightChild() != null) {
                midErgodic(root.getRightChild());
            }
        }
        return nodeList;
    }

    //非递归实现，栈实现
    //中序与前序不同的就在于加入list的时间不同，前序是第一次碰到了就放进去，中序是最后出栈的时候第二次碰到在放回去
    public List midIterator (Node root) {
        if (root == null) {
            return null;
        }
        Node point = root;
        Stack<Node> stack = new Stack<>();
        while (point != null || !stack.isEmpty()) {
            while (point != null) {
                stack.push(point);
                point = point.getLeftChild();
            }
            if (point == null && !stack.isEmpty()) {
                point = stack.pop();
                nodeList.add(point);
                point = point.getRightChild();
            }
        }

        return nodeList;



    }
}
