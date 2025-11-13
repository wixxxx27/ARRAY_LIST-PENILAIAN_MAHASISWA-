/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PERTEMUAN9;

import java.util.ArrayList;

/**
 *
 * @author wixx
 */
public class DataMahasiswa {
    private ArrayList<Mahasiswa> list = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        list.add(m);
    }

    public void hapusMahasiswa(int index) {
        list.remove(index);
    }

    public ArrayList<Mahasiswa> getAllMahasiswa() {
        return list;
    }
}
