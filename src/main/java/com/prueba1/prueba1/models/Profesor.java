package com.prueba1.prueba1.models;

public class Profesor extends Persona {
    public String materia;

    


public Profesor(){
    super();
    
}

public Profesor(String nombre, String materia) {
    super(nombre);
    this.materia = materia;
}

public String getMateria() {
    return materia;
}

public void setMateria(String materia) {
    this.materia = materia;
}

public void saludo(){
    System.out.println( "Buenos dias estudiantes");
}




}
