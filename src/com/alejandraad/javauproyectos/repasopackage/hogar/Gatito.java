package com.alejandraad.javauproyectos.repasopackage.hogar;

import com.alejandraad.javauproyectos.repasopackage.modelos.Jugar;
import com.alejandraad.javauproyectos.repasopackage.modelos.Mascota;

public class Gatito extends Gato implements Jugar {
    public Gatito(String nombre, int edad, String especie) {
        super(nombre, edad, especie); //super porque son atributos desde la clase Madre
    }
    @Override
    public void jugar(){
        System.out.println("jugar desde gatito");
    }

}
