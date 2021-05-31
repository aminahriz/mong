
package towersOfHanoi;

import java.util.Scanner;

public class towersOfHanoi {

    //middleman method that fills in other parameters for the solve() and calls it when given only the number of disks
    public static void towers(int n) {
        //calls solve using the given number of disks and standard peg positions
        solve(n, 1, 2, 3);
    }

    //method that solves the towers of hanoi
    public static void solve(int n, int start, int mid, int end) {
        //checks if number of disks is acceptable
        if (n < 1) {
            //throws an exception telling the user the number of disks is unacceptable
            throw new IllegalArgumentException("You must have at least one disk");
        }
        //base case: if the number of disks is one
        if (n == 1) {
            //Print that the disk has moved from the starting peg to the end peg
            System.out.println("Move a disk from peg " + start + " to peg " + end);
            return;
        }
        //recursive part
        //recurse the method for the next larger disk, and move it to the middle from the start
        solve(n - 1, start, end, mid);
        System.out.println("Move a disk from peg " + start + " to " + end);
        //recurse the method to move the disk from the middle to start
        solve(n - 1, mid, end, start);

    }

    public static void main(String[] args) {
        //Create a scanner object
        Scanner s = new Scanner(System.in);
        //Prompt user for the number of disks in the problem
        System.out.println("How many disks?");
        //call the middleman method using the input as a parameter
        towers(s.nextInt());
        //print congratulatory message
        System.out.println("The monks would have been proud!!");
    }
}
