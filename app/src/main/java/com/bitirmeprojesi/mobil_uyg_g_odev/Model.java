package com.bitirmeprojesi.mobil_uyg_g_odev;

public class Model {
    private String novelist;
    private int id;
    private String name;

    private byte[] image;


    public Model(String name, String novelist, byte[] image, int id) {
        this.name = name;
        this.novelist = novelist;
        this.image = image;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNovelist() {
        return novelist;
    }

    public void setNovelist(String novelist) {
        this.novelist = novelist;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
