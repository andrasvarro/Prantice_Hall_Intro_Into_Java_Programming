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
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * PI
area = radius * radius * PI
*/
public class Solution_1_8 {
    public static void main (String[] args){
        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.format ("permiter = %f%n", perimeter);
        System.out.format ("area = %f", area);
    }
}
