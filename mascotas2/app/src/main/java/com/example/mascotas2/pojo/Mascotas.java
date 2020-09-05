package com.example.mascotas2.pojo;

public class Mascotas {

    private int imagen;
    private String nombre;
    private String numeroLikes;

    public Mascotas(int imagen, String nombre, String numeroLikes){
        this.imagen=imagen;
        this.nombre=nombre;
        this.numeroLikes=numeroLikes;
    }

    public Mascotas(int imagen, String numeroLikes) {
        this.imagen=imagen;
        this.numeroLikes=numeroLikes;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(String numeroLikes) {
        this.numeroLikes = numeroLikes;
    }
}
