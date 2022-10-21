import java.util.ArrayList;

// ArrayListCollection.java
// purpose: generic ArrayList<T> collection demo

public class ArrayListCollection {
    public static void main(String[] args) {
        // create a new arrayList of string with an initial capacity of 10
        ArrayList<String> items = new ArrayList<>();

        // display items list
        displayItems(items, "Display default values: ");

        // add a few elements
        // object_name.method_name()
        items.add("red"); // append an item to the list
        items.add(0, "yellow");

        // display the header
        System.out.println("Display list contents with counter controlled loop");
        // display the colors in the list
        for (int color = 0; color < items.size(); color++) {
            System.out.printf(" %s", items.get(color));
        }

        // display colors using for each loop
        displayItems(items, "%nDisplay list contents with for-each loop ");

        // add more items
        items.add("green"); // add green color to the end of the list
        items.add("yellow"); // add yellow color to the end of the list

        // display new items
        displayItems(items, "List with new elements: ");

        // remove the first yellow color
        items.remove("yellow");

        // display items after removing first yellow color
        displayItems(items, "List first instance of yellow: ");

        // remove the item at index 1
        items.remove(1);
        displayItems(items, "List second list element (green): "); 
        
        // check if a value is in the list 
        items.add("blue");
        System.out.printf("\"blue\" is %s in the list %n", items.contains("blue"));

        // display the number of elements in the list
        System.out.printf("Size of the items list:  %s %n", items.size());

        // remove all elements
        items.clear();

        // display the number of elements in the list
        System.out.printf("Size of the items list after using clear method: %s %n", items.size());

    } // end method main

    // display the ArrayList's elements on the console
    public static void displayItems(ArrayList<String> items, String header) {
        System.out.printf(header);

        // display each element in the items list
        for (String item : items) {
            System.out.printf(" %s", item);
        } // end for Lookup
        System.out.println();
    } // end method displayItems

} // end class ArrayListCollection