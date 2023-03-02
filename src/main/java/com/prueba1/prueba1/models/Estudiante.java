package com.prueba1.prueba1.models;

public class Estudiante extends Persona {
    public String curso;
    public Integer edad;



    public Estudiante() {
        super();
    }


    public Estudiante(String nombre, String curso, Integer edad) {
        super(nombre);
        this.curso = curso;
        this.edad = edad;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    public Integer getEdad() {
        return edad;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void saludo(){
        System.out.println( "Buenos dias profesor/a");
    }




    

}

