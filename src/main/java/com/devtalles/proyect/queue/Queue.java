package com.devtalles.proyect.queue;

import java.util.LinkedList;


public class Queue <T> {
    private final LinkedList<T> elements = new LinkedList<>();

    public void endQueue(T element){
        elements.addLast(element);
    }
}
