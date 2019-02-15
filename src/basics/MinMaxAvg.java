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
public class MinMaxAvg {
    public static void main(String[] args){
        int[] myArray = {5,10,2,22,55,6};
        System.out.println("Minimum value: " + minValue(myArray));
        System.out.println("Max value: " + maxValue(myArray));
        System.out.println("Avg value: " + avgValue(myArray));
    }
    
    public static int minValue(int[] value){
        int min = value[0];
        
        for(int i = 0; i < value.length; i++){
            if(value[i] < min){
                min = value[i];
            }
        }
        
        return min;
        
    }
    
    public static int maxValue(int[] value){
        int max = value[0];
        
        for(int i = 0; i < value.length; i++){
            if(value[i] > max){
                max = value[i];
            }
        }
        
        return max;
        
    }
    
    public static int avgValue(int[] value){
        int avg;
        int total = 0;
        
        for(int i = 0; i < value.length; i++){
            total += value[i];
        }
        
        avg = (total / value.length);
        
        return avg;
        
    }
}
