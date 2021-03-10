// Amadou Ba
// This program is to convert pound to kilogram

import java.util.Scanner;

public class convert {

public static void main(String[] args) {
 
 Scanner imput = new Scanner(System.in);
 
 double kilogram;

 double pound;
 
      // Enter a value for the pound   
 System.out.println("Enter a value for pound: ");
 
 pound = imput.nextDouble();
 // the formula is to multiply by 0.454
  kilogram = (pound) * 0.454;
  
        // when you enter a value it should show you the pound and kilogram
 System.out.println(" Final Answer" + pound + " is " + kilogram);
 
 }
 
 }