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
public class SetengahLingkaran {
    private int jarijari;

    public SetengahLingkaran(int jarijari) {
        this.jarijari = jarijari;
    }

    

    public int getJarijari() {
        return jarijari;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    
    public double HitungLuas(){
        double luas = (3.14 * jarijari * jarijari)/2;
        System.out.println("luas setengah lingkaran"+luas);
        return luas;
    }
    
}
