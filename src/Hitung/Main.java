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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SegiEmpat s4 = new SegiEmpat(4, 2);
       SegitigaSamaKaki s3 = new SegitigaSamaKaki(3, 6);
       SetengahLingkaran ling = new SetengahLingkaran (7);
       BangunCampuran bg = new BangunCampuran(s4, s3 , ling);
       
       bg.hitungLuasTotal();
    }
    
}
