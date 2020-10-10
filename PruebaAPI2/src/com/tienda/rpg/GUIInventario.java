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
import javax.swing.JCheckBox;

public class GUIInventario extends JFrame {

	private static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void initInventario(JsonObject json1,JsonObject json2,JsonObject json3,JsonObject json4,JsonObject json5,JsonObject json6,JsonObject json7,JsonObject json8,JsonObject json9) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIInventario frame = new GUIInventario();
					generarBotones(json1,json2,json3,json4,json5,json6,json7,json8,json9);
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
	public GUIInventario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 197, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInventario = new JLabel("INVENTARIO!");
		lblInventario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblInventario.setBounds(24, 0, 135, 27);
		contentPane.add(lblInventario);
		
		JLabel lblItems = new JLabel("Items.");
		lblItems.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblItems.setBounds(5, 34, 84, 14);
		contentPane.add(lblItems);
		
		JLabel lblCant = new JLabel("Cant.");
		lblCant.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCant.setBounds(133, 34, 46, 14);
		contentPane.add(lblCant);
		
		JLabel lblNewLabel = new JLabel(Integer.toString(Inventario.cantArmadura1));
		lblNewLabel.setBounds(123, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(Integer.toString(Inventario.cantArmadura2));
		lblNewLabel_1.setBounds(123, 97, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(Integer.toString(Inventario.cantArmadura3));
		lblNewLabel_2.setBounds(123, 131, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(Integer.toString(Inventario.cantArma1));
		lblNewLabel_3.setBounds(123, 165, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(Integer.toString(Inventario.cantArma2));
		lblNewLabel_4.setBounds(123, 199, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(Integer.toString(Inventario.cantArma3));
		lblNewLabel_5.setBounds(123, 233, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(Integer.toString(Inventario.cantIPocima1));
		lblNewLabel_6.setBounds(123, 267, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(Integer.toString(Inventario.cantIPocima2));
		lblNewLabel_7.setBounds(123, 301, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(Integer.toString(Inventario.cantIPocima3));
		lblNewLabel_8.setBounds(123, 335, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		
	}
	
	public static void generarBotones(JsonObject json1,JsonObject json2,JsonObject json3,JsonObject json4,JsonObject json5,JsonObject json6,JsonObject json7,JsonObject json8,JsonObject json9) {
		JButton btnNewButton = new JButton(Main.armadura1);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.armadura1, "Armadura", json1);
			}
		});
		btnNewButton.setBounds(5, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton(Main.armadura2);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.armadura2, "Armadura", json2);
			}
		});
		button.setBounds(5, 93, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton(Main.armadura3);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.armadura3, "Armadura", json3);
			}
		});
		button_1.setBounds(5, 127, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton(Main.arma1);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.arma1, "Arma", json4);
			}
		});
		button_2.setBounds(5, 161, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(Main.arma2);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.arma2, "Arma", json5);
			}
		});
		button_3.setBounds(5, 195, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton(Main.arma3);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.arma3, "Arma", json6);
			}
		});
		button_4.setBounds(5, 229, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton(Main.pocima1);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.pocima1, "Pocima", json7);
			}
		});
		button_5.setBounds(5, 263, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton(Main.pocima2);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.pocima2, "Pocima", json8);
			}
		});
		button_6.setBounds(5, 297, 89, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton(Main.pocima3);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Info_Item.inicializador(Main.pocima3, "Pocima", json9);
			}
		});
		button_7.setBounds(5, 331, 89, 23);
		contentPane.add(button_7);
	}
}
