package com.bridgelabz;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean status=true;
        do {
            System.out.println("enter choice:\n1:Enqueue:\n2:Dequeue:\n3:Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    queue.enqueue(20);
                    queue.enqueue(15);
                    queue.enqueue(13);
                    queue.display();
                    break;

                case 2:
                    queue.dequeue();
                    //queue.dequeue();
                    queue.display();
                    break;

                case 3:
                    status=false;
                    break;
            }
        }while(status);
    }
}