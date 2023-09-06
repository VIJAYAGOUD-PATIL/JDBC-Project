package com.vijaypatil;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee newEmployee) throws SQLException;
    void updateEmployee(Employee updateEmployee) throws SQLException;
    void deleteEmployee(int id) throws SQLException;
    List<Employee> getEmployees() throws SQLException;
    Employee getEmployeeById(int id) throws SQLException;
}
