package com.company;
public class DBL {
    public static class Node{
        int data;
        Node next;
        Node prev;
    }
    public static class DoubleLinkedList {
        Node head;
        Node tail;

        public void insertLast(int data) {
            Node node = new Node();
            node.data = data;
            Node n = head;
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.prev = tail;
                tail.next = node;
                tail = node;
            }
        }

        public void insertFirst(int data) {
            Node node = new Node();
            node.data = data;
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
        }

        public void removeFirst() {
            head = head.next;
            head.prev = null;
        }

        public void removeLast() {
            tail = tail.prev;
            tail.next = null;
        }

        public void show() {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println();
        }

        public void show_reversed() {
            Node n = tail;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.prev;
            }
            System.out.println();
        }
    }
}

