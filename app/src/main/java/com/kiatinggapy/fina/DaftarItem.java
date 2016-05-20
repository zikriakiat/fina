package com.kiatinggapy.fina;

/**
 * Created by Mila on 20/05/2016.
 */
public class DaftarItem {

    private String name, alamat, jarak;

    public DaftarItem(){

    }

    public DaftarItem(String name, String alamat, String jarak) {
        this.name = name;
        this.alamat = alamat;
        this.jarak = jarak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }
}
