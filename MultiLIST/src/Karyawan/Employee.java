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
    String name;
    String contract;
    String address;
    int salary;

    public Employee(int id, String neme, String address, int salary) {
        this.id = id;
        this.name = neme;
        this.address = address;
        this.salary = salary;
    }

    public void destroy() {
        this.id = 0;
        this.name = null;
        this.address = null;
        this.salary = 0;
    }
    
    public void addKids(Kids newKids){
        if (noKids()) {
            this.kids = newKids;
        } else {
            Kids tempKids = this.kids;
            while (tempKids.next != null){
                tempKids = tempKids.next;
            }
            tempKids.next = newKids;
        }
    }
    public boolean noKids(){
        return(kids == null);
    }
}
