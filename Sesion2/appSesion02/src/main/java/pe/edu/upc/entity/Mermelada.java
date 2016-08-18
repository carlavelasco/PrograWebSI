package pe.edu.upc.entity;

public class Mermelada extends Fruta {
	protected int tiempoPreparacion; //el protected se usa en herencia,clases hija,puede estar en otro paquete (lo que no puede el private)
	protected String tipoEnvase;

	public Mermelada(String color, String sabor,
					int tiempoPreparacion, String tipoEnvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempoPreparacion = tiempoPreparacion;
		this.tipoEnvase = tipoEnvase;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	@Override
	public String toString() {
		return "Mermelada [tiempoPreparacion=" + tiempoPreparacion + ", tipoEnvase=" + tipoEnvase + "]";
	}
	

}
