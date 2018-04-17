/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Umar Al-Faruq
 */
public class Data {
    double operan1;
    double operan2;
    int operan3;
    double hasil;

    public Data() {
        operan1 = 0;
        operan2 = 0;
        operan3 = 0;
        hasil = 0;
    }

    public void setOperan1(double op) {
        operan1 = op;
    }

    public void setOperan2(double op) {
        operan2 = op;
    }

    public void setOperan3(int op) {
        operan3 = op;
    }

    public double getHasil() {
        return hasil;
    }
    
    public void countPenjumlahan() {
        hasil = operan1 + operan2;
    }
    
    public void countPengurangan() {
        hasil = operan1 - operan2;
    }
    
    public void countPerkalian() {
        hasil = operan1 * operan2;
    }

    public void countPembagian() {
        hasil = operan1 / operan2;
    }

    public void countPenegasian() {
        hasil = operan3 * (-1);
    }

    public void countPengakaran() {
        hasil = Math.sqrt(operan3);
    }

    public void countFaktorial() {
        hasil = 1;
        for (int i = 1; i <= operan3; i++){
            hasil *= i;
        }
    }

}
