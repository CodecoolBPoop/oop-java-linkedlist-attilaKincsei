package com.codecool.linkedList;

public class TestLinkedList {


    public static void main(String[] args) {
        int insertion = 1;
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println(singlyLinkedList.getHeadNode());
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);

        System.out.println(singlyLinkedList.size());
        System.out.println(singlyLinkedList);
        singlyLinkedList.remove(2);
        System.out.println(singlyLinkedList);
        System.out.println(singlyLinkedList.size());
    }

}
