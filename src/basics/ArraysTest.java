/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author ADIM
 */
public class ArraysTest {
    public static void main (String[] args) {
        String[] places = {"Obanikoro", "Ojuelegba", "Mushin"};
        System.out.println(places[0]);
        
        String[] areas = new String[3];
        areas[0] = "Iyana Ipaja";
        areas[1] = "Okokomaiko";
        areas[2] = "Scunthrope";
        System.out.println(areas[2]);
        
        String[] contries;
        contries = new String[2];
        contries[0] = "Nigeria";
        contries[1] = "Ghana";
        System.out.println(contries[0]);
    }
}
