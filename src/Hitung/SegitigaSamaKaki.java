/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @author Norton
 */
public class SegitigaSamaKaki {
     private int alas;
    private int tinggi;

    public SegitigaSamaKaki(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public double HitungLuas(){
        double luas = alas * tinggi /2;
        System.out.println("Luas Segitiga SamaKaki" +luas);
        return luas;
    }
}
