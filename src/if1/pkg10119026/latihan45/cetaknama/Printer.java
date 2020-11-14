/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan45.cetaknama;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan pencetakan nama
 */
public class Printer {
    private String nama;
    private int jmlCetak;
    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama anda : ".concat(nama));
    }
    
    public void cetak(int jmlCetak, String nama){
        for(int i = 1; i <= jmlCetak; i++){
            System.out.println(i + ". " + nama);
        }
    }
    
}
