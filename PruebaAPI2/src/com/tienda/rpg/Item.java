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

	public int precioCompra;
	public int precioVenta;
	public String categoria;
	public String name;
	
	//LISTAS PARA ELECCION DEL NOMBRE
	public static List<String> armaduras = new ArrayList<>(Arrays.asList("Almete","Rajoy","Almofar","Alsebergo","Gambax","Merkel","armadura4","armadura3","armadura2","armadura1","armadura0"));
	public static List<String> armas = new ArrayList<>(Arrays.asList("Agarth","Xalatath","Dardo","Angrist","Sucsamad","Zinrokh","arma3","arma2","arma1","arma0"));
	public static List<String> pocimas = new ArrayList<>(Arrays.asList("Celestial","Mineral","Arcanea","Fairy","Mermaid","ogre","algo3","algo2","algo1","algo0"));
	
	//LISTA DE STATS
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
}
