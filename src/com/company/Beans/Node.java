package com.company.Beans;

/**
 * Created by lipeiyuan on 2018/3/22.
 */

//树的节点类，主要就是三个成员变量  data   左孩子  右孩子
public class Node {

    private String data;
    //java中指针就是要指向的对象的类型的一个声明的变量
    private Node leftChild;
    private Node rightChild;

    public Node(){}

    public Node (String data , Node leftChild , Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }


}
