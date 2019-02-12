package com.caoyu.study.data.structure.linearlist.LinkList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkListTest {
    private LinkList<Integer> linkList = new LinkList<Integer>();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() {
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        linkList.add(6);
        linkList.add(7);
        System.out.println(linkList.toString());
        assertEquals("1,2,3,4,5,6,7,", linkList.toString());
    }

    @Test
    public void insertWithPosition() {
        add();
        linkList.insertWithPosition(8, 8);
        System.out.println(linkList.toString());
        assertEquals("1,2,3,4,5,6,7,8,", linkList.toString());
        linkList.insertWithPosition(5, 99);
        System.out.println(linkList.toString());
        assertEquals("1,2,3,4,99,5,6,7,8,", linkList.toString());
        linkList.insertWithPosition(1, 999);
        System.out.println(linkList.toString());
        assertEquals("999,1,2,3,4,99,5,6,7,8,", linkList.toString());
    }
}