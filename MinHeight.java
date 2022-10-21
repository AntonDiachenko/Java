// 
/**
 * @author: Anton Diachenko
 * @date: MArch 9, 2022
 * @lastchanged:
 * @update:
 */

public class MinHeight {
    public static void main(String[] args) {
            int height, minHeight;
            String result;

            height = 200;
            minHeight = 121;

        // conditional operator 
        // variable_name = (condition) ? true_value : false_value;           
        result = (height > minHeight) ? "You are allowed on the ride" : "Sorry you do not meet the height requirements";

        System.out.println(result);
    } // end method main
} // end class 
