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
// Developer.java
public class Developer extends Employee {
    // Constructor
    public Developer(String name) {
        super(name);
    }

    // Implementasi metode work() untuk Developer
    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is coding and developing system :)");
    }
}