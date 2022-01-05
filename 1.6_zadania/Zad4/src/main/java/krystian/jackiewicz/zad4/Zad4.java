/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package krystian.jackiewicz.zad4;

import java.util.Scanner;

/**
 *
 * @author jacki
 */
public class Zad4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = sc.nextLine();
        if(tekst.length()>4)
        {
            System.out.println("Podaj od jakiego miejsca mam pobrać tekst[max: "+tekst.length()+"]");
            int ile_miejsc = Integer.parseInt(sc.nextLine());
            if(ile_miejsc>=tekst.length())
            {
                System.out.println(ile_miejsc+"To więcej niż dlugosc tekst: "+tekst);
            }
            
        }
        else
        {
            System.out.println("Tekst jest za krótki");
        }
    }
}
