/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan47.nilaimahasiswa;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Menampilkan nilai mahasiswa
 */
public class PBOIF210119077Latihan47NilaiMahasiswa {

    
    public static void main(String[] args) {
        Nilai objNilai = new Nilai(75, 45, 34);
        
        System.out.println("QUIZ        = "+objNilai.getQuiz());
        System.out.println("UTS         = "+objNilai.getUts());
        System.out.println("UAS         = "+objNilai.getUas());
        System.out.println("");
        
        System.out.println("Nilai Akhir = "+objNilai.hitungNilaiAkhir(objNilai.getQuiz(), objNilai.getUts(), objNilai.getUas()));
        System.out.println("");
        
        System.out.println("Index       = "+objNilai.aturanIndex());
        System.out.println("Keterangan  = "+objNilai.aturanKetarangan());
    }
    
}
