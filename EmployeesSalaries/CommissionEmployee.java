package EmployeesSalaries;

// extends EMployee class

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    // constructor with 5 params
    public CommissionEmployee(String firstname, String lastname, String socialSecurityNnmber,
                            double grossSales, double commissionRate) {
        super(firstname, lastname, socialSecurityNnmber);

        if (commissionRate <= 0.0 || commissionRate>=1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 or < 1.0");
        }

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    } // end constructor

    // set gross sales amount
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    // return grossSales
    public double getGrossSales() {
        return grossSales;
    }

    // set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate>=1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 or < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    // return commission rate
    public double getCommissionRate(){
        return commissionRate;
    }

    // calculate earnings - override abstract method earnings in Employee class
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    } 

    // return string representation of commission employee
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
        "Commission employee", super.toString(), 
        "Gross sales", getGrossSales(),
        "COmmission rate", getCommissionRate() );
    }


}
