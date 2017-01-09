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
(Approximate PI) PI can be computed using the following formula:
    PI = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 -1/11 + ....)
    Write a program that displays the result of 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 -1/11)
    and 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
    Use 1.0 instead of 1 in your program.
*/  
public class Solution_1_7 {
    public static void main (String[] args){
        // Simple solution
        System.out.println(4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11));
        System.out.println(4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13));
        
        // Advanced solution
        boolean plus = false;
        double internal = 1.0;
        double PI = 0.0;
        for (int i = 3; i < 1000; i++) {
            if (i%2 == 1){
                if (plus){
                    internal += 1.0/i;
                }else{                    
                    internal -= 1.0/i;
                }                
                plus = !plus;
                PI = 4 * internal;
                System.out.format("i=%d ==> PI =%f%n", i, PI);
            }                        
        }
    }
}
