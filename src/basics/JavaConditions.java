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
public class JavaConditions {
    public static void main(String[] args){
        String name = "Adim Peter";
        int age = 16;
        double strength = 30.3;
        boolean isHuman = false;
        
        System.out.println("Hello, my name is " + name + " i am " +  age + " years old ");
        if(strength >= 20){
            System.out.println("I am very strong! ");
        }
        else{
            System.out.println("I am not so strong...chai");
        }
        
        if(isHuman){
            System.out.println("I am a human being");
        }
        else{
            System.out.println("I am a robot");
        }
    }
}
