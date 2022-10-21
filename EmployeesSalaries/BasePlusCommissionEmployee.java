package EmployeesSalaries;

// BasePlusCommissionEmployee class extends CommissionEmployee class

public class BasePlusCommissionEmployee extends CommissionEmployee{
    // declare data member
    private double baseSalary;

    // constructor
    public BasePlusCommissionEmployee(String firstname, String lastname, String socialSecurityNumber, 
        double grossSales, double commissionRate, double baseSalary) {
            super(firstname, lastname, socialSecurityNumber, grossSales, commissionRate);
            if (baseSalary < 0.0) {
                throw new IllegalArgumentException("Base salary must be >= 0.0");
            }
            this.baseSalary = baseSalary;                    
    } // end constructor

    // set base salary
    public void setBaseSalary (double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;  
    }

    // get base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    // calculate earnings - override method earnings in CommissionEMployee class
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", 
        "Base salaried", super.toString(),
        "Base salary", getBaseSalary() );
    }

}
