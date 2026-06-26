package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // implement algorithm here
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("John", "Smith", (byte) 25);
        System.out.println("User with name - John added to the database");

        userService.saveUser("Anna", "Brown", (byte) 22);
        System.out.println("User with name - Anna added to the database");

        userService.saveUser("Mike", "Wilson", (byte) 30);
        System.out.println("User with name - Mike added to the database");

        userService.saveUser("Lisa", "Taylor", (byte) 28);
        System.out.println("User with name - Lisa added to the database");

        System.out.println("\nAll users:");
        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
    }

