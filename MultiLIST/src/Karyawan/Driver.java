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
        Employee karyawan = new Employee(1, "Employee 1", "Riau", 80000000);
        karyawan.next = new Employee(2, "Employee 2", "Semarang", 20000000);
        karyawan.next.next = new Employee(3, "Employee 3", "pekan", 29000000);
        
        karyawan.kids = new Kids("sekudel", 10, 2);
        karyawan.kids.next = new Kids("ahmed", 8, 3);
        
        karyawan.next.kids = new Kids("deden", 10, 2);
        
        //Show all Kids of particular employess
        Kids temp = karyawan.kids.next;
        while (temp != null){
            System.out.println("The name of kids is: "+temp.name);
            temp = temp.next;
        }
        System.out.println("==============================");
        project proj1 = new project("C sharp", true);
        proj1.next = new project ("Java Implementation", true);
        proj1.next.next = new project ("Xamarin iOS", false);
        proj1.next.next.next = new project ("Polymmer material", false);
        proj1.next.next.next.next = new project ("Material GUI", false);
        proj1.next.next.next.next.next = new project ("CV Resume", false);
        
        proj1.supervisor = karyawan;
        proj1.next.supervisor = karyawan.next;
        proj1.next.next.supervisor = karyawan;
        proj1.next.next.next.supervisor = karyawan.next.next;
        proj1.next.next.next.next.supervisor = karyawan.next;
        proj1.next.next.next.next.next.supervisor = karyawan.next.next;
        
        project tempProject = proj1;
        while (tempProject != null) {
            if (tempProject.done == true && tempProject.supervisor == karyawan)
            System.out.println("Supervisior "+tempProject.supervisor+" create : "+tempProject.projectName);
        tempProject = tempProject.next;
        }
        System.out.println("====================================");
    }
}
