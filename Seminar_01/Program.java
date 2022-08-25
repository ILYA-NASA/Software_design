package Seminar_01;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Magician> allMagican = new ArrayList<>();
        while (allMagican.size() < 15) {
            allMagican.add(new Magician("Vasya"));
        }
     
        // System.out.println(Magician.getName()); 
     
        for (Magician magician : allMagican) {
            System.out.println(magician.getName());
        }
    }
}
