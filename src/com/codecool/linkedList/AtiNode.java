package com.codecool.linkedList;


class AtiNode<E> {

    final int firstNodeUiqueId = 0;

    transient boolean head = false;
    transient boolean tail = false;

    int currentNodeUniqueId;
    Object currentNodeData;

    int nextNodeUniqueId;


    public AtiNode(int uniqueId, Object nodeData) {
        if (uniqueId == 0) {
            this.currentNodeUniqueId = firstNodeUiqueId;
            this.nextNodeUniqueId = firstNodeUiqueId + 1;
        } else {
            this.currentNodeUniqueId = nextNodeUniqueId;
            this.nextNodeUniqueId = currentNodeUniqueId + 1;
        }


        setTail(true);
        this.currentNodeData = nodeData;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public int getCurrentNodeUniqueId() {
        return currentNodeUniqueId;
    }

    public int getNextNodeUniqueId() {
        return nextNodeUniqueId;
    }
}