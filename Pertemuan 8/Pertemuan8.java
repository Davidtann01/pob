/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[]) {
        ArrayList<String> names;
        names = new ArrayList();

        names.add("Luis");
        names.add("Nanno");
        names.add("Amy");
        names.add("Jannice");
        names.add(2, "Yuri");

        String str = names.get(0);
        System.out.println(str);
        
        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Luis");

        System.out.println(names);
}
    }