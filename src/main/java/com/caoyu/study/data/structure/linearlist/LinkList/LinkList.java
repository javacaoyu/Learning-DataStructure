package com.caoyu.study.data.structure.linearlist.LinkList;

public class LinkList<E> {
    private HeaderNode headerNode = new HeaderNode();

    public LinkList(){
        headerNode.length = 0;
        headerNode.next = null;
    }

    public boolean insertWithIndex(int index, E e){
        return insertWithPosition(index + 1, e);
    }

    /*
    Attention:  Index is the index of the array. Start with 0
                Position is the relative position of the array, start with 1.
    Example:
        Index 0 is the first element of the array.
            also position 1 are same meaning is first element of the array.
        Position can not start with 0, that minimum is 1.
     */

    private void checkPosition(int position){
        // When position == headerNode.length + 1, that means insert one at last(append one).
        // That same meaning of index == headerNode.length
        if (position < 1 || position > headerNode.length + 1)
            throw new RuntimeException("Position out of range.[1 <= position <= current length + 1]");
    }

    private boolean insertFirst(Node node){
        headerNode.next = node;
        headerNode.last = node;
        headerNode.length ++;
        return true;
    }

    private boolean add(Node node){
        if (headerNode.length == 0)
            return insertFirst(node);
        headerNode.last.setNext(node);
        headerNode.last = node;
        headerNode.length ++ ;
        return true;
    }

    public boolean add(E e){
        Node node = new Node();
        node.setData(e);
        node.setNext(null);
        return add(node);
    }

    public boolean insertWithPosition(int position, E e){
        checkPosition(position);
        Node node = new Node();
        node.setData(e);
        node.setNext(null);
        if (headerNode.length == 0){
            // That means is the first insert
            return insertFirst(node);
        }
        if (position == headerNode.length + 1){
            // That means append a element.
            return add(node);
        }
        Node before = headerNode;
        for (int i = 1; i < position ; i++) {
            before = before.getNext();
        }
        Node after = before.getNext();
        before.setNext(node);
        node.setNext(after);
        headerNode.length ++;
        return true;
    }

    @Override
    public String toString(){
        String strReturn = "";
        Node first = headerNode.next;
        for (int i = 1; i <= headerNode.length; i++) {
            strReturn += first.getData().toString() + ",";
            if (i == headerNode.length){
                break;
            }
            first = first.getNext();
        }
        return strReturn;
    }

}
