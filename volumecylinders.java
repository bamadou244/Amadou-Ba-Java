//Amadou Ba 

// This program that reads the radius and lenght of a cylinser and computes volume.

// please run the code: Enter the radius of a cylinder 8. Enter the length of a cylinder 12

// Screen should display Area is 201.0624. And Volume is 2412.7488

import java.util.Scanner;

public class volumecylinders {

public static void main(String[] arg) {

 // to creat scanner to read inputs

 Scanner imput = new Scanner (System.in);
 
 double area;
 double volume;
 double radius;
 double length;
 
 // when you run the code first thing it will ask is to put a value only numbers
 System.out.println(" Enter the radius of a cylinder");
 radius = imput.nextDouble();
 
 // when you run the code first thing it will ask is to put a value only numbers
 System.out.println(" Enter the length of a cylinder");
 length = imput.nextDouble();
 
 // formula for the area
 area = radius * radius * 3.1416;
 System.out.println(" area is " + area);

// formula for the volume
 volume = area * length;
 System.out.println(" volume is " + volume);
 
 }
 
 }
 
 
 
 
 
 

