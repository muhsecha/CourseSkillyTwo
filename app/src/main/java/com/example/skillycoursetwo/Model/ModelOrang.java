package com.example.skillycoursetwo.Model;

public class ModelOrang {
    String nama,umur,gender;

    public ModelOrang(String nama, String umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getGender() {
        return gender;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
