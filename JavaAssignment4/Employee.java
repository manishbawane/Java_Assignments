package JavaAssignment4;

import java.util.Scanner;

class Employee {
    private double salary;
    private int hoursOfWork;

    
    public void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

  
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

   
    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    
    public double getFinalSalary() {
        return salary;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the number of hours of work per day: ");
        int hoursOfWork = scanner.nextInt();
        
       
        Employee employee = new Employee();
        employee.getInfo(salary, hoursOfWork);
        
       
        employee.addSal();
        employee.addWork();
        
        
        System.out.printf("The final salary of the employee is: $%.2f\n", employee.getFinalSalary());
        
        scanner.close();
    }
}
