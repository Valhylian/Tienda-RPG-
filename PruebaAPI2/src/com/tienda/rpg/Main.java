package com.tienda.rpg;

import java.awt.EventQueue;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
	
	//ITEMS 
	public static String armadura1;
	public static String armadura2;
	public static String armadura3;
	
	public static String arma1;
	public static String arma2;
	public static String arma3;
	
	public static String pocima1;
	public static String pocima2;
	public static String pocima3;
	
	//JSON QUE RETORNA EL API
	public JsonObject jsonObject1;

	public static void main(String[] args) {
		
		try {
				//CONEXION CON API
				String resRequest = (API.conexionAPI2 ("Knife"));
				JSONArray jsonArray = new JSONArray(resRequest);
				//DIVISION DEL JSON ARRAY
				JSONObject jsonItem1 = jsonArray.getJSONObject(0);
				JSONObject jsonItem2 = jsonArray.getJSONObject(1);
				JSONObject jsonItem3 = jsonArray.getJSONObject(2);
				JSONObject jsonItem4 = jsonArray.getJSONObject(3);
				JSONObject jsonItem5 = jsonArray.getJSONObject(4);
				JSONObject jsonItem6 = jsonArray.getJSONObject(5);
				JSONObject jsonItem7 = jsonArray.getJSONObject(6);
				JSONObject jsonItem8 = jsonArray.getJSONObject(7);
				JSONObject jsonItem9 = jsonArray.getJSONObject(8);
				//CONVERSION A JsonObjet
				JsonObject jsonObject1 = new JsonParser().parse(jsonItem1.toString()).getAsJsonObject();
				JsonObject jsonObject2 = new JsonParser().parse(jsonItem2.toString()).getAsJsonObject();
				JsonObject jsonObject3 = new JsonParser().parse(jsonItem3.toString()).getAsJsonObject();
				JsonObject jsonObject4 = new JsonParser().parse(jsonItem4.toString()).getAsJsonObject();
				JsonObject jsonObject5 = new JsonParser().parse(jsonItem5.toString()).getAsJsonObject();
				JsonObject jsonObject6 = new JsonParser().parse(jsonItem6.toString()).getAsJsonObject();
				JsonObject jsonObject7 = new JsonParser().parse(jsonItem7.toString()).getAsJsonObject();
				JsonObject jsonObject8 = new JsonParser().parse(jsonItem8.toString()).getAsJsonObject();
				JsonObject jsonObject9 = new JsonParser().parse(jsonItem9.toString()).getAsJsonObject();
				
				//DEFINICION DE NOMBRES DE LOS ITEMS SEGUN EL API
				Main.armadura1 = Item.defName(jsonObject1, 0, Item.armaduras);
				Main.armadura2 = Item.defName(jsonObject2, 1, Item.armaduras);
				Main.armadura3 = Item.defName(jsonObject3, 2, Item.armaduras);
				
				Main.arma1 = Item.defName(jsonObject4, 0, Item.armas);
				Main.arma2 = Item.defName(jsonObject5, 1, Item.armas);
				Main.arma3 = Item.defName(jsonObject6, 2, Item.armas);
				
				Main.pocima1 = Item.defName(jsonObject7, 0, Item.pocimas);
				Main.pocima2 = Item.defName(jsonObject8, 1, Item.pocimas);
				Main.pocima3 = Item.defName(jsonObject9, 2, Item.pocimas);
				
				
				/*EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							InterfazTienda window = new InterfazTienda();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				})*/
				
				//EJECUCION DE LA INTERFAZ
				InterfazTienda.init(jsonObject1, jsonObject2, jsonObject3, jsonObject4, jsonObject5, jsonObject6, jsonObject7, jsonObject8, jsonObject9);
			} 
		
		catch (Exception e) {
				System.out.print("aqui\n");
				// TODO Auto-generated catch block
				System.out.print(e.toString());
			}
		
		
		
		
		
	}


}
