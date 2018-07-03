package com.codecool.linkedList;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    static List testLinkedList = new LinkedList();


    public static void main(String[] args) {

        List<Integer> testALiList = new AtiLinkedList<Integer>();
        for (int i = 1; i < 11; i++) {
            testALiList.add(i);
        }
        System.out.println(testALiList);
    }

}
