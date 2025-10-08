package com.devtalles.proyect.datastore;


import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args){
        System.out.println("Starting structure");

        User user1 = new User("1", "Camilo");
        User user2 = new User("2", "Ancizar");
        User user3 = new User("3", "Gabriel");
        User user4 = new User("4", "Juan");
        User user5 = new User("5", "Javier");
        User user6 = new User("6", "Samuel");

        DataStore<String, String> usersDS = new DataStore<>();
        System.out.println("Agregando usuarios...");
        try{
            usersDS.add(user1.getId(), user1.getName());
            usersDS.add(user2.getId(), user2.getName());
            usersDS.add(user3.getId(), user3.getName());
            usersDS.add(user4.getId(), user4.getName());
            usersDS.add(user5.getId(), user5.getName());
            usersDS.add(user6.getId(), user6.getName());
            System.out.println(" ");
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
            System.out.println(" ");
        }



        try{
            System.out.println("Usuarios agregados: " + usersDS.getAll());
            System.out.println(" ");
        } catch (NoSuchElementException e){
            System.out.println(e.getMessage());
            System.out.println(" ");
        }



        System.out.println("Buscar usuario por id...");
        System.out.println("Usuario: " + usersDS.find(user1.getId()));
        System.out.println(" ");

        System.out.println("Eliminando usuario con id: " + user3.getId());
        usersDS.remove(user5.getId(), user3.getName());
        System.out.println(" ");

        try{
            System.out.println("Usuarios agregados: " + usersDS.getAll());
            System.out.println(" ");
        } catch (NoSuchElementException e){
            System.out.println(e.getMessage());
            System.out.println(" ");
        }





    }
}
