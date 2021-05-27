/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.assignment;
import java.io.*;
import java.util.*;
public class Tester
{
public static void main(String args[])
{
Scanner kbReader = new Scanner(System.in);
System.out.print("Generate which term number? ");
int k = kbReader.nextInt( );
System.out.println("Term #" + k + " is " + ModFib.modFibonacci(k));
}
}