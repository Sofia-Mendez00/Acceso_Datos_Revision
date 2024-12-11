package ejercicios_almacenamiento_recuperacion;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestAlmacenamientoObjetos {

	@Test
	void TestInsertarDato() {
		Ejercicio3_1_1 ej3 = new Ejercicio3_1_1();
		Tareas tarea = new Tareas(1, "Entrenamiento de tenis", "2024-12-06", "2024-12-06", false, new TipoTarea(1, "Deporte", "Ir a tenis a las 17:00h"));
		ej3.insertarDato(tarea);
	}

	@Test
	void TestInsertarDatos() {
		Ejercicio3_1_1 ej3 = new Ejercicio3_1_1();
		List<Tareas> tareas = new ArrayList<Tareas>();
		tareas.add(new Tareas(1, "Entrenamiento de tenis", "2024-12-06", "2024-12-06", false, new TipoTarea(1, "Deporte", "Ir a tenis a las 17:00h")));
		tareas.add(new Tareas(2, "Compra mensual en Carrefour", "2024-12-07", "2024-12-07", false, new TipoTarea(2, "Compra", "Comprar en el Carrefour")));
		tareas.add(new Tareas(3, "Completar proyecto de AAD", "2024-12-08", "2024-12-10", false, new TipoTarea(3, "Trabajo", "Hacer el trabajo de Acceso a Datos")));
		tareas.add(new Tareas(4, "Excursión al pueblo", "2024-12-09", "2024-12-09", false, new TipoTarea(4, "Salida", "Salir el sábado al pueblo")));
		tareas.add(new Tareas(5, "Revisión anual del coche", "2024-12-11", "2024-12-11", false, new TipoTarea(5, "Revisión", "Ir a la revisión del coche")));
		tareas.add(new Tareas(6, "Cambiar bombilla del salón", "2024-12-05", "2024-12-05", true, new TipoTarea(6, "Arreglo", "Arreglar la bombilla del salón")));
		ej3.insertarDatos(tareas);
	}

	@Test
	void TestBuscarDatoID() {
		Ejercicio3_1_1 ej3 = new Ejercicio3_1_1();
		ej3.buscarDatoID();
	}
	
	@Test
	void TestLeerDatosTarea() {
		Ejercicio3_1_1 ej3 = new Ejercicio3_1_1();
		ej3.leerDatosTareas();
	}
	
	@Test
	void TestLeerDatosTipoTarea() {
		Ejercicio3_1_1 ej3 = new Ejercicio3_1_1();
		ej3.leerDatosTipoTareas();
	}

}
