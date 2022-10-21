// Rectangle.java

// class declaration
public class Rectangle {
    // data member declaration
    private double length;
    private double width;

    // default constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // constructor with double parameters
    public Rectangle(double aLength, double aWidth) {
        // call setDimension
        setDimension(aLength, aWidth);
    }

    // define setDimension method
    public void setDimension(double theLength, double theWidth) {
        if (theLength >= 0) {
            this.length = theLength;
        } else {
            this.length = 0;
        }

        if (this.width >=0) {
            this.width = theWidth;            
        } else {
            this.width = 0;
        }        
    } // end method setDimension

    // return the length of a rectangle
    public double getLength() {
        return this.length;
    } 

    // return the width of a rectangle
    public double getWidth() {
        return this.width;
    } 

    // return area of a rectangle getArea
    public double getArea() {
        return length * width;
    }

    // return the perimeter
    public double getPerimeter() {
        return (length + width) * 2;
    }

    // return the dimension of a rectangle
    public String toString() {
        String str = "length: " + length + ", width: " + width;
        return str;
    }

} // end class