/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class BMI {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
    
    }
    
}
