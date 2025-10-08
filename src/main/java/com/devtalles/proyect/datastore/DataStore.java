package com.devtalles.proyect.datastore;

import java.util.*;

public class DataStore<T, K> {
    private final List<T> usersNames = new LinkedList<>();
    private final Map<K, T> users = new HashMap<>();

    public void add(K key, T item)throws NoSuchElementException {
        if(!users.containsKey(key)){
            users.put(key, item);
            usersNames.add(item);
            System.out.println("User has been added successfully");

        } else {
            throw new NoSuchElementException("The user with ID: " + key + " already exists.");
        }
    }

    public void remove(K key, T item)throws NoSuchElementException {
        if(users.containsKey(key)){
            users.remove(key);
            usersNames.remove(item);
            System.out.println("The user has been deleted succesfully");
        } else {
            throw new NoSuchElementException("User with ID: " + key + " don't exists.");
        }
    }

    public T find(K key){
        if(users.containsKey(key)){
            return users.get(key);
        }
        return null;
    }

    public List<T> getAll()throws NoSuchElementException{
        if(!usersNames.isEmpty()){
            return usersNames;
        } else {
            throw new NoSuchElementException("There arent data.");
        }
    }

}
