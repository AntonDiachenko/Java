// ComparingStrings.java 

/**
 * @author: Khattar
 * @date: MArch 9, 2022
 * @lastchanged:
 * @update: 
 */

public class ComparingStrings {
    public static void main(String[] args) {
        String myCat = new String("cat");
        String myDog = new String("dog");

        if(myCat.equals(myDog)) {
            System.out.println("Cats and Dogs are the same");
        } else {
            System.out.println("Cats and Dogs are not the same");
        }

    } // end method main
} // end class 
