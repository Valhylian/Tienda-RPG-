package com.tienda.rpg; 

import com.google.gson.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class APITienda {
	
	//RECIBE UN STRING Y REALIZA LA BUSQUEDA Y CONEXION CON EL API
	public static String conexionAPI (String busqueda) {
		OkHttpClient client = new OkHttpClient(); 

		Request request = new Request.Builder()
			.url("https://ali-express1.p.rapidapi.com/search?from=0&limit=1&country=CO&query="+busqueda)
			.get()
			.addHeader("x-rapidapi-host", "ali-express1.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "c3e91279f5msh5a0581899cb8440p1d1672jsn86dde192c4ec")
			.build();
		
		Response response;
		try {
			
			response = client.newCall(request).execute();
			//System.out.println(response.body().string());
			//response = client.newCall(request).execute(); 

	        String json = response.body().string();
	        json = json.replaceAll("[\\[\\]()]",""); //CONVERTIMOS EL ARREGLO A UN STRING CON FORMATO JSON
	        //System.out.println(json);
	        
	        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
	        
	        //IMPRME EL JSON DE FORMA ESTRUCTURADA (IDENTADA)
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonParser jp = new JsonParser();
            JsonElement je = jp.parse(json);
            String prettyJsonString = gson.toJson(je);
            //System.out.println(prettyJsonString);
            
            return json;
			
		} catch (Exception e) {
			
			System.out.println("error"+e.toString());
			return "";
		}
	}
		
	//MAIN PRUEBAS
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(conexionAPI ("Knife"));
	
	}*/

}
