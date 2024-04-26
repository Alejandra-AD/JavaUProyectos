package com.alejandraad.javauproyectos.repasopackage.modelos;

public class Persona implements Jugar{
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
    private String tipoDeIntegrante; // parámetros globales


    public Persona(String nombre,String apellido,int edad, String ocupacion ,String tipoDeIntegrante){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.tipoDeIntegrante = tipoDeIntegrante;
    }




    //getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }


    //setters

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTipoDeIntegrante() {
        return tipoDeIntegrante;
    }

    public void setTipoDeIntegrante(String tipoDeIntegrante) {
        this.tipoDeIntegrante = tipoDeIntegrante;
    }

    //metodos
    public void trabajar(){
        String mensaje = (ocupacion == "estudiante"? nombre + " es estudiante." : nombre + " esta trabajando. Es " + ocupacion + "." );
        System.out.println(mensaje);
    }


    public void datosIntegrante(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("edad = " + edad);
        System.out.println("ocupación = " + ocupacion);
        System.out.println("tipo de integrante = " + tipoDeIntegrante);
    }

    @Override
    public void jugar() {
        System.out.println("jugar desde persona");
    }
}
