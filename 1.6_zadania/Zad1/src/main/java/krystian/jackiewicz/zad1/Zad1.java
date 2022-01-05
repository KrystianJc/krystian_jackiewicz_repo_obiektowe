/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package krystian.jackiewicz.zad1;

import java.util.Scanner;

/**
 *
 * @author jacki
 */
public class Zad1 {
    public static void main(String args[])
    {
        String haslo = "Kowalski123";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Podaj haslo: ");
        
        String podaneHaslo = sc.nextLine();
        
        if(haslo.equals(podaneHaslo))
        {
            System.out.println("Poprawne haslo!!!");
        }
        else
        {
            System.out.println("Nie poprawne haslo!!!");
        }
        
    }
}
