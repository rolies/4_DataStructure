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
public class project {
    project next;
    Employee supervisor;
    
    String projectName;
    boolean done;

    public project(String projectName, boolean done) {
        this.projectName = projectName;
        this.done = done;
    }
    
    
}
