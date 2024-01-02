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
// Manager.java
public class Manager extends Employee {
    // Constructor
    public Manager(String name) {
        super(name);
    }

    // Implementasi metode work() untuk Manager
    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing the team :)");
    }
}