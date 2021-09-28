package com.bridgelabz;

public class Queue<T> {
    Node top=null;
    Node rear=null;

    public void enqueue(T data){
        Node newnode=new Node(data);
        if(top==null){
            top=newnode;
        }
        else{
            Node temp=top;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void dequeue(){
        if(top==null){
            System.out.println("queue is underflow");
        }
        top=top.next;
        if(top.next==null){
            rear=null;

        }

    }


    public void display(){
        if(top==null){
            System.out.println("queue is empty");
        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
                }
        }
    }

}
