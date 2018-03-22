package com.company;

import com.company.Beans.Node;
import com.company.Beans.Tree;
import com.company.ErgodicTree.PreOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lipeiyuan on 2018/3/22.
 */
public class TreeMain {
    public static void main (String[] args) {
        Tree tree = new Tree();
        List <Node> nodeList = new ArrayList<>();

        PreOrder preOrder = new PreOrder();
        nodeList = preOrder.preErgodic(tree.getRoot());
        nodeList.stream().forEach(node -> System.out.print(node.getData()+"--->"));





    }
}
