package com.codecool.linkedList;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {


    public static void main(String[] args) {

        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add("asd");
        singlyLinkedList.add("fffff");
        singlyLinkedList.add("bbbbb");
        singlyLinkedList.add("ggggg");
        System.out.println(singlyLinkedList);
        System.out.println(singlyLinkedList.size());
        System.out.println(singlyLinkedList.get(3));

//        List<String> testLinkedList = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            testLinkedList.add(String.valueOf(i));
//        }
//
//        System.out.println(testLinkedList.get(1));
    }

}
