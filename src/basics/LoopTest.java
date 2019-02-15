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
public class LoopTest {
    public static void main (String[] args){
        String[] states = {"Lagos", "Abuja", "Kano", "Kaduna", "Yobe"};
        
        for(int i = 0; i <= 4; i++){
            System.out.println("Number: " + i + " :: " + states[i]);
        }
        
        System.out.println("============================");
        
        int k = 0;
        do {
            System.out.println("Number: " + k + " :: " + states[k]);
            k++;
        }while(k <= 4);
        
        System.out.println("============================");
        
        int m = 0;
        while(m <= 4){
            System.out.println("Number: " + m + " :: " + states[m]);
            m++;
        }
    }
}
