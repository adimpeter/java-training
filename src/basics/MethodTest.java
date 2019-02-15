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
public class MethodTest {
    
    public static void main(String[] args){
        int numA = 17;
        int numB = 25;
        
        showNumber();
        addNumbers(numA, numB);
        
        int numberReturned = doubleNumber(numB);
        System.out.println("Number doubled is: " + numberReturned);
    }
    
    public static void showNumber(){
        System.out.println("Number of the day is: " + 17);
    } 
    public static void addNumbers(int numberA, int numberB){
        int sum = numberA + numberB;
        System.out.println("Result of adding " + numberA + " + " + numberB + " is " + sum);
    }
    public static int doubleNumber(int number){
        return number * number;
    }
}


