package ejercicios_almacenamiento_recuperacion;

public class Tareas {
	
	private int id;
	private String descripcion;
	private String fecha_inicio;
	private String fecha_final;
	private boolean finalizado;
	private TipoTarea tipo_tarea;
	
	public Tareas(int id, String descripcion, String fecha_ini, String fecha_fin, boolean fin, TipoTarea tipo) {
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_inicio = fecha_ini;
		this.fecha_final = fecha_fin;
		this.finalizado = fin;
		this.tipo_tarea = tipo;
	}

	public TipoTarea getTipo_tarea() {
		return tipo_tarea;
	}

	public void setTipo_tarea(TipoTarea tipo_tarea) {
		this.tipo_tarea = tipo_tarea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(String fecha_final) {
		this.fecha_final = fecha_final;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	
	@Override
	public String toString() {
		return " ID: " + id + "\n Descripción: " + descripcion + "\n Fecha Inicio: " + fecha_inicio + "\n Fecha Final: " + fecha_final + "\n Finalizado: " + finalizado + "\n TipoTarea: " + tipo_tarea;
	}

}
