/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PERTEMUAN10;

/**
 *
 * @author wixx
 */
public class Mahasiswa {
    private String npm, nama, alamat, matkul;
    private double n1, n2, n3, n4, n5;

    public Mahasiswa(String npm, String nama, String alamat, String matkul,
                     double n1, double n2, double n3, double n4, double n5) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
        this.matkul = matkul;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public String getNpm() { return npm; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getMatkul() { return matkul; }

    public double getNilaiAkhir() {
        return (n1 * 0.10) + (n2 * 0.15) + (n3 * 0.25) + (n4 * 0.15) + (n5 * 0.35);
    }
}

