package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryListMaker groceryListMaker = new GroceryListMaker();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryListMaker.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }

        }

    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice option");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - TO add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - TO remove an item from the list");
        System.out.println("\t 5 - TO search for an item on the list");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryListMaker.addGroceryItem(scanner.nextLine());

    }
    public static void modify(){
        System.out.println("Current Item Name: ");
        String itemNumber = scanner.nextLine();
        System.out.println("Enter new item ");
        String newItem = scanner.nextLine();
        groceryListMaker.modifyGroceryItem(itemNumber  , newItem);
    }

    public static void removeItem(){
        System.out.println("enter item name: ");
        String itemNumber = scanner.nextLine();
        groceryListMaker.removeGroceryItem(itemNumber);

    }
    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryListMaker.onFile(searchItem)){
            System.out.println("Found Item");
        } else{
            System.out.println(searchItem + "not on list");
        }
    }

   //another method that can be used to copy array list.
    public static void processArrayList(){
        ArrayList <String> newArray = new ArrayList<String>();
        newArray.addAll(groceryListMaker.getGroceryList());
    }


}
