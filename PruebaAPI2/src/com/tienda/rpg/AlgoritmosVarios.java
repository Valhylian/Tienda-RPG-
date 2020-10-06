package com.tienda.rpg;

public class AlgoritmosVarios {

	//ALGORITMO QUE RECORRE UN NUMERO Y RETORNA LA POSICION NECEISTADA
	//0 = ULTIMO DIGITO
	public static int posicion(int num, int pos) {
		int cont = 0;
		for (cont=0; cont<=pos; cont++) {
			if (cont == pos) {
				return num%10;
			}
			num = num/10;
		}
		return num%10;
	}
	
	
	
	//CANTIDAD DE DIG DE UN NUMERO
	public static int cantDigitos(int num) {
		int dig = 0;
		
		if (num<10) {
			return 1;
		}
		
		while (num>0) {
			num = num/10;
			dig += 1;
		}
		return dig;
	}
	
	

}
