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
// Designer.java
public class Designer extends Employee {
    // Constructor
    public Designer(String name) {
        super(name);
    }

    // Implementasi metode work() untuk Designer
    @Override
    public void work() {
        System.out.println("Designer " + getName() + " is designing and creating visuals :)");
    }
}