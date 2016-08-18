package pe.edu.upc.entity;

public class Fruta {

	//Atributos de instancia
	private String color;
	private String sabor;
	//Atrbiutos de clase
	public static String LugarOrigen = "UPC";
	
	//Constructores
	public Fruta(String color, String sabor) {
		super();  // para poder acceder de una clase hija hasta una clase padre
		this.color = color;   //referencia a elementos en la misma clase
		this.sabor = sabor;
	}
	
	public static void SoyUnMetodoGlobal() {} //el static hace que el atributo pertenezca a la clase y ya no al objeto
	
	public void SoyUnMetodoObjeto() {}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	//al autocompletar con To
	@Override //los que son heredados, notaciones
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-"+this.getColor();
		
	}
	
	
	
	
	
}
