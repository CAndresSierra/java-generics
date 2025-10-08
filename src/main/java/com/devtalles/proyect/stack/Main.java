package com.devtalles.proyect.stack;

public class Main {
    public static void main(String[] args){
      Stack<Integer> integerStack = new Stack<>();

      integerStack.push(1);
      integerStack.push(2);
      integerStack.push(3);

      Stack<String> stringStack = new Stack<>();

      stringStack.push("Camilo");
      stringStack.push("Ancizar");

      integerStack.print();
      System.out.println(" ");
      stringStack.print();

        System.out.println("Elemento en la cima: " + integerStack.peek());

        System.out.println("Eliminar un elemento: " + integerStack.pop());

        integerStack.print();



    }
}
