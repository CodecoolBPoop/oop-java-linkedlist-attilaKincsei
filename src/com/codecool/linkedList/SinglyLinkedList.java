package com.codecool.linkedList;

public class SinglyLinkedList<E> {


    private transient int size = 0;

    /**
     * Pointer to first node.
     * Invariant: (first == null && last == null) ||
     * (first.prev == null && first.item != null)
     */
    private transient MyNode<E> headNode;

    /**
     * Pointer to last node.
     * Invariant: (first == null && last == null) ||
     * (last.next == null && last.item != null)
     */
    private transient MyNode<E> tailNode;

    // GOOD EXAMPLE IMPLEMENTATION:
    // https://netjs.blogspot.com/2015/08/how-linked-list-class-works-internally-java.html

    SinglyLinkedList() {
    }

    public MyNode<E> getNode(int index) {

        MyNode<E> nextElement;

        if (index == 0) {
            nextElement = headNode;
        } else {
            nextElement = headNode;
            for (int i = 1; i <= index; i++) {
                MyNode<E> temporaryElement = nextElement.getNextNode();
                nextElement = temporaryElement;
            }

        }

        return nextElement;
    }

    public E get(int index) {

        MyNode<E> nodeAtIndex = getNode(index);

        return nodeAtIndex.getNodeData();
    }


    /**
     Adds new element at the end of the list and sets it as tailNode
     */
    public void add(E nodeData) {
        MyNode<E> newNode = new MyNode(nodeData);
        if (size == 0) {
            headNode = newNode;
            headNode.setNextNode(null);
            tailNode = headNode;
        } else {
            MyNode<E> lastButOneNode = tailNode;
            lastButOneNode.setNextNode(newNode);
            tailNode = lastButOneNode.getNextNode();
            tailNode.setNextNode(null);
        }
        size++;
    }

    public void insert(int index, E nodeData) throws IndexOutOfBoundsException {

        MyNode<E> insertNode = new MyNode<>(nodeData);

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            MyNode<E> secondNode = headNode;
            insertNode.setNextNode(secondNode);
            headNode = insertNode;
            size++;
        } else {

            MyNode<E> previousToInsertion = this.getNode(index - 1);
            MyNode<E> nextToInsertion = this.getNode(index);

            insertNode.setNextNode(nextToInsertion);
            previousToInsertion.setNextNode(insertNode);
            size++;
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException {

        MyNode<E> previousToRemoved = this.getNode(index - 1);

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            MyNode<E> newHeadNode = headNode.getNextNode();
            headNode = newHeadNode;
            size--;
        } else if (index == size - 1) {
            previousToRemoved.setNextNode(null);
            tailNode = previousToRemoved;
            size--;
        } else {
            MyNode<E> nextToRemoved = this.getNode(index + 1);
            previousToRemoved.setNextNode(nextToRemoved);
            size--;
        }

    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(this.get(i)).append(", ");
        }
        if (stringBuilder.length() > 3) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    MyNode<E> getHeadNode() {
        return headNode;
    }

    MyNode<E> getTailNode() {
        return tailNode;
    }
}


