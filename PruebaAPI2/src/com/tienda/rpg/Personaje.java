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
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	            case 2:  Inventario.cantArmadura2 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	            case 3:  Inventario.cantArmadura3 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	            case 4:  Inventario.cantArma1 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	            case 5:  Inventario.cantArma2 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	            case 6:  Inventario.cantArma3 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	            case 7:  Inventario.cantIPocima1 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	            case 8:  Inventario.cantIPocima2 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	            		 break;
	            
	            case 9:  Inventario.cantIPocima3 += 1;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	            		 break;
	            
	            default: Inventario.cantIPocima1 += 0;
	            JOptionPane.showMessageDialog(null, "ITEM COMPRADO!");
	                     break;
	        }
			System.out.print(Personaje.dinero);
		}
		else {
			JOptionPane.showMessageDialog(null, "NO POSEE SUFICIENTE DINERO!");
			
		}

	}
	
	//VENDER
	public static void vender (int item, double price) {
		switch (item) 
        {
            case 1: if (Inventario.equiArmaduras[item-1]==true) {
		            	JOptionPane.showMessageDialog(null, "NO PUEDE VENDER UN ITEM EQUIPADO!");
		            }
		            else if (Inventario.cantArmadura1>=1) {
		            		Inventario.cantArmadura1 -=1;
		            		Personaje.dinero += price;
		            		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
		            }
		            else {
		            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
		            }
                     break;
                     
            case 2:  if (Inventario.equiArmaduras[item-1]==true) {
			            	JOptionPane.showMessageDialog(null, "NO PUEDE VENDER UN ITEM EQUIPADO!");
			            }
			            else if (Inventario.cantArmadura2>=1) {
			            		Inventario.cantArmadura2 -=1;
			            		Personaje.dinero += price;
			            		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
			            }
			            else {
			            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
			            }
			             break;
	                 
            case 3:  if (Inventario.equiArmaduras[item-1]==true) {
		            	JOptionPane.showMessageDialog(null, "NO PUEDE VENDER UN ITEM EQUIPADO!");
		            }
		            else if (Inventario.cantArmadura3>=1) {
		            		Inventario.cantArmadura3 -=1;
		            		Personaje.dinero += price;
		            		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
		            }
		            else {
		            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
		            }
		             break;
	                 
            case 4:  if (Inventario.equiArmas[item-4]==true) {
		            	JOptionPane.showMessageDialog(null, "NO PUEDE VENDER UN ITEM EQUIPADO!");
		            }
		            else if (Inventario.cantArma1>=1) {
		            		Inventario.cantArma1 -=1;
		            		Personaje.dinero += price;
		            		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
		            }
		            else {
		            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
		            }
		             break;
	                 
            case 5:  if (Inventario.equiArmas[item-4]==true) {
			            	JOptionPane.showMessageDialog(null, "NO PUEDE VENDER UN ITEM EQUIPADO!");
			            }
			            else if (Inventario.cantArma2>=1) {
			            		Inventario.cantArma2 -=1;
			            		Personaje.dinero += price;
			            		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
			            }
			            else {
			            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
			            }
			             break;
                 
            case 6:  if (Inventario.equiArmas[item-4]==true) {
		            	JOptionPane.showMessageDialog(null, "NO PUEDE VENDER UN ITEM EQUIPADO!");
		            }
		            else if (Inventario.cantArma3>=1) {
		            		Inventario.cantArma3 -=1;
		            		Personaje.dinero += price;
		            		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
		            }
		            else {
		            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
		            }
		             break;
                 
            case 7:  if (Inventario.cantIPocima1>=1) {
	        		Inventario.cantIPocima1 -=1;
	        		Personaje.dinero += price;
	        		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
	        		}
	        		
		            else {
		            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
		            }
	                 break;
                 
            case 8:  if (Inventario.cantIPocima2>=1) {
	        		Inventario.cantIPocima2 -=1;
	        		Personaje.dinero += price;
	        		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
	        		}
	        		
		            else {
		            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
		            }
	                 break;
            
            case 9:  if (Inventario.cantIPocima3>=1) {
	        		Inventario.cantIPocima3 -=1;
	        		Personaje.dinero += price;
	        		JOptionPane.showMessageDialog(null, "ITEM VENDIDO!");
	        		}
	        		
		            else {
		            	JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM!");
		            }
	                 break;
            
            default: Inventario.cantIPocima1 += 0;
                     break;
        }
		System.out.print(Personaje.dinero);
	}
	
	//EQUIPAR
	public static int equipar (int item, JsonObject json) {
		
		if (item == 1) {
			
			for (int i = 0; i <= 2; i++) {
				if (Inventario.equiArmaduras[i] == true) {
					JOptionPane.showMessageDialog(null, "USTED YA TIENE UNA AMRADURA EQUIPADA");
					return 0;
					}
				}
			
			if (Inventario.cantArmadura1 > 0) {
				Item.modStats(item, json);
				Inventario.equiArmaduras[item - 1] = true;
				JOptionPane.showMessageDialog(null, "ARMADURA EQUIPADA/");
				return 0;
			}
			
			else {
			JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
			return 0;
			}
		}
	////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		if (item == 2) {
			
			for (int i = 0; i <=2 ; i++) {
				if (Inventario.equiArmaduras[i] == true) {
					JOptionPane.showMessageDialog(null, "USTED YA TIENE UNA AMRADURA EQUIPADA");
					return 0;
					}
				}
			
			if (Inventario.cantArmadura2 > 0) {
				Item.modStats(item, json);
				Inventario.equiArmaduras[item - 1] = true;
				JOptionPane.showMessageDialog(null, "ARMADURA EQUIPADA/");
				return 0;
			}
			
			else {
			JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
			return 0;
			}
		}
		
	/////////////////////////////////////////////////////////////////////////////////////////////////
		if (item == 3) {
			
			for (int i = 0; i <= 2; i++) {
				if (Inventario.equiArmaduras[i] == true) {
					JOptionPane.showMessageDialog(null, "USTED YA TIENE UNA AMRADURA EQUIPADA");
					return 0;
					}
				}
			
			if (Inventario.cantArmadura3 > 0) {
				Item.modStats(item, json);
				Inventario.equiArmaduras[item - 1] = true;
				JOptionPane.showMessageDialog(null, "ARMADURA EQUIPADA/");
				return 0;
			}
			
			else {
			JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
			return 0;
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////
		if (item == 4) {
			
			for (int i = 0; i <= 2; i++) {
				if (Inventario.equiArmas[i] == true) {
					JOptionPane.showMessageDialog(null, "USTED YA TIENE UNA ARMA EQUIPADA");
					return 0;
					}
				}
			
			if (Inventario.cantArma1 > 0) {
				Item.modStats(item, json);
				Inventario.equiArmas[item - 4] = true;
				JOptionPane.showMessageDialog(null, "ARMA EQUIPADA/");
				return 0;
			}
			
			else {
			JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
			return 0;
			}
		}
		
		////////////////////////////////////////////////////////////////////////////////////////
		if (item == 5) {
			
			for (int i = 0; i <= 2; i++) {
				if (Inventario.equiArmas[i] == true) {
					JOptionPane.showMessageDialog(null, "USTED YA TIENE UNA ARMA EQUIPADA");
					return 0;
					}
				}
			
			if (Inventario.cantArma2 > 0) {
				Item.modStats(item, json);
				Inventario.equiArmas[item - 4] = true;
				JOptionPane.showMessageDialog(null, "ARMA EQUIPADA/");
				return 0;
			}
			
			else {
			JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
			return 0;
			}
		}
		
		//////////////////////////////////////////////////////////////////////////////////
		if (item == 6) {
			
			for (int i = 0; i <= 2; i++) {
				if (Inventario.equiArmas[i] == true) {
					JOptionPane.showMessageDialog(null, "USTED YA TIENE UNA ARMA EQUIPADA");
					return 0;
					}
				}
			
			if (Inventario.cantArma3 > 0) {
				Item.modStats(item, json);
				Inventario.equiArmas[item - 4] = true;
				JOptionPane.showMessageDialog(null, "ARMA EQUIPADA/");
				return 0;
			}
			
			else {
			JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
			return 0;
			}
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		if (item == 7) {
			if (Inventario.cantIPocima1 > 0) {
				Item.modStats(item, json);
				Inventario.equiPocimas[item - 7] = true;
				JOptionPane.showMessageDialog(null, "POCIMA EQUIPADA/");
				Inventario.cantIPocima1 -= 1;
				return 0;
			}
			else {
				JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
				return 0;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		if (item == 8) {
			if (Inventario.cantIPocima2 > 0) {
				Item.modStats(item, json);
				Inventario.equiPocimas[item - 7] = true;
				JOptionPane.showMessageDialog(null, "POCIMA EQUIPADA/");
				Inventario.cantIPocima2 -= 1;
				return 0;
			}
			else {
				JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
				return 0;
			}
		}
		//////////////////////////////////////////////////////////////
		if (item == 9) {
			if (Inventario.cantIPocima3 > 0) {
				Item.modStats(item, json);
				Inventario.equiPocimas[item - 1-6] = true;
				JOptionPane.showMessageDialog(null, "POCIMA EQUIPADA/");
				Inventario.cantIPocima3 -= 1;
				return 0;
			}
			else {
				JOptionPane.showMessageDialog(null, "NO POSEE ESTE ITEM");
				return 0;
				}
		}
		
		
		return 0;
	}

	//DESEQUIPAR
	public static void desequipar (int item, JsonObject json) {
		if (item == 1 || item == 2 || item == 3) {
				if (Inventario.equiArmaduras[item - 1] == false) {
					JOptionPane.showMessageDialog(null, "NO SE PUEDE DESEQUIPAR YA QUE ESTA ARMADURA NO SE ENCUENTRA EQUIPADA");
				}
				else {
			Item.modStatsInversos(item, json);
			Inventario.equiArmaduras[item - 1] = false;
			JOptionPane.showMessageDialog(null, "ARMADURA DESEQUIPADA");
				}
		}
		if (item == 4 || item == 5 || item == 6) {
				if (Inventario.equiArmas[item - 4] == true) {
					JOptionPane.showMessageDialog(null, "NO SE PUEDE DESEQUIPAR YA QUE ESTA ARMA NO SE ENCUENTRA EQUIPADA");
				}
				else {
			Item.modStatsInversos(item, json);
			Inventario.equiArmas[item - 4] = false;
			JOptionPane.showMessageDialog(null, "ARMA DESQUIPADA");
				}
		}
		
	}
}
