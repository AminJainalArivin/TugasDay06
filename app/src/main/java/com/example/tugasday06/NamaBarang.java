package com.example.tugasday06;

public class NamaBarang {
    private String nama, deskripsi, harga;
    private int fotoitem;
    private int id;

    public NamaBarang(String nama, String deskripsi, String harga, int fotoitem, int id) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.fotoitem = fotoitem;
        this.id = id;
    }

    public static int size() {

    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getFotoitem() {
        return fotoitem;
    }

    public void setFotoitem(int fotoitem) {
        this.fotoitem = fotoitem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
