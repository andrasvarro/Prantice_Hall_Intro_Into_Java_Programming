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
    (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
    seconds. Write a program that displays the average speed in miles per hour. (Note
    that 1 mile is 1.6 kilometers.)
*/
public class Solution_1_10 {
    public static void main (String[] args){
        double distanceInKm = 14;
        double timeInSeconds = 45*60 + 30;
        double distanceInMiles = distanceInKm/1.6;
        double timeInHours = timeInSeconds/(60*60);
        double speedInMilesPerHours = distanceInMiles/timeInHours;
        System.out.format("Distance in km= %f,%nspeed in seconds= %f.%nAVG speed in MPH= %f%n"
                , distanceInKm, timeInSeconds,speedInMilesPerHours);
        
    }
}
