package com.codecool.linkedList;


class MyNode<E> {

    E nodeData;

    MyNode<E> nextNode;

    MyNode<E> previousNode;


    public MyNode(E nodeData) {
        this.nodeData = nodeData;
    }

    public MyNode<E> getNextNode() {
        return nextNode;
    }

    public MyNode<E> getPreviousNode() {
        return previousNode;
    }

    public void setNextNode(MyNode<E> newNode) {
        this.nextNode = newNode;
    }

    public void setPreviousNode(MyNode<E> previousNode) {
        this.previousNode = previousNode;
    }

    public E getNodeData() {
        return nodeData;
    }
}