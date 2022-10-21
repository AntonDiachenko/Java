public class SubClassSuperClassTester {
    public static void main(String[] args) {
        
        // rectangle objects
        Rectangle myRectangle1 = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(8, 6);

        // box objects
        Box myBox1 = new Box();
        Box myBox2 = new Box(10, 7, 3);

        System.out.println("My rectangle 1 is " + myRectangle1);
        System.out.println();
        System.out.println("My rectangle 2 is " + myRectangle2);
        
        // return the area of a rectangle 1 and 2
        System.out.println("The area of Rectangle 1 is " + myRectangle1.getArea());
        System.out.println("The area of Rectangle 2 is " + myRectangle2.getArea());

        System.out.println("************************");
        // return the area of box 1 and 2
        System.out.println("The area of box 1 is " + myBox1.getArea());
        System.out.println("The area of box 2 is " + myBox2.getArea());

        // return the volume of Box 1 and 2
        System.out.println("THe volume of Box 1 is " + myBox1.getVolume());
        System.out.println("THe volume of Box 2 is " + myBox2.getVolume());
        System.out.println(myRectangle2.toString());
        System.out.println(myBox2.toString());
    }
}
