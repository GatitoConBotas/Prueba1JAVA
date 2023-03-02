package com.prueba1.prueba1;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prueba1.prueba1.models.Estudiante;
import com.prueba1.prueba1.models.Persona;
import com.prueba1.prueba1.models.Profesor;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
//Te contactaron desde un colegio municipal para que los ayudes a generar un software pensando en ordenar su funcionamiento, este colegio siempre a funcionado de manera análoga por 20 años y esto ha generado errores de pérdidas de datos de alumnos antiguos, documentos estropeados y nula posibilidad de generar estadísticas de rendimiento del colegio.

//En esta instancia tu tarea será generar los objetos necesarios para cubrir las necesidades del colegio, utilizando herencia.
//Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del colegio




//CONSIDERAR
// El colegio cuenta con distintos cursos, profesores, materias y alumnos (crear un array para las notas)

//Se debe crear una función que permita al profesor ingresar notas por estudiante y que luego permita obtener el promedio de cada estudiante.

//Se debe crear una función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre.

//Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor nota y el promedio de notas.



//Puntos a evaluar:
//Creación de objetos pertinentes al caso.
//Creación de funciones.
//Proyecto funcional.


//PASOS
// Crear objetos (persona clase principal)(estudiante y profesor heredan de persona)
// Arrays de notas , estudiantes y profesores




@SpringBootApplication
public class Prueba1Application {



// ------------------------------------------------ Funciones ------------------------------------------------------------------------
// Funcion para obtener promedio
public static Double promedio(ArrayList<Double> notas){
	Double suma = 0.0;
	for (int i = 0; i < notas.size(); i++) {
		//suma = suma + notas.get(i) -> es lo mismo :D
		suma += notas.get(i);
	}
	return suma/notas.size();
}











	public static void main(String[] args) {

	// Declarar scanner , HashMaps y variables que utilizaremos
	
	Scanner teclado = new Scanner(System.in); // Scanner para solicitar datos

	HashMap <String, ArrayList<Double>> estudiantesNotas = new HashMap<String, ArrayList<Double>>(); //HashMap de notas y array de estudiantes



	int numeroDeEstudiantes;
	int numeroDeNotas;
	String nombreDelEstudiante = "";


	// bucle para consultar la cantidad de estudiantes por curso con la condicion que no puede ser 0
	do{
		System.out.print("Ingrese la cantidad de estudiantes de del curso: ");
		numeroDeEstudiantes = teclado.nextInt();
		if(numeroDeEstudiantes <= 0){
			System.out.print("La cantidad de estudiantes no puede ser cero, ingrese otro numero nuevamente");
		}

	}while(numeroDeEstudiantes <= 0);



	// Bucle para consultar la cantidad de notas por estudiante con la condicion que no puede ser 0
	do{
		System.out.print("Ingrese la cantidad de notas por estudiante: ");
		numeroDeNotas = teclado.nextInt();
		if(numeroDeNotas <= 0){
			System.out.print("La cantidad de notas no puede ser cero, ingrese otro numero nuevamente");
		}
	}while(numeroDeNotas <= 0);
	
	
// creamos estos bucles para poder crear nuestro HashMap de estudiantes y notas

	for(int i = 1; i <= numeroDeEstudiantes; i++){ 
		ArrayList <Double> notasDelEstudiante = new ArrayList<Double>(); 
		System.out.print("Ingresa nombre del estudiante: ");
		teclado.nextLine(); // limpiar teclado
		nombreDelEstudiante = teclado.nextLine(); // Consultar el nombre del estudiante
		for(int x = 1; x <= numeroDeNotas; x++){  
			System.out.print("Ingresa nota " +x+ " del estudiante "+ nombreDelEstudiante +": ");
			Double nota = teclado.nextDouble();
			notasDelEstudiante.add(nota);
		}
		estudiantesNotas.put(nombreDelEstudiante, notasDelEstudiante); 
	 } 
	
	// Se debe crear una función que permita al profesor ingresar notas por estudiante y que luego permita obtener el promedio de cada estudiante.

	// este  for itera en el hashmap y promedia las notas puestas en la key del hashmap (se usa la funcion promedio declarada al inicio)
	// Podemos llamar esta funcion con un menu
	// public static void promedioPorEstudiante(){}
		for(String i : estudiantesNotas.keySet()){ // HashMap creado anteriormente 
			Double promedioDelEstudiante = promedio(estudiantesNotas.get(i));
			System.out.println("El promedio del estudiante: "+ i +" es de: " + promedioDelEstudiante);
		}

// Se debe crear una función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre.
// Usamos un for para recorrer la cantidad de alumnos y luego los ingresamos al array
// public static void alumnosCurso(){}
System.out.print("Ingrese la cantidad de estudiantes de del curso: ");
numeroDeEstudiantes = teclado.nextInt();
for(int i = 1; i <= numeroDeEstudiantes; i++){ 
	ArrayList <String> alumnosPorCurso = new ArrayList<String>(); 
	System.out.print("Ingresa nombre del estudiante: ");
	teclado.nextLine(); // limpiar teclado
		nombreDelEstudiante = teclado.nextLine();// para que ingrese el nombre del estudiante
		alumnosPorCurso.add("alumno");// Alumnos guardados en el array

		System.out.println("Este curso esta compuesto por: "+ alumnosPorCurso); 
	 }

	// Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor nota y el promedio de notas.
	//public static void funcionesNotas(ArrayList <Double> notas)


//creamos un for para itererar el array y creamos las funciones con los correspondientes

System.out.print("Ingrese la cantidad de notas por estudiante: ");
numeroDeNotas = teclado.nextInt();

for(int i = 1; i <= numeroDeNotas; i++){ 

	ArrayList<Integer> notas = new ArrayList<Integer>();

		int peorNota= notas.get(0);
		for (int i = 0; i < notas.size() ; i++) {
			if (notas.get(i) < peorNota) {
				peorNota = notas.get(i);  
			} 
		}
	int suma=0;
	for(int i=0; i< notas.size(); i++){
			suma= suma + notas.get(i);
	int	 promedioArray = suma/notas.size();

	int mejorNota= notas.get(0);
		for (int i = 0; i < notas.size() ; i++) {
			if (notas.get(i) > mejorNota) {
				mejorNota = notas.get(i);  
			} 

	}
		System.out.println("El promedio de las notas es " + promedioArray );
		System.out.println("La peor nota es: "+ peorNota);
		System.out.println("La mejor nota es: "+ mejorNota);



		}

		}
			}








	
