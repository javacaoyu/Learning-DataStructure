package com.caoyu.study.data.structure.linearlist.LinkList;

public class Node {
    private Object data;
    private Node next = null;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
