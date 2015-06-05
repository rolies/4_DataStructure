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
public class Kids {
    Kids next;
    String name;
    int age;
    int status;

    public Kids(String name, int age, int status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }
}
