// payable interface test program processing invoices and employees (polymorphically)

public class PayableInterfaceTesterOne {

    
    public static void main(String[] args) {
        // create four-element payable array
        Payable[] payableObjects = new Payable[4];

        // populate array with objects that implement payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.95);
        payableObjects[1] = new Invoice("56789", "tire", 4, 125.95);
        
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-111-111", 1500.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "222-222-222", 1200.00);

        System.out.println("Invoices and EMployees payments");
        
        // process each element in array
        for ( Payable currentPayable : payableObjects) {
            // output currentPayable and its amount
            System.out.printf("%n %s %n %s: $%,.2f %n",
            currentPayable.toString(), "Payment due", currentPayable.getPaymentAmount() );
        }
    
    
    
    } // end main
    
} //end class
