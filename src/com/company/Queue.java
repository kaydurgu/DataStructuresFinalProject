package com.company;

public class Queue<T>{
    public class Node<T>{
        T data;
        Node next;
        Node prev;
    }
    Node head;
    Node tail;
    public void push_back(T data){
        Node newNode =new Node();
        newNode.data = data;
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void push_front(T data){
        Node newNode = new Node();
        newNode.data = data;
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void pop_front(){
        if (head == null){
            System.out.println("Your Queue is empty");
        }
        else{
            if (head == tail){
                head = null;
                tail = null;
            }
            else{
                head = head.next;
                head.prev = null;
            }
        }
    }
    public void pop_back(){
        if (tail == null){
            System.out.println("Your Queue is empty");
        }
        else{
            if (head== tail){
                head = null;
                tail = null;
            }
            else{
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    public void clear(){
        head = null;
        tail = null;
    }
    public void printAll(){
        Node k = head;
        while (k!=null){
            System.out.println(k.data);
            k = k.next;
        }
    }
    public void front(){
        if (head==null){
            System.out.println("Your Queue is empty");
        }else{
            System.out.println(head.data);
        }
    }
    public void back(){
        if (tail == null){
            System.out.println("Your Queue is empty");
        }else{
            System.out.println(tail.data);
        }
    }
}