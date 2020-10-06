package com.tienda.rpg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class GUIInventario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIInventario frame = new GUIInventario();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(123, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(123, 97, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(123, 131, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(123, 165, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(123, 199, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(123, 233, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(123, 267, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(123, 301, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(123, 335, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(5, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(5, 93, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(5, 127, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(5, 161, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(5, 195, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(5, 229, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(5, 263, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(5, 297, 89, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBounds(5, 331, 89, 23);
		contentPane.add(button_7);
	}
}
