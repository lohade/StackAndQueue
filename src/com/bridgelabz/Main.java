package com.bridgelabz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack stack=new Stack();
        boolean status=true;
        do{
            System.out.println("enter choice to operation:\n1:push element:\n2:pop the element:\n2:Exit ");
            int ch= scanner.nextInt();
            switch(ch) {
                case 1:
                    boolean add = true;
                    while (add) {
                        System.out.println("enter number:");
                        int data = scanner.nextInt();
                        stack.push(data);
                        System.out.println("enter 1 to add else 0:");
                        int choice = scanner.nextInt();
                        if (choice == 1) {
                            add = true;
                        } else
                            add = false;
                    }
                    stack.display();
                    break;


                case 2:
                    status = false;
                    break;
            }
        }while(status);
    }
}
