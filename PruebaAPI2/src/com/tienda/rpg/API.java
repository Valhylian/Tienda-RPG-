package com.tienda.rpg;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class API {
	
	public static String conexionAPI2 (String busqueda) {
		
		OkHttpClient client = new OkHttpClient(); 

		Request request = new Request.Builder()
			.url("https://ali-express1.p.rapidapi.com/search?from=0&limit=20&country=CO&query="+busqueda)
			.get()
			.addHeader("x-rapidapi-host", "ali-express1.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "c3e91279f5msh5a0581899cb8440p1d1672jsn86dde192c4ec")
			.build();

        Response response;
        try {

            response = client.newCall(request).execute();
            String json = response.body().string();
            
            JSONArray jsonArray = new JSONArray(json); 
            System.out.println(jsonArray);
            //jsonArray.getJSONObject(indice).toString();
            
            return  jsonArray.toString();

        } catch (Exception e) {
            // TODO Auto-generated catch block
        	System.out.println("error de conexion api\n");
            System.out.println("error"+e.toString());
            return  "";
        }
    }
}


