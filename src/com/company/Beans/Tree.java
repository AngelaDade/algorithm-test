package com.company.Beans;

/**
 * Created by lipeiyuan on 2018/3/22.
 */

//二叉树的类，主要持有成员变量有一个 类型为Node 的指向跟节点的 root
//以及其他节点，在初始化时可以定义，先定义叶节点
//http://blog.csdn.net/gfj0814/article/details/51637696
public class Tree {
    private Node root;
    public Tree () {
        init();
    }
    public void init () {
        Node x=new Node("X",null,null);
        Node y=new Node("Y",null,null);
        Node d=new Node("d",x,y);
        Node e=new Node("e",null,null);
        Node f=new Node("f",null,null);
        Node c=new Node("c",e,f);
        Node b=new Node("b",d,null);
        Node a=new Node("a",b,c);
        root =a;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
