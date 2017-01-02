/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrenticeHall;

/**
 * @author andras.varro
 */
/* task:
1.1 (Display three messages) Write a program that displays Welcome to Java,
Welcome to Computer Science, and Programming is fun.
*/
public class Solution_1_1 {
    public static void main (String... args){
        System.out.print("Welcome to Java, ");
        System.out.print("Welcome to Computer Science, ");
        System.out.print("Programming is fun");
        // OR
        // for a new line...
        System.out.println();
        System.out.print("Welcome to Java, Welcome to Computer Science, Programming is fun");
        // OR
        // for a new line...
        System.out.println();        
        // mulitlines
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
        System.out.print("Welcome to Java\nWelcome to Computer Science\nProgramming is fun\n");
    }   
}
