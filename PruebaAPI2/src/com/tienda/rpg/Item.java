package com.tienda.rpg;
//MANEJO DE LISTAS
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//MENJO DE JSON
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Item {

	public double precioCompra;
	public double precioVenta;
	public String categoria;
	public String name;
	public int cantidad;
	
	public Item(double venta, double compra, String categ, String nombre, int cant) {
		precioCompra = compra;
		precioVenta = venta;
		categoria = categ;
		name = nombre;
		cantidad = cant;
	}
	
	//LISTAS PARA ELECCION DEL NOMBRE
	public static List<String> armaduras = new ArrayList<>(Arrays.asList("Almete","Rajoy","Almofar","Alsebergo","Gambax","Merkel","Brunia","Cota","Gazerant","Pegaso","Seiya"));
	public static List<String> armas = new ArrayList<>(Arrays.asList("Agarth","Xalatath","Dardo","Angrist","Sucsamad","Zinrokh","AK-47","Galil","TAR-21","AK-48"));
	public static List<String> pocimas = new ArrayList<>(Arrays.asList("Celestial","Mineral","Arcanea","Fairy","Mermaid","ogre","Mopsus","Chispeante","Quodpot","Doxycida"));
	
	//LISTA DE STAT
	public static List<String> stats = new ArrayList<>(Arrays.asList("sabiduria","destreza","carisma","fuerza","resitencia"));
	
	
	//DEFINICION DEL NOMBRE DEL ITEM 
	public static String defName(JsonObject jsonObject, int posicion, List<String> categoria) {
		//PARAMETRO ID DE PRODUCTO
		int productId = jsonObject.get("productId").getAsInt();
		//LO TRANSFORMA SIEMPRE A POSITIVO
		if (productId<0) {
			productId = productId * -1;
		}
		
		int digito = AlgoritmosVarios.posicion(productId, posicion);//RETORNA EL DIG QUE ESTA EN LA POSICION
		
		System.out.print("productID\n");
		System.out.println(productId);

		String nombre = categoria.get(digito);
		System.out.println(categoria);
		System.out.println(digito);
		
		categoria.remove(digito);//ELEMINA EL NOMBRE DE LA LISTA (PARA QUE NO SE REPITAN)
		System.out.println(categoria);
		
		return nombre;
	}
	
	//PRECIO DE COMPRA 
	public static double defPrecioCompra(JsonObject jsonObject) {
		JsonElement value = jsonObject.get("productElements").getAsJsonObject().get("price").getAsJsonObject().get("sell_price").getAsJsonObject().get("value");
		double precio=Double.parseDouble(value.toString());
		System.out.println(precio);
		
		return precio;
	}
	
	//PRECIO DE VENTA 
	public static double defPrecioVenta(JsonObject jsonObject) {
		JsonElement value = jsonObject.get("productElements").getAsJsonObject().get("price").getAsJsonObject().get("sell_price").getAsJsonObject().get("value");
		double precio=Double.parseDouble(value.toString());
		
		precio = precio/2;
		System.out.println(precio);
		return precio;
	}
	
	//MODIFICACION DE STATS 
	
	//SABIDURIA
	public static double modSabiduria (JsonObject jsonObject) {
		JsonElement value = jsonObject.get("productElements").getAsJsonObject().get("trade").getAsJsonObject().get("elementId");
		double puntos=Double.parseDouble(value.toString());
		return puntos * 10;
	}
	
	//DESTREZA
	public static double modDestreza (JsonObject jsonObject) {
		JsonElement value = jsonObject.get("productElements").getAsJsonObject().get("view_more").getAsJsonObject().get("elementId");
		double puntos=Double.parseDouble(value.toString());
		return puntos * 10;
	}
	
	//CARISMA
	public static double modCarisma (JsonObject jsonObject) {
		JsonElement value = jsonObject.get("productElements").getAsJsonObject().get("logistics").getAsJsonObject().get("elementId");
		double puntos=Double.parseDouble(value.toString());
		return puntos * 10;
	}
	
	//FUERZA
	public static double modFuerza (JsonObject jsonObject) {
		JsonElement value = jsonObject.get("productElements").getAsJsonObject().get("image").getAsJsonObject().get("imgWidth");
		double puntos=Double.parseDouble(value.toString());
		return puntos;
	}
	
	//RESISTENCIA
	public static int modResistencia (JsonObject jsonObject) {
		int productId = jsonObject.get("productId").getAsInt();
		
		int puntos = AlgoritmosVarios.cantDigitos(productId);
		return puntos * 10;
	}
	
	//MOD STATS
	public static void modStats (int item, JsonObject json) {
		switch (item) 
        {
            case 1:  Personaje.destreza += Item.modDestreza(json);
            		 Personaje.resistencia += Item.modResistencia(json);
            		 System.out.print("DESTREZA Y RESISTENCIA");
            		 System.out.print(Personaje.destreza);
            		 System.out.print(Personaje.resistencia);
                     break;
            case 2:  Personaje.destreza += Item.modDestreza(json);
   		 			 Personaje.resistencia += Item.modResistencia(json);
   		 			 System.out.print("DESTREZA Y RESISTENCIA");
	           		 System.out.print(Personaje.destreza);
	           		 System.out.print(Personaje.resistencia);
                     break;
            case 3:  Personaje.destreza += Item.modDestreza(json);
	 			 	 Personaje.resistencia += Item.modResistencia(json);
                     break;
            case 4:  Personaje.destreza += Item.modDestreza(json);
		 	 		 Personaje.fuerza += Item.modFuerza(json);
                     break;
            case 5:  Personaje.destreza += Item.modDestreza(json);
	 		 		 Personaje.fuerza += Item.modFuerza(json);
                     break;
            case 6:  Personaje.destreza += Item.modDestreza(json);
	 		 		 Personaje.fuerza += Item.modFuerza(json);
                     break;
            case 7:  Personaje.sabiduria += Item.modSabiduria(json);
	 		 	 	 Personaje.carisma += Item.modCarisma(json);
                     break;
            case 8:  Personaje.sabiduria += Item.modSabiduria(json);
			 	 	 Personaje.carisma += Item.modCarisma(json);
		             break;
            case 9:  Personaje.sabiduria += Item.modSabiduria(json);
			 	 	 Personaje.carisma += Item.modCarisma(json);
		             break;
         
            default: Personaje.sabiduria += Item.modSabiduria(json);
			 	 	 Personaje.carisma += Item.modCarisma(json);
		             break;
        }
	}
	
	//MODIFICACION DE STATS (RESTANDO)
	public static void modStatsInversos (int item, JsonObject json) {
		switch (item) 
        {
            case 1:  Personaje.destreza -= Item.modDestreza(json);
            		 Personaje.resistencia -= Item.modResistencia(json);
            		 System.out.print("DESTREZA Y RESISTENCIA");
	           		 System.out.print(Personaje.destreza);
	           		 System.out.print(Personaje.resistencia);
                     break;
            case 2:  Personaje.destreza -= Item.modDestreza(json);
   		 			 Personaje.resistencia -= Item.modResistencia(json);
   		 			System.out.print("DESTREZA Y RESISTENCIA");
	           		 System.out.print(Personaje.destreza);
	           		 System.out.print(Personaje.resistencia);
                     break;
            case 3:  Personaje.destreza -= Item.modDestreza(json);
	 			 	 Personaje.resistencia -= Item.modResistencia(json);
                     break;
            case 4:  Personaje.destreza -= Item.modDestreza(json);
		 	 		 Personaje.fuerza -= Item.modFuerza(json);
                     break;
            case 5:  Personaje.destreza -= Item.modDestreza(json);
	 		 		 Personaje.fuerza -= Item.modFuerza(json);
                     break;
            case 6:  Personaje.destreza -= Item.modDestreza(json);
	 		 		 Personaje.fuerza -= Item.modFuerza(json);
                     break;
            case 7:  Personaje.sabiduria -= Item.modSabiduria(json);
	 		 	 	 Personaje.carisma -= Item.modCarisma(json);
                     break;
            case 8:  Personaje.sabiduria -= Item.modSabiduria(json);
			 	 	 Personaje.carisma -= Item.modCarisma(json);
		             break;
            case 9:  Personaje.sabiduria -= Item.modSabiduria(json);
			 	 	 Personaje.carisma -= Item.modCarisma(json);
		             break;
         
            default: Personaje.sabiduria -= Item.modSabiduria(json);
			 	 	 Personaje.carisma -= Item.modCarisma(json);
		             break;
        }
	}
}
