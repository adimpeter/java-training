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
public class SumToNumber {
    public static void main(String[] args){
        System.out.println(sumToNumber(10));
    }
    
    public static int sumToNumber(int n){
        if(n > 0){
            return ((n) + sumToNumber(n - 1));
        }
        
        return n;
    }
}
