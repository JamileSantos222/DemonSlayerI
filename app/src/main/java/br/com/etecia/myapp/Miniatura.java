package br.com.etecia.myapp;

public class Miniatura {
    private int imgMiniatura;
    private String tituloMiniatura;

    public Miniatura(int imgMiniatura, String tituloMiniatura) {
        this.imgMiniatura = imgMiniatura;
        this.tituloMiniatura = tituloMiniatura;
    }

    public int getImgMiniatura() {
        return imgMiniatura;
    }

    public void setImgMiniatura(int imgMiniatura) {
        this.imgMiniatura = imgMiniatura;
    }

    public String getTituloMiniatura() {
        return tituloMiniatura;
    }

    public void setTituloMiniatura(String tituloMiniatura) {
        this.tituloMiniatura = tituloMiniatura;
    }
}