
// invoice class that implements Payable interface

public class Invoice implements Payable{
    // data members
    private final String productNumber;
    private final String productDescription;
    private int quantity;
    private double unitPrice;

    // constructor with parameters
    public Invoice(String prodNumber, String prodDesc, int qty, double unPrice) {
        // validate data
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be greater than or equal to zero");            
        }

        if (unitPrice < 0.0) {
            throw new IllegalArgumentException("Unit price must be greater than or equal to zero");
        }
        this.quantity = qty;
        this.unitPrice = unPrice;
        this.productNumber = prodNumber;
        this.productDescription = prodDesc;
    } // end constructor

    // setter method
    public void setQuantity(int quantity) {
        if(quantity < 0) {
            throw new IllegalArgumentException("Quanitty must be greater than or equal to zero");
        }
        this.quantity = quantity;
    }

    // set unit price
    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0.0) {
            throw new IllegalArgumentException("Unit price must be greater than or equal to zero");
        }
        this.unitPrice = unitPrice;
    }

    // accessor method
    public String getProductNumber() {
        return this.productNumber;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public int getQuantity() {
        return this.quantity;
    } 

    public double getUnitPrice() {
        return this.unitPrice;
    } // end accessor methods

    // return String representation of invoice object
    @Override
    public String toString() {
        return String.format("%s: %n %s: %s (%s) %n %s: %d %n %s: $%,.2f", 
        "Invoice", "product Number", getProductNumber(), getProductDescription(), 
        "Quantity", getQuantity(), "Unit Price", getUnitPrice() );
    }

    // implement getPaymentAmount method - required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount() {
        double totalCost = getQuantity() * getUnitPrice();
        return totalCost;
    }
    
} // end class
