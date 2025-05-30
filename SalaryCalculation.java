package com.college.students;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SalaryCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter total hours worked per week: ");
        double hoursWorked = scanner.nextDouble();

        double weeklySalary;
        if (hoursWorked <= 40) {
            weeklySalary = hourlyRate * hoursWorked;
        } else {
            double regularPay = 40 * hourlyRate;
            double overtimePay = (hoursWorked - 40) * hourlyRate * 1.5;
            weeklySalary = regularPay + overtimePay;
        }

        double monthlySalary = weeklySalary * 4;

        double tax = monthlySalary * 0.10;
        double netSalary = monthlySalary - tax;

        System.out.printf("Monthly Salary after 10%% tax deduction: %.2f\n", netSalary);
        scanner.close();
    }

}
