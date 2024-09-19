package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

enum Operation {
    Exit, AddCricketer, RemoveCricketer, ModifyRole, SearchByRating, SortByName, DisplayAllCricketer;
}

public class CricketerTest {

    // List to hold Cricketers
    List<Cricketer> cricketers = new ArrayList<>();

    // Method to add cricketer
    public void addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
    }

    // Method to display all cricketers
    public void displayAllCricketers() {
        if (cricketers.isEmpty()) {
            System.out.println("No cricketers available.");
        } else {
            for (Cricketer cricketer : cricketers) {
                System.out.println(cricketer);
            }
        }
    }

    // Method to remove cricketer
    public void removeCricketer(String name) {
        cricketers.removeIf(cricketer -> cricketer.getName().equalsIgnoreCase(name));
    }

    // Method to modify role
    public void modifyRole(String name, Role newRole) {
        for (Cricketer cricketer : cricketers) {
            if (cricketer.getName().equalsIgnoreCase(name)) {
                cricketer.setRole(newRole.name());
                System.out.println("Role updated.");
                break;
            }
        }
    }

    // Method to search cricketer by rating
    public void searchByRating(double rating) {
        for (Cricketer cricketer : cricketers) {
            if (cricketer.getRating() == rating) {
                System.out.println(cricketer);
            }
        }
    }

    // Method to sort by name
    public void sortByName() {
        Collections.sort(cricketers);
        displayAllCricketers();
    }

    public static void main(String[] args) {
        CricketerTest cricketerTest = new CricketerTest();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice:");
            for (Operation op : Operation.values()) {
                System.out.println(op.ordinal() + ". " + op.name());
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            Operation op = Operation.values()[choice];

            switch (op) {
                case AddCricketer:
                    try {
                        System.out.println("Enter Name:");
                        String name = scanner.nextLine();

                        System.out.println("Enter Gender:");
                        String gender = scanner.nextLine();

                        System.out.println("Enter Age:");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter Email:");
                        String email = scanner.nextLine();

                        System.out.println("Enter Contact:");
                        long contact = scanner.nextLong();

                        System.out.println("Enter Rating (0-5):");
                        double rating = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("Enter Role (Batsman/Bowler):");
                        Role role = Role.valueOf(scanner.nextLine());

                        Cricketer cricketer = new Cricketer(name, gender, age, email, contact, rating, role);
                        cricketerTest.addCricketer(cricketer);

                    } catch (OverratedException | UnderratedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case RemoveCricketer:
                    System.out.println("Enter cricketer's name to remove:");
                    String nameToRemove = scanner.nextLine();
                    cricketerTest.removeCricketer(nameToRemove);
                    break;

                case ModifyRole:
                    System.out.println("Enter cricketer's name to modify role:");
                    String nameToModify = scanner.nextLine();

                    System.out.println("Enter new role (Batsman/Bowler):");
                    Role newRole = Role.valueOf(scanner.nextLine());

                    cricketerTest.modifyRole(nameToModify, newRole);
                    break;

                case SearchByRating:
                    System.out.println("Enter rating to search:");
                    double ratingToSearch = scanner.nextDouble();
                    cricketerTest.searchByRating(ratingToSearch);
                    break;

                case SortByName:
                    cricketerTest.sortByName();
                    break;

                case DisplayAllCricketer:
                    cricketerTest.displayAllCricketers();
                    break;

                case Exit:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
