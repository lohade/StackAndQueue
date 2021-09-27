package com.bridgelabz;

public class Stack<T> {
    Node head=null;


    public void push(T data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void pop(){
        if(head==null){
            System.out.println("Stack is empty:");
        }
        else if(head.next==null){
            System.out.println(head+"is pop:");
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            System.out.println(temp.next.data+"is pop:");
            temp.next=null;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
