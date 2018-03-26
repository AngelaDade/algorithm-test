package com.company;

import com.company.Beans.Node;
import com.company.Beans.Tree;
import com.company.ErgodicTree.MidOrder;
import com.company.ErgodicTree.PostOrder;
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

        System.out.println();

        System.out.println("非递归实现前序遍历:");
        //如果是同一个PreOrder对象，执行非递归遍历时会直接在上一个对象中的nodelist中加上元素，返回的是同一个nodelist
        PreOrder preOrder1 = new PreOrder();
        nodeList = preOrder1.preIterator(tree.getRoot());
        nodeList.stream().forEach(node -> System.out.print(node.getData()+"--->"));

        System.out.println();
        System.out.println("--------------------------------分隔线-------------------------------");

        MidOrder midOrder = new MidOrder();
        nodeList = midOrder.midErgodic(tree.getRoot());
        nodeList.stream().forEach(node -> System.out.print(node.getData()+"--->"));

        System.out.println();

        System.out.println("非递归实现前序遍历:");
        MidOrder midOrder1 = new MidOrder();
        nodeList = midOrder1.midIterator(tree.getRoot());
        nodeList.stream().forEach(node -> System.out.print(node.getData()+"--->"));


        System.out.println();
        System.out.println("--------------------------------分隔线-------------------------------");

        PostOrder postOrder = new PostOrder();
        nodeList = postOrder.postErgodic(tree.getRoot());
        nodeList.stream().forEach(node -> System.out.print(node.getData()+"--->"));

        System.out.println();

        System.out.println("非递归实现后序遍历");
        PostOrder postOrder1 = new PostOrder();
        nodeList = postOrder1.postIterator(tree.getRoot());
        nodeList.stream().forEach(node -> System.out.print(node.getData()+"--->"));

        System.out.println();



    }
}
