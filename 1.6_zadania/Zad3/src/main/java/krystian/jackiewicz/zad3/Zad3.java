/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package krystian.jackiewicz.zad3;

import java.util.Scanner;

/**
 *
 * @author jacki
 */
public class Zad3 {
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Podaj imie: ");
         String imie = sc.nextLine();
         System.out.println("Podaj nazwisko: ");
         String nazwisko = sc.nextLine();
         System.out.println("Podaj wiek: ");
         String wiek = sc.nextLine();
         System.out.println("Podaj waga (kg): ");
         float waga = Integer.parseInt(sc.nextLine());
         System.out.println("Podaj wzrost (cm): ");
         float wzrost = Integer.parseInt(sc.nextLine());
        
         float bmi = waga/((wzrost/100) *(wzrost/100));
         
         System.out.println("Twoje imie: "+imie);
         System.out.println("Twoje nazwisko: "+nazwisko);
         System.out.println("Twoj wiek: "+wiek);
         System.out.println("Twoja waga: "+waga);
         System.out.println("Twoj wzrost: "+wzrost);
         if(bmi<16)
         {
             System.out.println("Wygłodzenie");
         }
         else if(bmi>=16 && bmi<=16.9)
         {
              System.out.println("Wychudzenie");
         }
         else if(bmi>=17 && bmi<18.5)
         {
              System.out.println("Niedowaga");
         }
         else if(bmi>= 18.5 && bmi<=24.9)
         {
              System.out.println("Waga prawidłowa");
         }
         else if(bmi>=25 && bmi<=29.9)
         {
              System.out.println("Nadwaga");
         }
         else if(bmi>=30 && bmi<=34.9)
         {
              System.out.println("Otyłość 1 stopnia");
         }
         else if(bmi >=35 && bmi<=39.9)
         {
              System.out.println("Otyłość 2 stopnia");
         }
         else if(bmi>=40)
         {
             System.out.println("Otyłość 3 stopnia");
         }
             
    }
}
