package com.vijaypatil;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws SQLException {


        // employee dao
        EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("*******************************");
            System.out.println("Select from the options below");
            System.out.println("*******************************");
            System.out.println("PRESS 1: Add Employee");
            System.out.println("PRESS 2: Update Employee");
            System.out.println("PRESS 3: Delete Employee");
            System.out.println("PRESS 4: Get All Employee");
            System.out.println("PRESS 5: Get Employee By Id");
            System.out.println("PRESS 6: Exit");
            System.out.println("*******************************");

            System.out.println("Select from the options as per Above : ");

            int input = scanner.nextInt();
            switch (input) {
                case 1: {
                    // add
                    System.out.print("Enter Id: ");
                    int id= scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee();
                    employee.setId(id);
                    employee.setName(name);
                    employee.setEmail(email);
                    employeeDao.addEmployee(employee);
                    break;
                }
                case 2: {
                    // update
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee(id, name, email);
                    employeeDao.updateEmployee(employee);
                    break;
                }
                case 3: {
                    // delete
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    employeeDao.deleteEmployee(id);
                    break;
                }
                case 4: {
                    // get all
                    List<Employee> employeeList = employeeDao.getEmployees();
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;
                }
                case 5: {
                    // get by id
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    Employee employee =  employeeDao.getEmployeeById(id);
                    System.out.println(employee);
                    break;
                }
                case 6: {
                    // exit
                    System.out.println("Thank you");
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                }
                default:
                    System.out.println("Choose between 1 - 6");
            }
        }
    }
}
