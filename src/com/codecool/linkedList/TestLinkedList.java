package com.codecool.linkedList;

public class TestLinkedList {


    public static void main(String[] args) {
        int insertion = 1;
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println(singlyLinkedList.getHeadNode());
        singlyLinkedList.add(1);
        System.out.println(singlyLinkedList.getHeadNode().getNodeData());
        System.out.println(singlyLinkedList.getTailNode().getNodeData());
        singlyLinkedList.add(6);
        System.out.println(singlyLinkedList.getHeadNode().getNodeData());
        System.out.println(singlyLinkedList.getTailNode().getNodeData());

        System.out.println(singlyLinkedList.size());
        singlyLinkedList.insert(10, 999999);

        System.out.println(singlyLinkedList);
//        System.out.println(singlyLinkedList.size());
//        System.out.println(singlyLinkedList.get(2));

//        List<String> testLinkedList = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            testLinkedList.add(String.valueOf(i));
//        }
//
//        System.out.println(testLinkedList.getObject(1));
    }

}
