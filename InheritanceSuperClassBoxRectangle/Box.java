public class Box extends Rectangle {
    // declaration Box data members
    private double height;

    // box default constructor
    public Box() {
        super();
        this.height = 0;
    }

    // constructor box with parameters
    public Box(double alength, double aWidth, double aHeight) {
        super.setDimension(alength, aWidth);
        this.height = aHeight;
    }

    // define Box setDimension method
    public void setDimension (double theLength, double theWidth, double theHeight) {
        super.setDimension(theLength, theWidth);
        if (theHeight >= 0) {
            this.height = theHeight;
        } else {
            this.height = 0;
        }
    }

    // return the height of a box
    public double getHeight() {
        return this.height;
    }

    // return the area of the box
    public double getArea() {
        // surface area  = 2 x (length x width + length x height + width x height)
        double area = 2 * (getLength()*getWidth() + getLength()*height + getWidth()*height);
        return area;
    }

    // return the volume 
    public double getVolume() {
        // return getArea() * height; 
        return super.getArea() * height;
    }

    public String toString() {
       return super.toString() + ", height: " + height;
    }



} // end class box
