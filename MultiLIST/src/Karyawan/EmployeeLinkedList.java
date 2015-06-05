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
public class EmployeeLinkedList {
    Employee first, last, temp;
    
    public boolean isEmpty(){
        return (this.first == null && null == this.last);
    }
    public void add(Employee newEmp){
        if (isEmpty()) {
            this.first = this.last = newEmp;
        } else {
            this.last.next = newEmp;
            this.last = newEmp;
        }
    }
    public void del(int id){ //del first
        if(isEmpty()){
            System.out.println("There is no employee data to be deleted");
        } else {
            temp = first;
            first = first.next;
            temp.destroy();
        }
        
    }
    public Employee getEmployee(int id){
        temp = first;
        while (temp != null){
            if (temp.id == id){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void update(int id, Employee updEmployee){
        
    }
    public void show() {
        temp = first;
        while (this.temp != null){
            System.out.println(temp.id+". "+temp.name+"; "+temp.address+"; "+temp.salary);
            temp = temp.next;
        }
    }
    public void showWithKids(){
        
    }
    
}
