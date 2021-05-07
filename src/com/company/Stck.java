package com.company;


public class Stck<T>{
    public class Node<T>{
        T data;
        Node prev;
    }
    private Node tail;
    private int sz;
    public void push(T data){
        Node newNode = new Node();
        newNode.data = data;
        if (tail == null){
            tail = newNode;
            sz++;
        }
        else{
            newNode.prev = tail;
            tail = newNode;
            sz++;
        }
    }
    // We can optimiz O(1) this method by adding head node
    //works O(newStack.size())
    public void pushStack(Stck newStack){
        Node newTail= newStack.tail;
        while (newTail.prev!=null){
            newTail = newTail.prev;
        }
        sz+=newStack.sz;
        newTail.prev = tail;
        tail = newStack.tail;
    }
    public int size(){
        return sz;
    }
    public void pop(){
        if (tail == null){
            System.out.println("Can't Pop Stack is Empty");
            return ;
        }
        tail = tail.prev;
    }
    public void printAll(){
        Node k = tail;
        while (k!=null){
            System.out.println(k.data);
            k = k.prev;
        }
    }
    public void peek(){
        if (tail == null){
            System.out.println("Stack is Empty.");
            return;
        }
        System.out.println(tail.data);
    }
    public void clear(){
        tail = null;sz = 0;
    }
}