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
public class BangunCampuran {
    private SegiEmpat s4;
    private SegitigaSamaKaki s3;
    private SetengahLingkaran ling;

    public BangunCampuran(SegiEmpat s4, SegitigaSamaKaki s3, SetengahLingkaran ling) {
        this.s4 = s4;
        this.s3 = s3;
        this.ling = ling;
    }
    
    public double hitungLuasTotal(){
       double total = s4.HitungLuas()+s3.HitungLuas()+ling.HitungLuas();
        System.out.println("Total Luas "+total);
        return total;
    }
}
