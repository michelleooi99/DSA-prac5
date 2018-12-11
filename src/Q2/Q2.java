/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author Student
 */
public class Q2 {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        displayBackward(arr, 0, arr.length - 1);
        for (int pr : arr) {
            System.out.print(pr + " ");
        }
    }

    private static void displayBackward(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            displayBackward(arr, start + 1, end - 1);
        }
    }
}
