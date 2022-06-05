package org.example;

import java.util.ArrayList;

public class GroceryListMaker {
    private int [] numbers = new int[50];
    private ArrayList <String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " number of items");
        for( int i = 0; i < groceryList.size(); i ++){
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Items" + (position+1) + " has been modified");

    }
    public  void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);

        }

    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);

        }
    }
    public void removeGroceryItem(int position){
       // String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }

}
