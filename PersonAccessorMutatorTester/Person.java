public class Person {
    
    private String name;
    private int age;
    private double height;

    public Person() {
        this.name = "";
        this.age = 0;
        this.height = 0;
    }

    public Person(String aName, int anAge, double aHeight) {
        setName(aName);
        setAge(anAge);
        setHeight(aHeight);
    }

    // setter (mutator) methods
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    // getter (accessor) methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public void allowedToEnter () {
        if (this.age >=18) {
            System.out.println("The person is allowed to enter");
        } 
        else {
            System.out.println("The person is NOT allowed to enter");
        }
    }

    public String toString() {
        String myString = "The person " + this.name
                        + " is " + this.age + " years old"
                        + " and " + this.height + " ft tall.";
        return myString;
    }
}
