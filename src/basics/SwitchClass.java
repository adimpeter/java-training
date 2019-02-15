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
public class SwitchClass {
    private static String score = "B";
    
    public static void main (String[] args){
        switch(score){
            case "A": System.out.println("High Score Yessss"); break;
            case "B": System.out.println("Okey Score"); break;
            case "C": System.out.println("Average Score"); break;
            case "D": System.out.println("Low Score Noooooo"); break;
            default: System.out.println("This score is under inspection");
        }
    }
}
