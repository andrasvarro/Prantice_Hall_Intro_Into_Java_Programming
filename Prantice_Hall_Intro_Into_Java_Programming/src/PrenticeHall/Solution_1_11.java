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
    (Population projection) The U.S. Census Bureau projects population based on the
    following assumptions:
    - One birth every 7 seconds
    - One death every 13 seconds
    - One new immigrant every 45 seconds
    Write a program to display the population for each of the next five years. Assume the
    current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
    integers perform division, the result is an integer. The fractional part is truncated. For
    example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
    the fractional part, one of the values involved in the division must be a number with a
    decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/
public class Solution_1_11 {
        public static void main (String[] args){
        double birthRatePerSecond = 7.0;
        double deathRatePerSecond = 13.0;
        double immigrationPerSecond = 45.0;
        int currentPopulation = 312_032_486;
        int daysInYear = 365;
        int secondsInMinute = 60;
        int secondsInHour = 60*secondsInMinute;
        int secondsInDay = 24*secondsInHour;
        int secondsInYear = daysInYear*secondsInDay;
        double birthInYear = secondsInYear/birthRatePerSecond;
        double deathInYear = secondsInYear/deathRatePerSecond;
        double immigrationPerYear = secondsInYear/immigrationPerSecond;
        double changeInPopulation = birthInYear+deathInYear+immigrationPerYear;
        System.out.format("Current population: %d%nChange in polulation per year: %f%n%n", currentPopulation, changeInPopulation);
        double popInOneYear = currentPopulation+changeInPopulation;
        double popInTwoYear = popInOneYear + changeInPopulation;
        double popInThreeYear = popInTwoYear + changeInPopulation;
        double popInFourYear = popInThreeYear + changeInPopulation;
        double popInFiveYear = popInFourYear + changeInPopulation;
        System.out.format("pop in the next five years: %n%f%n%f%n%f%n%f%n%f%n",
                popInOneYear, popInTwoYear, popInThreeYear, popInFourYear, popInFiveYear);
        }
}