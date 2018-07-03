package com.codecool.linkedList;

public class SinglyLinkedList {


    private transient int size = 0;

    /**
     * Pointer to first node.
     * Invariant: (first == null && last == null) ||
     * (first.prev == null && first.item != null)
     */
    private transient MyNode headNode;

    /**
     * Pointer to last node.
     * Invariant: (first == null && last == null) ||
     * (last.next == null && last.item != null)
     */
    private transient MyNode tailNode;

    private transient MyNode newNode;
    private transient MyNode previousNode;

    // GOOD EXAMPLE IMPLEMENTATION:
    // https://netjs.blogspot.com/2015/08/how-linked-list-class-works-internally-java.html

    SinglyLinkedList() {
    }

    /**
     Adds new element at the end of the list and sets it as tailNode
     */
    public void add(int nodeData) {
        MyNode newNode = new MyNode(nodeData);
        if (size == 0) {
            headNode = newNode;
            headNode.setNextNode(null);
            tailNode = headNode;
        } else {
            MyNode lastButOneNode = tailNode;
            lastButOneNode.setNextNode(newNode);
            tailNode = lastButOneNode.getNextNode();
            tailNode.setNextNode(null);
        }
        size++;
    }

    public Object get(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        MyNode nextElement;

        if (index == 0) {
            nextElement = headNode;
        } else {
            nextElement = headNode;
            for (int i = 1; i <= index; i++) {
                MyNode temporaryElement = nextElement.getNextNode();
                nextElement = temporaryElement;
            }

        }

        return nextElement.getNodeData();
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
}

