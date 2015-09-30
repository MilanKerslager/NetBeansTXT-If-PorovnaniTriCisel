// Seřazení tří čísel podle velikosti (vzestupně)
// Algoritmus používá techniku Bubble sort
// Složitost jsou 3 porovnání a v nejhorším případě 3 prohození
// Neexistuje algoritmus s méně, než 3 porovnáními, protože
// je 6 kombinací (n!=6) a ceil(log_2(n!)) = 3

package seřazenítříćísel;

import java.util.Scanner;

public class SeřazeníTříĆísel {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadej 1. číslo: ");
        int a = vstup.nextInt();
        System.out.print("Zadej 2. číslo: ");
        int b = vstup.nextInt();
        System.out.print("Zadej 3. číslo: ");
        int c = vstup.nextInt();
        if (a>b) {
            // prohození obsahu proměnných a,b
            int pom = a;
            a = b;
            b = pom;
        }
        if (b>c) {
            // prohození obsahu proměnných b,c
            int pom = b;
            b = c;
            c = pom;
        }
        if (a>b) {
            // prohození obsahu proměnných a,b
            int pom = a;
            a = b;
            b = pom;
        }       
        System.out.println("Seřazeno: "+a+","+b+","+c);
    }
    
}
