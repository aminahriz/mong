package modified.fibonacci;

import java.io.*;
import java.util.*;
//class to test the modified fibonacci sequence
public class Tester {

    public static void main(String args[]) {
        //copied and pasted from the assignment
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Generate which term number? ");
        int k = kbReader.nextInt();
        System.out.println("Term #" + k + " is " + ModFib.modFibonacci(k));
    }
}
