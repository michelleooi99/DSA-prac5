/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author Student
 */
public class TestPrime {

    public static boolean isPrime(int n) {
        return isPrime(n, n - 1);
    }

    private static boolean isPrime(int n, int divisor) {
        for (divisor = 2; divisor <= n / 2; divisor++) {
            if (n % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }
}
