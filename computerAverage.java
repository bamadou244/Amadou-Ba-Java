// Amadou Ba 

// this program is to find average of 3 variables.

import java.util.Scanner;

public class computerAverage {

public static void main(String[] args) {

// to creat scanner to read imput
Scanner imput = new Scanner(System.in);

// this stores the average from the user all 3 variable      

System.out.println("Enter 3 Variables: ");

int firstVariable = imput.nextInt();

int secondVariable = imput.nextInt();

int thirdVariable = imput.nextInt();

//calculte average 

int average = (firstVariable + secondVariable + thirdVariable)/3;

System.out.println("The average of " + firstVariable + " " + secondVariable + " " + thirdVariable + " is " + average);

}

}