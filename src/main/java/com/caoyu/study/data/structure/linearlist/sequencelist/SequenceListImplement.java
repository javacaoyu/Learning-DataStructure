package com.caoyu.study.data.structure.linearlist.sequencelist;

/**
 * Custom implement linear list of sequence stories
 * For now, only implemented insert and add and remove function.
 * @param <E>
 */
public class SequenceListImplement<E> {
    Object[] datas = null;  // 存储数据
    int length;
    int capacity;

    public SequenceListImplement(){
        this(10);
    }

    public SequenceListImplement(int initCapacity){
        if (initCapacity <= 0){
            throw new RuntimeException("Init capacity is not available number. That must greater than zero.");
        }
        this.capacity = initCapacity;
        datas = new Object[initCapacity];
        this.length = 0;
    }

    public SequenceListImplement(E[] initArray){
        this(initArray.length);
        for (int i = 0; i < initArray.length; i++) {
            this.datas[i] = initArray[i];
            this.length ++;
        }
    }

    private void capacityExpansion(){
        Object[] tmps = new Object[this.capacity * 2];
        for (int i = 0; i < this.capacity; i++) {
            tmps[i] = this.datas[i];
        }
        this.capacity = this.capacity * 2;
        this.datas = tmps;
    }

    private void ensureCapacity(){
        if (this.length == this.capacity){
            capacityExpansion();
        }
    }

    public boolean add(E e){
        ensureCapacity();
        this.datas[this.length] = e;
        this.length ++;
        return true;
    }

    private void indexCheck(int index){
        if (index < 0 || index > this.length){
            throw new RuntimeException("Index out of range.");
        }
    }

    public boolean insert(int index, E e){
        indexCheck(index);
        ensureCapacity();
//        if (index == this.length){
//            return add(e);
//        }
        for (int i = this.length; i > index; i--) {
            this.datas[i] = this.datas[i - 1];
        }
        this.datas[index] = e;
        this.length ++;
        return true;
    }

    public Object remove(int index){
        indexCheck(index);
        Object removed = this.datas[index];
        Object tmps[] = new Object[this.length - 1];
        for (int i = index; i < this.length - 1; i++) {
            this.datas[i] = this.datas[i + 1];
        }
        for (int i = 0; i < tmps.length ; i++) {
            tmps[i] = this.datas[i];
        }
        this.datas = tmps;
        this.length --;
        return removed;
    }

    @Override
    public String toString(){
        String strReturn = "";
        for (int i = 0; i < this.length; i++) {
            strReturn = strReturn + this.datas[i];
            if (i < this.length - 1)
                strReturn += ",";
        }
        return strReturn;
    }
}
