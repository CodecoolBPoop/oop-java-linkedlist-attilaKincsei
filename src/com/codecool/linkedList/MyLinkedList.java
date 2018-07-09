package com.codecool.linkedList;

public abstract class MyLinkedList<E> {

    public abstract MyNode<E> getHeadNode();

    public abstract int size();

    public abstract void add(E nodeData);

    public abstract void insert(int index, E nodeData) throws IndexOutOfBoundsException;

    public abstract void remove(int index) throws IndexOutOfBoundsException;


    protected E get(int index) {

        MyNode<E> nodeAtIndex = getNode(index);

        return nodeAtIndex.getNodeData();
    }


    protected MyNode<E> getNode(int index) {

        MyNode<E> nextElement = getHeadNode();

        if (index != 0) {
            for (int i = 1; i <= index; i++) {
                nextElement = nextElement.getNextNode();
            }
        }

        return nextElement;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size(); i++) {
            stringBuilder.append(this.get(i)).append(", ");
        }
        if (stringBuilder.length() > 3) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
