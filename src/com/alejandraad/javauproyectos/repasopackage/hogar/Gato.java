package com.alejandraad.javauproyectos.repasopackage.hogar;

import com.alejandraad.javauproyectos.repasopackage.modelos.Mascota;

class Gato extends Mascota { //es una clase default por lo que solo pueden acceder a esta las clases del mismo package que ella

    public Gato(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }

    private String maullar() {
        return"😺 <(meow!)";
    }


}
