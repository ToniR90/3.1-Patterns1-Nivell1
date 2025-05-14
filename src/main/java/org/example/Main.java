package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Undo undo = Undo.getInstance();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("Select an option:\n" +
                    "1. Add order\n" +
                    "2. Undo order\n" +
                    "3. Viwe all orders\n" +
                    "0. Exit\n");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter your order");
                    String order = sc.nextLine();
                    undo.addOrder(order);
                    break;
                case 2:
                    System.out.println("The last order has been deleted");
                    System.out.println(undo.deleteOrder());
                    break;
                case 3:
                    undo.printHistory();
                    break;

                case 0:
                    System.out.println("See you again!");
                    break;
            }
        }while(option != 0);




    }
}