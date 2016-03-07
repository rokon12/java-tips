package com.bazlur.tips;

import java.util.Scanner;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/4/16.
 */
public class Employee {
    private int employeeId;
    private String name;
    private String address;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("How many employee you want to input: ");

        int size = scr.nextInt();

        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            System.out.println("ID ["+ (i+1) + "]: ");
            int id = scr.nextInt();
            System.out.println("Name ["+ (i+1) + "]: ");
            String name = scr.nextLine();
            System.out.println("Address ["+ (i+1) + "]: ");
            String address  = scr.nextLine();

            Employee employee = new Employee();
            employee.setEmployeeId(id);
            employee.setName(name);
            employee.setAddress(address);

            employees[i] = employee;
        }

        System.out.println("Your employees: ");
        for (int i = 0; i < size; i++) {
            System.out.println("ID:" + employees[i].getEmployeeId());
            System.out.println("Name:" + employees[i].getName());
            System.out.println("Address:" + employees[i].getAddress());
        }



    }
}
