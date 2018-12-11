/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author Student
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        countUp(3);
    }

    private static void countUp(int n) {
        if (n == 1) {
            System.out.print(n + " ");
        } 
        
        else {
            countUp(n - 1);
            System.out.print(n + " ");
        }
    }
}
