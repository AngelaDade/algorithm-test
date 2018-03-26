package com.company.ErgodicTree;

import com.company.Beans.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lipeiyuan on 2018/3/22.
 */
//二叉树后序遍历类
public class PostOrder {
    List<Node> nodeList = new ArrayList<>();
    public PostOrder() {}

    //递归实现后序遍历
    public List postErgodic (Node root) {

        if (root.getLeftChild() != null) {
            postErgodic(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            postErgodic(root.getRightChild());
        }
        nodeList.add(root);
        return nodeList;
    }

    //非递归实现后序遍历
    //与前序和中序不同，后序是在遍历过左孩子和右孩子后才遍历根节点
    //用栈记录经过的路径，并且要多一个指针指向当前遍历节点的上衣个节点（注意是遍历到的，即加入到nodeList中，而不是碰到的）
    //pre指向遍历的上一个节点，current指向当前遍历到的节点
    //用current不断指向栈顶元素来进行迭代
    public List postIterator (Node root) {
        Stack<Node> stack = new Stack<>();
        Node pre = null;
        Node current = null;
        //根节点先入栈
        stack.push(root);
        //放入nodeList的条件：1、已经访问到叶节点 -->  条件为左右孩子为null  2、左右孩子已经遍历过（已加入nodeList）--> 条件为pre为当前节点的左孩子或右孩子
        //否则就继续入栈
        while (!stack.isEmpty()) {
            current = stack.peek();
            if ((current.getRightChild() == null && current.getLeftChild() == null) || (pre != null && (pre == current.getLeftChild() || pre == current.getRightChild())) ) {
                stack.pop();
                nodeList.add(current);
                pre = current;
            } else {
                //先把右节点入栈，再入左节点，这样出栈的时候就是左节点先出栈
                if (current.getRightChild() != null) {
                    stack.push(current.getRightChild());
                }
                if (current.getLeftChild() != null) {
                    stack.push(current.getLeftChild());
                }
            }
        }


        return nodeList;
    }

}
