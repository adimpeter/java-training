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
public class fibonnaci {
    public static void main (String[] args) {
        System.out.println(fib(10));
    }
    
    public static int fib(int n){
        if(n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        
        return ((fib(n-1)) + (fib(n-2)));
    }
}
