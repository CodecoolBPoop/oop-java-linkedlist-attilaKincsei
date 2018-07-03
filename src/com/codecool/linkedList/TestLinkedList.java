package com.codecool.linkedList;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {


    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(111);
        singlyLinkedList.add(112);
        singlyLinkedList.add(113);
        singlyLinkedList.add(113111);
        System.out.println(singlyLinkedList);
        System.out.println(singlyLinkedList.size());
        System.out.println(singlyLinkedList.get(3));

//        List<Integer> testLinkedList = new LinkedList<>();
//        for (Integer i = 0; i < 10; i++) {
//            testLinkedList.add(i);
//        }
//        System.out.println(testLinkedList.get(-1));
    }

}
