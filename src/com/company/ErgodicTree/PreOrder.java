package com.company.ErgodicTree;

import com.company.Beans.Node;
import com.company.Beans.Tree;

import java.util.ArrayList;
import java.util.List;

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

}
