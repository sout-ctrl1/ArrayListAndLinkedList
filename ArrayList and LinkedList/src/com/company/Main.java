package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int MAX_VAL = 5000;
    static long time = System.nanoTime();

    static List<Integer> linkedList = new LinkedList<Integer>();
    static List<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) {
        createList();
        addArrayListHead();
        addLinkedListHead();
        System.out.println();
        addArrayListMiddle();
        addLinkedListMiddle();
        System.out.println();
        addArrayListEnd();
        addLinkedListEnd();

    }
    public static void createList() {
        for ( int i = 0; i < MAX_VAL; i++ ) {
            linkedList.add(i);
            arrayList.add(i);
        }
    }
    public static void addLinkedListMiddle() {
        for ( int i = 0; i < MAX_VAL; i++ ) {
            linkedList.add(MAX_VAL / 2, i);
        }
        System.out.println("LinkedList in the middle time:\t" + (System.nanoTime() - time));
    }

    public static void addArrayListMiddle() {
        for ( int i = 0; i < MAX_VAL; i++ ) {
            arrayList.add(MAX_VAL / 2, i);
        }
        System.out.println("ArrayList in the middle time:\t" + (System.nanoTime() - time));
    }

    public static void addLinkedListHead() {
        for ( int i = 0; i < MAX_VAL; i++ ) {
            linkedList.add(linkedList.get(0), i);
        }
        System.out.println("LinkedList in the head time:\t" + (System.nanoTime() - time));
    }

    public static void addArrayListHead() {
        for ( int i = 0; i < MAX_VAL; i++ ) {
            arrayList.add(arrayList.get(0), i);
        }
        System.out.println("ArrayList in the head time:\t" + (System.nanoTime() - time));
    }

    public static void addLinkedListEnd() {
        for ( int i = 0; i < MAX_VAL; i++ ) {
            linkedList.add(MAX_VAL - 1, i);
        }
        System.out.println("LinkedList in the end time:\t" + (System.nanoTime() - time));
    }

    public static void addArrayListEnd() {
        for ( int i = 0; i < MAX_VAL; i++ ) {
            arrayList.add(MAX_VAL - 1, i);
        }
        System.out.println("ArrayList in the end time:\t" + (System.nanoTime() - time));
    }
}

