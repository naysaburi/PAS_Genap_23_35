package com.example.pas_genap_23_35;

public class ProfileModel {
    private String name;
    private String kelas;
    private String absen;
    private String email;

    public ProfileModel(String name, String kelas, String absen, String email) {
        this.name = name;
        this.kelas = kelas;
        this.absen = absen;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAbsen() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
