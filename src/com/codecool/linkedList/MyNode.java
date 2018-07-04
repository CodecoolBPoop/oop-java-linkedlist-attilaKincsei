package com.codecool.linkedList;


class MyNode<E> {

    E nodeData;

    MyNode<E> nextNode;


    public MyNode(E nodeData) {
        this.nodeData = nodeData;
    }

    public MyNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNode newNode) {
        this.nextNode = newNode;
    }


    public E getNodeData() {
        return nodeData;
    }
}