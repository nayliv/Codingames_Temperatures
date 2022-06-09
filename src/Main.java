import java.util.*;

/* In this exercise, you have to analyze records of temperature to find the closest to zero.
 * Write a program that prints the temperature closest to 0 among input data.
 * If two numbers are equally close to zero,
 * positive integer has to be considered closest to zero (for instance,
 * if the temperatures are -5 and 5, then display 5).
 */

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyze
        int[] t = new int[n]; // array of temperatures
        int closestZ = 0;

        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526

            if (n != 0) {

                if (i == 0) // inicialize the variable 'closestZ' with a number pre-existing
                    closestZ = t[0]; // inicialize the variable 'closestZ' with the first number of the array

                if (t[i] < 0){ // negative numbers

                    if (t[i] > closestZ){
                        closestZ = t[i];
                    }
                }
                if (t[i] > 0){ // positive numbers
                    if (t[i] < closestZ)
                        closestZ = t[i];
                }
            }
            else{ // if there is no temperature
                System.out.println(0);
            }
        }
        System.out.println(closestZ);
    }
}