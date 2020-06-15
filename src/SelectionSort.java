
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oyeaaa
 */
public class SelectionSort {
    
    public static int[] randomize(int r) {
        Random rand = new Random();
        
        int[] arrRand = new int[r];
        
        for(int i = 0; i < arrRand.length; i++) {
            arrRand[i] = rand.nextInt(25);
        }
        
        return arrRand;
    }
    
    public static void main(String[] args) {
        
        // Array declaration
        int[] arr = randomize(10);
        
        // Time start
        double t1 = System.currentTimeMillis();
        
        System.out.println("Unsorted");
        System.out.println(Arrays.toString(arr) + "\n");
        
        // Selection Sort Algorithm
        for(int i = 0; i < arr.length - 1; i++) {
            int nilaiMinimum = i;
            
            for(int j = i + 1; j < arr.length; j++) {
                if( arr[j] <  arr[nilaiMinimum]) {
                    nilaiMinimum = j;  
                }  
            }
            
            int temp = arr[i];
            arr[i] = arr[nilaiMinimum];
            arr[nilaiMinimum] = temp;      
        }
        
        // Time end
        double t2 = System.currentTimeMillis();
        
        // Execute Duration
        double duration = (t2 - t1) / 1000;
        
        System.out.println("Sorted");
        System.out.println(Arrays.toString(arr) + "\n");
        
        System.out.println("Execution time " + duration + " s");
        
    }
    
}
