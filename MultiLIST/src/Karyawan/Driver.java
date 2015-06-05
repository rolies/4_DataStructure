/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;

/**
 *
 * @author bima
 */
public class Driver {
    public static void main(String[] args) {
        EmployeeLinkedList empData = new EmployeeLinkedList();
        
        empData.add(new Employee(1, "Andre", "Semarang", 2000000));
        empData.add(new Employee(2, "ahmed", "paki", 3000000));
        empData.add(new Employee(3, "Anand", "india", 4000000));
        empData.add(new Employee(4, "John dew", "Florida", 5000000));
        empData.add(new Employee(5, "Kemal", "Turkey", 6000000));
        empData.add(new Employee(6, "Mohammadi", "Iran", 3000000));
        
        Employee emp = empData.getEmployee(5);
        
        emp.name = "Tarno";
        emp.address = "Demak";
        
        empData.show();
    }
}
