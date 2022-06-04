/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prisionertest;

/**
 *
 * @author USER
 */
public class PrisionerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Prisioner bubba = new Prisioner();
Prisioner twitch = new Prisioner();
  
    System.out.println(bubba == twitch); //false
    bubba.think();
    twitch.think();
}//end method main
}//end class PrisionerTest


