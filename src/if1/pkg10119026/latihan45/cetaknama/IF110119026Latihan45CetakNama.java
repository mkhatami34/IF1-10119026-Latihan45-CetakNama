/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan pencetakan nama
 */
public class IF110119026Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Printer printer = new Printer();
        Printer printer1 = new Printer();
        System.out.println("====Aplikasi Pencetakan Nama====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scan.nextLine());
        System.out.print("Mau cetak berapa kali ? : ");
        printer.setJmlCetak(scan.nextInt());
        printer.cetak(printer.getNama());
        printer1.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
