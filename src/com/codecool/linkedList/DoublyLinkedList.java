package com.codecool.linkedList;

public class DoublyLinkedList<E> extends MyLinkedList<E> {

    private transient int size = 0;

    private transient MyNode<E> headNode;

    private transient MyNode<E> tailNode;


    @Override
    public int size() {
        return size;
    }

    @Override
    public MyNode<E> getHeadNode() {
        return headNode;
    }

    @Override
    public void add(E nodeData) {
        MyNode<E> newNode = new MyNode<>(nodeData);
        if (size == 0) {
            headNode = newNode;
            headNode.setNextNode(null);
            headNode.setPreviousNode(null);
            tailNode = headNode;
        } else {
            MyNode<E> lastButOneNode = tailNode;
            lastButOneNode.setNextNode(newNode);
            tailNode = lastButOneNode.getNextNode();
            tailNode.setPreviousNode(lastButOneNode);
            tailNode.setNextNode(null);
        }
        size++;

    }

    @Override
    public void insert(int index, E nodeData) throws IndexOutOfBoundsException {

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        MyNode<E> previousToRemoved = this.getNode(index - 1);

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            MyNode<E> newHeadNode = headNode.getNextNode();
            headNode = newHeadNode;
            headNode.setPreviousNode(null);
            size--;
        } else if (index == size - 1) {
            previousToRemoved.setNextNode(null);
            tailNode = previousToRemoved;
            size--;
        } else {
            MyNode<E> nextToRemoved = this.getNode(index + 1);
            previousToRemoved.setNextNode(nextToRemoved);
            nextToRemoved.setPreviousNode(previousToRemoved);
            size--;
        }

    }
}
