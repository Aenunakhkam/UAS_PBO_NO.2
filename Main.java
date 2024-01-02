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
// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager, Developer, dan Designer
        Manager manager = new Manager("Aenun");
        Developer developer = new Developer("Dhayat");
        Designer designer = new Designer("Adip");

        // Memanggil metode work() pada setiap objek
        manager.work();
        developer.work();
        designer.work();
    }
}