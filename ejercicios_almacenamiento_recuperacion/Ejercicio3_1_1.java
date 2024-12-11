package ejercicios_almacenamiento_recuperacion;

import java.util.List;


import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.OID;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.oid.OIDFactory;

public class Ejercicio3_1_1 {

	public void insertarDato(Tareas tarea) {
		ODB base_datos = ODBFactory.open("F:/PruebaArchivos/Neodatis/tareas.db");
		base_datos.store(tarea);
		base_datos.close();
	}
	
	public void insertarDatos(List<Tareas> tareas) {
		ODB base_datos = ODBFactory.open("F:/PruebaArchivos/Neodatis/tareas.db");
		for (Tareas tarea : tareas) {
			base_datos.store(tarea);
		}
		base_datos.close();
	}
	
	public void buscarDatoID() {
		ODB base_datos = ODBFactory.open("F:/PruebaArchivos/Neodatis/tareas.db");
		OID buscador_id = OIDFactory.buildObjectOID(9);
		Tareas tarea = (Tareas) base_datos.getObjectFromId(buscador_id);
		System.out.println("TAREA BUSCADA POR EL OID: " + buscador_id);
		System.out.println(tarea.toString());
		base_datos.close();
	}
	
	public void leerDatosTareas() {
		ODB base_datos = ODBFactory.open("F:/PruebaArchivos/Neodatis/tareas.db");
		Objects<Tareas> objetos = base_datos.getObjects(Tareas.class);
		int num = 0;
		while(objetos.hasNext()) {
			Tareas tarea = objetos.next();
			num++;
			System.out.println("Tarea " + num + ":");
			System.out.println(tarea);
		}
		base_datos.close();
	}
	
	public void leerDatosTipoTareas() {
		ODB base_datos = ODBFactory.open("F:/PruebaArchivos/Neodatis/tareas.db");
		Objects<TipoTarea> objetos = base_datos.getObjects(TipoTarea.class);
		int num = 0;
		while(objetos.hasNext()) {
			TipoTarea tipo_tarea = objetos.next();
			num++;
			System.out.println("Tipo Tarea: " + num + ":");
			System.out.println(tipo_tarea);
		}
		base_datos.close();
	}

}
