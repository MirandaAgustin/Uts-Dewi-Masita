/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspemrogramanberorientasiobjek;

/**
 *
 * @author ITBI 28
 */

class handphone{
    String merk;
    String tipe;
    String warna;
}

public class UtsPemrogramanBerorientasiObjek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        handphone handphone_saya= new handphone();
        handphone_saya.merk= "Iphone";
        handphone_saya.tipe= "15 Pro Max";
        handphone_saya.warna= "Titanium Putih";
        
        System.out.println("Merk    :" + handphone_saya.merk);
        System.out.println("Tipe    :" + handphone_saya.tipe);
        System.out.println("Warna   :" + handphone_saya.warna);
    }
    
}
