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
(Print a table) Write a program that displays the following table:
a a^2 a^3
1  1   1
2  4   8
3  9   27
4  16  64
*/
public class Solution_1_4 {
    public static void main (String[] args){
        // Simple solution:
        System.out.println("a a^2 a^3");
        System.out.println("1  1   1");
        System.out.println("2  4   8");
        System.out.println("3  9   27");
        System.out.println("4  16  64");
        
        // Empty line
        System.out.println("");
        
        // Bit more complex solution
        String alignFormat ="%-2d  %-2d  %-2d%n";
        System.out.format("%-2s  %-2s  %-2s%n", "a","a^2", "a^3");
        System.out.format(alignFormat, 1,1,1);
        System.out.format(alignFormat, 2, 4, 8);
        System.out.format(alignFormat, 3, 3, 27);
        System.out.format(alignFormat, 4, 16, 64);

        // Empty line
        System.out.println("");
        
        // Even more complex - one should not understand this at this point
        System.out.format("%-2s  %-2s  %-2s%n", "a","a^2", "a^3");
        for (int i = 1; i < 5; i++) {
            System.out.format(alignFormat, i, i*i, i*i*i);
        }
    }
}
