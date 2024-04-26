package com.alejandraad.javauproyectos.repasopackage.modelos;

public class Mascota {
    private final String nombre;
    private final int edad;
    private final String especie;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public Mascota(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
}
