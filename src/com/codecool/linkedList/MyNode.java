package com.codecool.linkedList;


class MyNode<E> {

    Object nodeData;

    MyNode nextNode;


    public MyNode(Object nodeData) {
        this.nodeData = nodeData;
    }

    public MyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNode newNode) {
        this.nextNode = newNode;
    }


    public Object getNodeData() {
        return nodeData;
    }
}