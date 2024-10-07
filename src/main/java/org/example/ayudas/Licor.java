package org.example.ayudas;

import java.time.LocalDate;

public class Licor {
    private String nombre;
    private String tipo;
    private String marca;
    private LocalDate fechaCaducidad;
    private Double porcentajeAlcohol;

    public Licor() {
    }

    public Licor(String nombre, String tipo, String marca, LocalDate fechaCaducidad, Double porcentajeAlcohol) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.fechaCaducidad = fechaCaducidad;
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }
}
