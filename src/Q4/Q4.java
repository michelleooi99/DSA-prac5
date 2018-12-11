/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import static Q4.TestPrime.isPrime;

/**
 *
 * @author Student
 */
public class Q4 {
    
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 : ");
        
        for(int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
