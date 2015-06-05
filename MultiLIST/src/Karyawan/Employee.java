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
public class Employee {
    Employee next;
    Kids kids;
    
    int id;
    String neme;
    String contract;
    String address;
    int salary;

    public Employee(int id, String neme, String address, int salary) {
        this.id = id;
        this.neme = neme;
        this.address = address;
        this.salary = salary;
    }
    
    
}
