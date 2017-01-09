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
(Area and perimeter of a rectangle) Write a program that displays the area and
perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
formula:
area = width * height
*/
public class Solution_1_9 {
    public static void main (String[] args){
        double width = 4.5, height = 7.9;
        double perimeter = 2*(width + height);
        double area = width * height;
        System.out.format ("permiter = %f%n", perimeter);
        System.out.format ("area = %f", area);
    }
}
