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
public class UkuranKeramik {
    /* menentukan Atribut*/
    int luasKeramik, jumlahKeramik, jumlahBox, hargaKeramikPerbox, isiKeramikPerbox, hargaSatuan;
//    float ;
    String jenis;
    
    /* membuat Methods*/
    /* menghitung Luas Keramik*/
    void luasKeramik(){
        int luas;
        luas = this.luasKeramik;
        System.out.println("Luas Keramik "+jenis+": " +luas+ "m2");
    }
   
    void kalkulasiHargaKeramik(){
        int harga;
        harga = hargaKeramikPerbox / isiKeramikPerbox ;
        System.out.println("Harga Satuan Rp: " + harga);
        int jumlah;
        jumlah = 100 / this.luasKeramik;
        System.out.println("jumlah keramik yang dibutuhkan: " + jumlah + "buah" );
        int hargaKeramik;
        hargaKeramik = jumlah * harga;
        System.out.println(" Jumlah Total Harga yang perlu dibayar Rp: "+hargaKeramik);
    }
    
}
