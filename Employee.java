/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jawab_2;

/**
 *
 * @author MataNet
 */
// Employee.java
public class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Work method to be implemented by subclasses
    public void work() {
        System.out.println("Employee " + name + " is working :)");
    }
}