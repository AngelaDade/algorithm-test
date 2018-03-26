package com.company.ErgodicTree;

import com.company.Beans.Node;
import com.company.Beans.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lipeiyuan on 2018/3/22.
 */

//定义二叉树前序遍历
public class PreOrder {

    List<Node> nodeList = new ArrayList<>();
    public PreOrder () {

    }
    //递归实现前序遍历
    public List preErgodic (Node root) {
        if (root != null ) {
            this.nodeList.add(root);
            if (root.getLeftChild() != null) {
                preErgodic(root.getLeftChild());
            }
            if (root.getRightChild() != null) {
                preErgodic(root.getRightChild());
            }
        }
        return this.nodeList;
    }

    //非递归实现（用栈）,用栈相当于记住了之前走过的顺序
    //需要有一个指针，先访问根节点，然后压入栈，并让指针指向它的左孩子，直到没有左孩子，
    //栈顶元素出栈，指针指向其右孩子，再次回到进行访问、压栈、指向左孩子（所以需要在入栈和出栈外面还有一个大循环）
    //用指针是否为空来控制是入栈还是出栈
    //大循环的条件应该为入栈和出栈两个条件的或合起来，承接下面一个point指向getRightChild，开启上面一个入栈
    public List preIterator (Node root) {
        Node point = root;
        Stack<Node> stack = new Stack<>();
        while (point != null || !stack.isEmpty()) {
            while (point != null) {
                nodeList.add(point);
                stack.push(point);
                point = point.getLeftChild();
            }
            if ( point == null && !stack.isEmpty() ) {
                point = stack.pop();
                point = point.getRightChild();
            }
        }
        return nodeList;
    }

}
