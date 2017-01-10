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
/*Task:
    (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
    and 35 seconds. Write a program that displays the average speed in kilometers per
    hour. (Note that 1 mile is 1.6 kilometers.)
*/
public class Solution_1_12 {
    public static void main (String[] args){
        double distanceInMiles = 24;
        double timeInSeconds = 1*60*60 + 40*60 + 35;
        double distanceInKm = distanceInMiles*1.6;
        double timeInHours = timeInSeconds/(60*60);
        double speedInKmPerHours = distanceInKm/timeInHours;
        System.out.format("Distance in miles= %f,%nspeed in seconds= %f.%nAVG speed in km/h= %f%n"
                , distanceInMiles, timeInSeconds, speedInKmPerHours);
        
    }
}
