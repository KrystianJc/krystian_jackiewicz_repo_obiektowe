/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package krystian.jackiewicz.zad2;

import java.util.Scanner;

/**
 *
 * @author jacki
 */
public class Zad2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = sc.nextLine();   
        System.out.println(tekst +" posiada tyle znakow: "+tekst.length());
    }
    
}
