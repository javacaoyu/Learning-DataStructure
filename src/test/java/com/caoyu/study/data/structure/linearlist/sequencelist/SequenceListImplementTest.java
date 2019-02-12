package com.caoyu.study.data.structure.linearlist.sequencelist;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceListImplementTest {
    private Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private SequenceListImplement<Integer> sequenceListImplement = new SequenceListImplement<Integer>(ints);

    @Test
    public void add() {
        sequenceListImplement.add(11);
        System.out.println(sequenceListImplement.toString());
    }

    @Test
    public void insert() {
        sequenceListImplement.insert(4, 99);
        System.out.println(sequenceListImplement.toString());
    }

    @Test
    public void remove() {
        System.out.println(sequenceListImplement.remove(4));
        System.out.println(sequenceListImplement.toString());
    }
}