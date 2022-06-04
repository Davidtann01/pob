/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Calculator2 {
     public double tax = .05;
    public double tip = .15;
    
    public void findTotal1(double price){
        double total = price*(1+tax+tip);
        System.out.println("$" +total);
    }
    
     // Modifikasi method, supaya bisa menerima argumen String name  
     public void findTotal2(String name, double price){
        double total = price*(1+tax+tip);
        System.out.println(name + ": $" + total);
    }

}
