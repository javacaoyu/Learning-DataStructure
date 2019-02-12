package com.caoyu.study.data.structure.linearlist.LinkList;

public class HeaderNode extends Node{
    int length;
    Node next = null;
    Node last = null;

    public Node getNext(){
        return next;
    }
    public void setNext(Node node) { next = node;}
}
