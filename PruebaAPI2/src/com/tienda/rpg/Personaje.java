package com.tienda.rpg;

import com.google.gson.JsonObject;
import javax.swing.JOptionPane;
import com.google.gson.JsonParser;

public class Personaje {
	
	//STATS
	public static int sabiduria = 300;
	public static int destreza = 300;;
	public static int carisma = 300;;
	public static int fuerza = 300;;
	public static int resistencia = 300;;

	//DINERO
	public static double dinero = 2000;
	
	
	//COMRPAR
	public static void comprar (int item, double price) {
		if (price<Personaje.dinero) {
			
			Personaje.dinero -= price;
			switch (item) 
	        {
	            case 1:  Inventario.cantArmadura1 += 1;
	                     break;
	            case 2:  Inventario.cantArmadura2 += 1;
	                     break;
	            case 3:  Inventario.cantArmadura3 += 1;
	                     break;
	            case 4:  Inventario.cantArma1 += 1;
	                     break;
	            case 5:  Inventario.cantArma2 += 1;
	                     break;
	            case 6:  Inventario.cantArma3 += 1;
	                     break;
	            case 7:  Inventario.cantIPocima1 += 1;
	                     break;
	            case 8:  Inventario.cantIPocima2 += 1;
	            		 break;
	            
	            case 9:  Inventario.cantIPocima3 += 1;
	            		 break;
	            
	            default: Inventario.cantIPocima1 += 0;
	                     break;
	        }
		}
		else {
			JOptionPane.showMessageDialog(null, "NO POSEE SUFICIENTE DINERO!");
			
		}

	}
	
	


}
