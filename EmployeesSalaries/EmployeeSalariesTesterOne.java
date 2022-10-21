package EmployeesSalaries;

public class EmployeeSalariesTesterOne {
    public static void main(String[] args) {
        // create employee objects

        // 1. salaried employee
        SalariedEmployee salariedEmployee = new SalariedEmployee ("John", "Smith", "123-456789", 1500.00);
        // 2. hourly employee
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "234-567890", 18.85, 40);
        // 3. commision employee
        CommissionEmployee commissionEmployee = new CommissionEmployee("David", "Campbell", "345-678901", 20000, 0.6);
        // 4. Base Plus commission employee
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Mary", "Christmas", "456-789012", 10000, 0.4, 1000);

        System.out.println("Employees processed individually");
        System.out.printf("%n %s %n %s: $%,.2f %n %n", salariedEmployee, " earned ", salariedEmployee.earnings());
        System.out.printf("%n %s %n %s: $%,.2f %n %n", hourlyEmployee, " earned ", hourlyEmployee.earnings());
        System.out.printf("%n %s %n %s: $%,.2f %n %n", commissionEmployee, " earned ", commissionEmployee.earnings());
        System.out.printf("%n %s %n %s: $%,.2f %n %n", basePlusCommissionEmployee, " earned ", basePlusCommissionEmployee.earnings());

        // create four-element employee array
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee; 

        System.out.println("Employees process polymorphically:");
        // processing each element in array 
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invoke toString() method

              // determined whether an element is a basePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee)currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f %n", 
                employee.getBaseSalary() );
            }
            System.out.printf(" earned $%,.2f %n", currentEmployee.earnings() );
        } // end of loop

        // get type name of each object in employee array
        for (int counter = 0; counter < employees.length; counter++) {
            System.out.printf("Employee %d is a %s %n", counter, employees[counter].getClass().getName() );
        }


    } // end method main
}
