package com.company.Search;

/**
 * Created by lipeiyuan on 2017/11/8.
 */
//基于无序链表的顺序查找（ST是符号表的意思）
public class SequentialSearchST<Key,Value>{
    private class Node{
        Key key;
        Value value;
        Node next;
        public Node(Key key , Value value , Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    //链表首节点
    private Node first;

    //根据键值返回value值
    public Value get(Key key){
        for(Node node = first ; node != null ; node = node.next){
            if(node.key.equals(key))
                return node.value;
        }
        return null;
    }
    //根据Key返回Node对象
    public Node getNode(Key key){
        for(Node node = first ; node != null ; node = node.next){
            if(node.key.equals(key))
                return node;
        }
        return null;
    }


    //查找给定的键，找到则更新其值，否则在表中新建结点
    public void put(Key key , Value value){
        boolean flag = false;
        //value不允许为空
        if(value != null){
            for (Node node = first ; node != null ; node = node.next){
                if(node.key.equals(key)){
                    node.value = value;
                    return ;
                }else if(node.next == null){
                    Node newNode = new Node(key,value,null);
                    node.next = newNode;
                }//此方法为新建的节点在链表的后端
            }
        }


    }

    //获取链表键值对数目
    public int size(){
        int count = 0;
        for(Node node = first ; node != null ; node = node.next){
            count++;
        }
        return count;
    }

    //删除指定节点（即时删除）
    public void delete(Key key){
        Node deleteNode = getNode(key);

        for(Node node = first ; node.next != deleteNode ; node = node.next){
            node.next = node.next.next;
            deleteNode = null;
        }

    }


}
