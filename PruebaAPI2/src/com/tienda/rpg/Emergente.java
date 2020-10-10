package com.tienda.rpg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.JsonObject;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
public class Emergente extends JFrame {

public static JPanel contentPane;
	
	public static EventQueue inicializador (String nombre,String categoria, String stat1, String stat2, JsonObject json, int item) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emergente frame = new Emergente();
					labels (nombre, categoria,stat1, stat2,json,item);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return null;
	}
	
	
	public static void labels (String Prueba, String categoria, String stat1, String stat2, JsonObject json, int item) {
		JLabel lblItem = new JLabel(Prueba);
		lblItem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblItem.setBounds(10, 11, 119, 27);
		contentPane.add(lblItem);
		
		JLabel lblNewLabel = new JLabel("Precio $");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(229, 53, 65, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(Double.toString((Item.defPrecioCompra(json))));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(320, 53, 75, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 Personaje.comprar(item, Item.defPrecioCompra(json));
			}
		});
		btnNewButton.setBounds(10, 49, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(229, 18, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(categoria);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(320, 18, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		/*
		JLabel lblNewLabel_4 = new JLabel("Stats:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 113, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(stat1);
		lblNewLabel_5.setBounds(10, 154, 70, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(stat2);
		lblNewLabel_6.setBounds(10, 192, 70, 14);
		contentPane.add(lblNewLabel_6);
		
		if (categoria == "Armadura") {
			JLabel lblNewLabel_7 = new JLabel(Double.toString(Item.modDestreza(json)));
			lblNewLabel_7.setBounds(89, 154, 46, 14);
			contentPane.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel(Integer.toString(Item.modResistencia(json)));
			lblNewLabel_8.setBounds(89, 192, 46, 14);
			contentPane.add(lblNewLabel_8);
		}
		
		if (categoria == "Arma") {
			JLabel lblNewLabel_7 = new JLabel(Double.toString(Item.modFuerza(json)));
			lblNewLabel_7.setBounds(89, 154, 46, 14);
			contentPane.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel(Double.toString(Item.modDestreza(json)));
			lblNewLabel_8.setBounds(89, 192, 46, 14);
			contentPane.add(lblNewLabel_8);
		}
		
		if (categoria == "Pocima") {
			JLabel lblNewLabel_7 = new JLabel(Double.toString(Item.modSabiduria(json)));
			lblNewLabel_7.setBounds(89, 154, 46, 14);
			contentPane.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel(Double.toString(Item.modCarisma(json)));
			lblNewLabel_8.setBounds(89, 192, 46, 14);
			contentPane.add(lblNewLabel_8);
		}
		*/
		
		if (categoria == "Armadura") {
			JLabel lblStat1 = new JLabel("DESTREZA");
			lblStat1.setBounds(10, 194, 71, 14);
			contentPane.add(lblStat1);
			
			JLabel lblStat2 = new JLabel("RESISTENCIA");
			lblStat2.setBounds(10, 219, 71, 14);
			contentPane.add(lblStat2);
		}
		
		else if (categoria == "Arma") {
			JLabel lblStat1 = new JLabel("FUERZA");
			lblStat1.setBounds(10, 194, 71, 14);
			contentPane.add(lblStat1);
			
			JLabel lblStat2 = new JLabel("DESTREZA");
			lblStat2.setBounds(10, 219, 71, 14);
			contentPane.add(lblStat2);
		}
		
		else if (categoria == "Pocima") {
			JLabel lblStat1 = new JLabel("SABIDURIA");
			lblStat1.setBounds(10, 194, 71, 14);
			contentPane.add(lblStat1);
			
			JLabel lblStat2 = new JLabel("CARISMA");
			lblStat2.setBounds(10, 219, 71, 14);
			contentPane.add(lblStat2);
		}
		
		//STATS ACTUALES
		if (categoria == "Armadura") {
			JLabel lblAntes1 = new JLabel(Integer.toString(Personaje.destreza));
			lblAntes1.setBounds(117, 194, 46, 14);
			contentPane.add(lblAntes1);
			
			JLabel lblAntes2 = new JLabel(Integer.toString(Personaje.resistencia));
			lblAntes2.setBounds(117, 219, 46, 14);
			contentPane.add(lblAntes2);	
		}
		
		else if (categoria == "Arma") {
			JLabel lblAntes1 = new JLabel(Integer.toString(Personaje.fuerza));
			lblAntes1.setBounds(117, 194, 46, 14);
			contentPane.add(lblAntes1);
			
			JLabel lblAntes2 = new JLabel(Integer.toString(Personaje.destreza));
			lblAntes2.setBounds(117, 219, 46, 14);
			contentPane.add(lblAntes2);
		}
		
		else if (categoria == "Pocima") {
			JLabel lblAntes1 = new JLabel(Integer.toString(Personaje.sabiduria));
			lblAntes1.setBounds(117, 194, 46, 14);
			contentPane.add(lblAntes1);
			
			JLabel lblAntes2 = new JLabel(Integer.toString(Personaje.carisma));
			lblAntes2.setBounds(117, 219, 46, 14);
			contentPane.add(lblAntes2);
		}
		
		//MOD PUNTOS DE STATS
		if (categoria == "Armadura") {
			JLabel lblMas1 = new JLabel(Double.toString(Item.modDestreza(json)));
			lblMas1.setBounds(208, 194, 46, 14);
			contentPane.add(lblMas1);
			
			JLabel lblMas2 = new JLabel(Integer.toString(Item.modResistencia(json)));
			lblMas2.setBounds(208, 219, 46, 14);
			contentPane.add(lblMas2);
		}
		
		else if (categoria == "Arma") {
			JLabel lblMas1 = new JLabel(Double.toString(Item.modFuerza(json)));
			lblMas1.setBounds(208, 194, 46, 14);
			contentPane.add(lblMas1);
			
			JLabel lblMas2 = new JLabel(Double.toString(Item.modDestreza(json)));
			lblMas2.setBounds(208, 219, 46, 14);
			contentPane.add(lblMas2);
		}
		
		else if (categoria == "Pocima") {
			JLabel lblMas1 = new JLabel(Double.toString(Item.modSabiduria(json)));
			lblMas1.setBounds(208, 194, 46, 14);
			contentPane.add(lblMas1);
			
			JLabel lblMas2 = new JLabel(Double.toString(Item.modCarisma(json)));
			lblMas2.setBounds(208, 219, 46, 14);
			contentPane.add(lblMas2);
		}
		
		//SUMA (AFECTACION DE STATS)
		if (categoria == "Armadura") {
			JLabel lblDesp1 = new JLabel(Double.toString(Item.modDestreza(json)+Personaje.destreza));
			lblDesp1.setBounds(299, 194, 46, 14);
			contentPane.add(lblDesp1);
			
			JLabel lblDesp2 = new JLabel(Integer.toString(Item.modResistencia(json)+Personaje.resistencia));
			lblDesp2.setBounds(299, 219, 46, 14);
			contentPane.add(lblDesp2);
		}
		
		else if (categoria == "Arma") {
			JLabel lblDesp1 = new JLabel(Double.toString(Item.modFuerza(json)+Personaje.fuerza));
			lblDesp1.setBounds(299, 194, 46, 14);
			contentPane.add(lblDesp1);
			
			JLabel lblDesp2 = new JLabel(Double.toString(Item.modDestreza(json)+Personaje.destreza));
			lblDesp2.setBounds(299, 219, 46, 14);
			contentPane.add(lblDesp2);
		}
		
		else if (categoria == "Pocima") {
			JLabel lblDesp1 = new JLabel(Double.toString(Item.modSabiduria(json)+Personaje.sabiduria));
			lblDesp1.setBounds(299, 194, 46, 14);
			contentPane.add(lblDesp1);
			
			JLabel lblDesp2 = new JLabel(Double.toString(Item.modCarisma(json)+Personaje.carisma));
			lblDesp2.setBounds(299, 219, 46, 14);
			contentPane.add(lblDesp2);

		}
		
	}
	
	/*
	public static void main(String[] args) {
		inicializador ("Tiulo");
		
	}*/
	
	public Emergente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblModStatsTit = new JLabel("MODIFICACION DE STATS:");
		lblModStatsTit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModStatsTit.setBounds(10, 147, 153, 14);
		contentPane.add(lblModStatsTit);
		
		JLabel lblStatTit = new JLabel("STAT:");
		lblStatTit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStatTit.setBounds(10, 172, 46, 14);
		contentPane.add(lblStatTit);
		
		JLabel lblAntesTit = new JLabel("ANTES:");
		lblAntesTit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAntesTit.setBounds(117, 172, 46, 14);
		contentPane.add(lblAntesTit);
		
		JLabel lblMasTit = new JLabel("    +");
		lblMasTit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMasTit.setBounds(208, 172, 46, 14);
		contentPane.add(lblMasTit);
		
		JLabel lblDespuesTit = new JLabel("DESPUES:");
		lblDespuesTit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDespuesTit.setBounds(299, 172, 79, 14);
		contentPane.add(lblDespuesTit);
		
		
		//labels ("");
		
	}
}
