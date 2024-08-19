//add items to grocery list
// remove items from grocery list
// array 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // user input


public class GroceryList {
    public static void main(String[] args) {
        //run main code here
        GroceryStore storeObj = new GroceryStore();
        Scanner scannerObj = new Scanner(System.in);
        boolean exit = false; // this is a flag set as false
        // boolean can only be true or false
        // Menu --> list all options
        // perform based on options selected
        // keep in a loop until program exits
        while(!exit){
            System.out.println("\nGrocery list menu:"); // /n makes a new line
            System.out.println("1. Add an item");
            System.out.println("2. remove item");
            System.out.println("3. View list");
            System.out.println("4. Clear list");
            System.out.println("5. Exit program");
            System.out.println("choose an option:");
            int choice = scannerObj.nextInt();
            scannerObj.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter the item to add to the list");
                    String item = scannerObj.nextLine();
                    storeObj.addItems(item);
                    break;
                case 2:
                    System.out.println("Enter the item to remove from the list");
                    item = scannerObj.nextLine(); // dont need to say string anymore
                    storeObj.removeItems(item);
                    break;
                case 3:
                    storeObj.viewList();
                    break;
                case 4:
                    storeObj.clearList();
                    break;
                case 5:
                    exit = true;
                    System.out.println("exiting the program");
                    break;
            }
    }
    scannerObj.close();
        }
        

}

// running the main functionalities
class GroceryStore{
    public List<String> groceryList;    // initializes an empty string
    // constructor method --> initlizes
        // only called when u make an object of that class
    public GroceryStore(){
        this.groceryList = new ArrayList <>();
        // this makes the thing point to the class attribute
    }
    public void addItems(String item){
        String itemLower = item.toLowerCase();
        groceryList.add(itemLower);
        System.out.println(itemLower + " has been added to grocery list");
    }
    public void removeItems(String item){
        String itemLower = item.toLowerCase();
        if(groceryList.remove(itemLower) == true){
            System.out.println(itemLower + " has been removed from grocery list");
        }
        else{
            System.out.println(itemLower + " does not exist in the list, please try again");
        }
    }
    public void viewList(){
        if(groceryList.isEmpty()){
            System.out.println("grocery list is empty!");
        }
        else{
            System.out.println("Grocery List:");
        }

        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void clearList(){
        groceryList.clear();
        System.out.println("The grocery list has been cleared");
    }
}