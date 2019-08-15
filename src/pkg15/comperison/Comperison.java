/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.comperison;

import java.util.*;

public class Comperison {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) 
    {
       String firstName; 
        String lastName; 
        int age; 
        double weight; 
            System.out.println("Enter first name, last name, "
                               + "age, and weight separated "
                                            + "by spaces."); //Line 5
        firstName = console.next(); //Line 6
            lastName = console.next(); //Line 7
            age = console.nextInt(); //Line 8
            weight = console.nextDouble(); //Line 9
            System.out.println("Name: " + firstName
            + " " + lastName); //Line 10
            System.out.println("Age: " + age); //Line 11
            System.out.println("Weight: " + weight);
       
       
    }
         
        
   
}
    

