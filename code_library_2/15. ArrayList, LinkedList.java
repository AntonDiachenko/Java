//The ArrayList class is a resizable array. The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified while elements can be added and removed from an ArrayList whenever you want. 

//Array Types
ArrayList<Integer> myNumbers = new ArrayList<Integer>();  
ArrayList<String> cars = new ArrayList<String>();


/*
cars.get(0);              --- Access an element
cars.set(0, "Opel");      --- change an element
cars.remove(0);           --- Remove an element
cars.clear();             --- Remove all element
cars.size();              --- find array size
Collections.sort(cars);   --- Sort cars (import java.util.Collections;)


//Array List
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
}}


//Loop through array elements
//For Loop
for (int i = 0; i < cars.size(); i++) {
  System.out.println(cars.get(i));
}

//for-each Loop
for (String i : cars) {
  System.out.println(i);
}


// LinkedList
The LinkedList class is just like ArrayList and is a collection of many objects which are of the same type. It has same methods as that of ArrayList class because they both implement the List interface. We can add items, change items, remove items and clear the list the same way.

How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

How the LinkedList works
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

//Usage
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.


LinkedList Methods
addFirst()      Adds an item to the beginning of the list.  
addLast()       Add an item to the end of the list  
removeFirst()   Remove an item from the beginning of the list.  
removeLast()    Remove an item from the end of the list 
getFirst()      Get the item at the beginning of the list 
getLast()       Get the item at the end of the list