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

        MyNode<E> insertNode = new MyNode<>(nodeData);

        if (index >= size || index < 0) {

            throw new IndexOutOfBoundsException();

        } else if (index == 0) {

            MyNode<E> secondNode = headNode;
            insertNode.setNextNode(secondNode);
            insertNode.setPreviousNode(null);
            headNode = insertNode;
            size++;

        } else {

            MyNode<E> previousToInsertion = this.getNode(index - 1);
            MyNode<E> nextToInsertion = this.getNode(index);

            insertNode.setNextNode(nextToInsertion);
            insertNode.setPreviousNode(previousToInsertion);
            previousToInsertion.setNextNode(insertNode);
            nextToInsertion.setPreviousNode(insertNode);
            size++;
        }

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        MyNode<E> nodeToBeRemoved = this.getNode(index);

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            MyNode<E> newHeadNode = headNode.getNextNode();
            headNode = newHeadNode;
            headNode.setPreviousNode(null);
            size--;
        } else if (index == size - 1) {
            tailNode = nodeToBeRemoved.getPreviousNode();
            tailNode.setNextNode(null);
            size--;
        } else {
            MyNode<E> nextNode = nodeToBeRemoved.getNextNode();
            MyNode<E> previousNode = nodeToBeRemoved.getPreviousNode();
            previousNode.setNextNode(nextNode);
            nextNode.setPreviousNode(previousNode);
            size--;
        }

    }
}
