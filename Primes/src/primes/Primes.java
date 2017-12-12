/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

import java.util.ArrayList;

/**
 *
 * @author kylespomer
 */
public class Primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        int counter = 1; //number to be used as the evaluation divisor
        
        for (int i = 2; i <= 200; i++){
            primes.add(i); //initialize arraylist values 1-200
        }
        
        while(counter <= primes.size()){
            for(int j = 0; j < primes.size(); j++){ //print the ArrayList
                System.out.print(primes.get(j) + " ");
            }
            System.out.println();
            
            for (int i = counter + 1; i < primes.size(); i ++){
               
                
                if ((primes.get(i) % counter) == 0){ //remove any multiples of the divisor
                    primes.remove(primes.get(i));
                    
                }
            }
            counter++; //check next
               
            
        }
    }
    
}
