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
public class Calculator {

    public static void main(String[] args) {
        Calculator k = new Calculator();
        k.play();
    }

    View tmp;
    Data data;

    public Calculator() {
        tmp = new View();
        data = new Data();
    }

    public void processByPilihan(int p) {
        switch (p) {
            case 1:
                tmp.prompt2Operan(data);
                data.countPenjumlahan();
                tmp.displayHasil(data);
                break;
            case 2:
                tmp.prompt2Operan(data);
                data.countPengurangan();
                tmp.displayHasil(data);
                break;
            case 3:
                tmp.prompt2Operan(data);
                data.countPerkalian();
                tmp.displayHasil(data);
                break;
            case 4:
                tmp.prompt2Operan(data);
                data.countPembagian();
                tmp.displayHasil(data);
                break;
            case 5:
                tmp.prompt1Operan(data);
                data.countPenegasian();
                tmp.displayHasil(data);
                break;
            case 6:
                tmp.prompt1Operan(data);
                data.countPengakaran();
                tmp.displayHasil(data);
                break;
            case 7:
                tmp.prompt1Operan(data);
                data.countFaktorial();
                tmp.displayHasil(data);
                break;
            default:
                tmp.diplayClosing();
        }
    }

    public void play() {
        int p;
        do {
            tmp.displayMenu();
            p = tmp.promptPilihan();
            processByPilihan(p);
        } while (p != 0);
    }
    
}
