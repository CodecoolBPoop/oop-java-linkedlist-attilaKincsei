package com.codecool.linkedList;

import java.util.ArrayList;
import java.util.List;

public class TestLinkedList {


    public static void main(String[] args) {
        MyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        System.out.println(doublyLinkedList.getHeadNode());
        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        doublyLinkedList.add(4);
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);

        System.out.println(doublyLinkedList.size());
        System.out.println(doublyLinkedList);
        doublyLinkedList.remove(doublyLinkedList.size() - 1);
        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.getNode(doublyLinkedList.size() - 1).getNextNode());
//        doublyLinkedList.remove(2);
//        doublyLinkedList.insert(0, 111);
//        System.out.println(doublyLinkedList);
//        System.out.println(doublyLinkedList.size());


    }

}
