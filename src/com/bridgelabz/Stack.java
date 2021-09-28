package com.bridgelabz;

public class Stack<T> {
    Node top=null;


    public void push(T data){
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
    public void pop(){
        if(top==null){
            System.out.println("Stack is empty:");
        }

        else{
            Node temp=top;
            while(temp.next.next!=null){
                temp=temp.next;


            }
            System.out.println(temp.next.data+"is pop:");
            temp.next=null;
        }
    }


    public void display(){
        if(top==null){
            System.out.println("stack underflow");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }
}
