package com.tienda.rpg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.JsonObject;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class GUI_Info_Item extends JFrame {

	private static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void inicializador (String name, String categoria, JsonObject json) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Info_Item frame = new GUI_Info_Item();
					cargarLabelDatos (name, categoria, json);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Info_Item() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoTip = new JLabel("TIPO:");
		lblTipoTip.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoTip.setBounds(197, 23, 46, 14);
		contentPane.add(lblTipoTip);
	
		JLabel lblPrecioTit = new JLabel("PRECIO VENTA:");
		lblPrecioTit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecioTit.setBounds(197, 51, 92, 14);
		contentPane.add(lblPrecioTit);
		
		JLabel lblEquipadoTit = new JLabel("EQUIPADO:");
		lblEquipadoTit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipadoTit.setBounds(197, 80, 79, 14);
		contentPane.add(lblEquipadoTit);
		
		JButton btnEquipar = new JButton("EQUIPAR.");
		btnEquipar.setBounds(10, 42, 89, 23);
		contentPane.add(btnEquipar);
		
		JButton btnVender = new JButton("VENDER.");
		btnVender.setBounds(10, 76, 89, 23);
		contentPane.add(btnVender);
		
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
	}
	
	
	public static void cargarLabelDatos (String name, String categoria, JsonObject json) {
		//TITULO
		JLabel lblTitulo = new JLabel(name);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTitulo.setBounds(10, 11, 97, 26);
		contentPane.add(lblTitulo);
		
		JLabel lblTipo = new JLabel(categoria);
		lblTipo.setBounds(299, 19, 79, 14);
		contentPane.add(lblTipo);
		
		JLabel lblPrecio = new JLabel(Double.toString(Item.defPrecioVenta(json)));
		lblPrecio.setBounds(299, 51, 79, 14);
		contentPane.add(lblPrecio);
		///////////////////////////////////////////////////////////
		JLabel lblEquipado = new JLabel("New label");//FALTAAAA
		lblEquipado.setBounds(299, 80, 46, 14);
		contentPane.add(lblEquipado);
		////////////////////////////////////////////////////////////
		
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
}
