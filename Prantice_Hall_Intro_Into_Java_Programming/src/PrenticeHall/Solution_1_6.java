/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrenticeHall;

/**
 *
 * @author andras.varro
 */
/* Task:
    (Summation of a series) Write a program that displays the result of
    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
*/
public class Solution_1_6 {
    public static void main (String[] args){
        // Simple solution
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        
        // Empty line
        System.out.println("");
        
        // Advanced solution
        int a = 0;
        for (int i = 1; i < 10; i++) {
            a += i;
        }
        System.out.println(a);
    }
}
