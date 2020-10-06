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
	
	public static EventQueue inicializador (String nombre,String categoria, String stat1, String stat2, JsonObject json) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emergente frame = new Emergente();
					labels (nombre, categoria,stat1, stat2,json);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return null;
	}
	
	
	public static void labels (String Prueba, String categoria, String stat1, String stat2, JsonObject json) {
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
		//labels ("");
		
	}
}
