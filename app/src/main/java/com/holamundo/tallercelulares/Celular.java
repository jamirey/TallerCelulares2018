package com.holamundo.tallercelulares;

public class Celular {

    private String marca;
    private String capacidad;
    private String precio;
    private String color;
    private String SistemaOperativo;

    public Celular(String marca, String capacidad, String precio, String color, String sistemaOperativo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
        this.color = color;
        this.SistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
