package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;
import pe.edu.upc.entity.Mermelada;

public class appFruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Fruta f = new Fruta ("Amarillo", "Dulce");
   
   Mermelada mer = new Mermelada ("Rojo", "Acido", 1, "Vidrio");

   System.out.println(f.toString());
   f.SoyUnMetodoObjeto();
   Fruta.LugarOrigen = "Tierra"; //atributo tipo clase
   Fruta.SoyUnMetodoGlobal();
   System.out.println(mer.toString());
   mer.SoyUnMetodoObjeto();
   
	}

}
