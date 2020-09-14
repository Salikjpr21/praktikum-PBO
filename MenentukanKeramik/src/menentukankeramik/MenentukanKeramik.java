/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukankeramik;

/**
 *
 * @author salik
 */
public class MenentukanKeramik {
   
    public static void main(String[] args) {
        // TODO code application logic here
        /*Hitung Luas Keramik*/
        UkuranKeramik A = new UkuranKeramik();
        A.luasKeramik = 30*30/100;/*cm2 diubah menjadi satuan m2*/
        A.jenis = "A";
        A.hargaKeramikPerbox = 54000;
        A.isiKeramikPerbox = 10;
        A.luasKeramik();
        
        A.kalkulasiHargaKeramik();
        
        UkuranKeramik B = new UkuranKeramik();
        B.luasKeramik = 40*40/100;/* cm2 diubah menjadi satuan m2*/
        B.jenis = "B";
        B.hargaKeramikPerbox = 65000;
        B.isiKeramikPerbox = 5;
        B.luasKeramik();
        
        B.kalkulasiHargaKeramik();
       
        UkuranKeramik C = new UkuranKeramik ();
        C.luasKeramik = 30*40/100;/* cm2 diubah menjadi satuan m2*/
        C.jenis = "C";        
        C.hargaKeramikPerbox = 60000;
        C.isiKeramikPerbox = 8;
        C.luasKeramik();
        
        C.kalkulasiHargaKeramik();
    }
    
}
