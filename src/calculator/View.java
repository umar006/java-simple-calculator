/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Umar Al-Faruq
 */
public class View {
    Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Menu Kalkulator");
        System.out.println("1. Penjumlahan\n"
                + "2. Pengurangan\n"
                + "3. Perkalian\n"
                + "4. Pembagian\n"
                + "5. Penegasian\n"
                + "6. Pengakaran\n"
                + "7. Faktorial\n"
                + "0. Keluar");
    }

    public int promptPilihan() {
        System.out.print("Menu yang dipilih: ");
        int menu = sc.nextInt();
        return menu;
    }

    public void prompt2Operan(Data d) {
        System.out.print("Masukkan bilangan pertama: ");
        d.setOperan1(sc.nextDouble());
        System.out.print("Masukkan bilangan kedua: ");
        d.setOperan2(sc.nextDouble());
    }

    public void prompt1Operan(Data d) {
        System.out.print("Masukkan bilangan: ");
        d.setOperan3(sc.nextInt());
    }

    public void displayHasil(Data d) {
        System.out.println("Hasilnya adalah: " + d.getHasil());
        System.out.println("");
    }

    public void diplayClosing() {
        System.out.println("Terima kasih");
    }
}
