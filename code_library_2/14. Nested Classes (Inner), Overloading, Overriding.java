/*Inner Classes (Nested Classes)
The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable. To access the inner class, create an object of the outer class, and then create an object of the inner class. */

class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;}
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);}					--- o/p: 15
}


//Private or Protected Inner Class
//A Nested class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:

class OuterClass {
  int x = 10;
  private class InnerClass {
    int y = 5;}
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass(); 			---	o/p: ERROR
    System.out.println(myInner.y + myOuter.x);}
}


//Static Inner Class
//A Nested class can also be static, which means that you can access it without creating an object of the outer class:

class OuterClass {
  int x = 10;
  static class InnerClass {
    int y = 5;}
}

public class Main {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();		--- o/p: 5
    System.out.println(myInner.y);}
}