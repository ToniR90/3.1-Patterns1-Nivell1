package org.example;

import java.util.Stack;

public class Undo {

    private static Undo instance;
    private Stack<String> stack;

    private Undo(){
        stack = new Stack<>();
    }

    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder(String order){
         stack.push(order);
         System.out.println("Order added: " + order);
    }

    public String deleteOrder(){
        if(!stack.isEmpty()){
            return stack.pop();
        }
        return null;
    }

    public void printHistory() {
        if (stack.isEmpty()) {
            System.out.println("There's no orders");
            return;
        }

        System.out.println("Orders: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println((i + 1) + ": " + stack.get(i));
        }
    }

}