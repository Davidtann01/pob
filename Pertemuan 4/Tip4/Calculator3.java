/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price, String name){
        double total = price*(1+tax+tip);
        System.out.println(name +": $" +total);

    }
}
