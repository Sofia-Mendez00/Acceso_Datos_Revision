package ejercicios_almacenamiento_recuperacion;

public class TipoTarea {

	private int id;
	private String abreviatura;
	private String descripcion;

	public TipoTarea(int id) {
		this.id = id;
	}
	
	public TipoTarea(int id, String abrev, String descrip) {
		this.id = id;
		this.abreviatura = abrev;
		this.descripcion = descrip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " Abreviatura: " + abreviatura + " Descripción: " + descripcion;
	}

}
