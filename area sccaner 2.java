// Amadou Ba

 // this program is to calculte the area using scanner

import java.util.Scanner;

class computearea {

 public static void main(String[] arg) {
 
 // to creat scanner to read inputs

 Scanner input = new Scanner (System.in);
 
 double radius;
 double area;
 // when you run the code first thing it will ask is to put a value only numbers
 System.out.println(" Provide value for the radius");
 radius = input.nextDouble();
 
 // the formula to calculte 
 
 area = radius * radius * 3.14159;
  // it will display in screen The area of the cirle of radius, that your final answer
 System.out.println("The area of the cirle of radius " + radius + " is " + area);
 
}

}