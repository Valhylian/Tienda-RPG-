package com.tienda.rpg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ViewStats extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void preView() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStats frame = new ViewStats();
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
	public ViewStats() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 342, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSabiduria = new JLabel("SABIDURIA");
		lblSabiduria.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSabiduria.setBounds(10, 96, 82, 14);
		contentPane.add(lblSabiduria);
		
		JLabel lblDestreza = new JLabel("DESTREZA");
		lblDestreza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestreza.setBounds(10, 130, 63, 14);
		contentPane.add(lblDestreza);
		
		JLabel lblCarisma = new JLabel("CARISMA");
		lblCarisma.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCarisma.setBounds(10, 165, 63, 14);
		contentPane.add(lblCarisma);
		
		JLabel lblFuerza = new JLabel("FUERZA");
		lblFuerza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuerza.setBounds(173, 96, 46, 14);
		contentPane.add(lblFuerza);
		
		JLabel lblResistencia = new JLabel("RESISTENCIA");
		lblResistencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResistencia.setBounds(163, 130, 82, 14);
		contentPane.add(lblResistencia);
		
		JLabel statSabiduria = new JLabel(Integer.toString( Personaje.sabiduria));
		statSabiduria.setBounds(102, 96, 46, 14);
		contentPane.add(statSabiduria);
		
		JLabel statDestreza = new JLabel(Integer.toString( Personaje.destreza));
		statDestreza.setBounds(102, 130, 46, 14);
		contentPane.add(statDestreza);
		
		JLabel statCarisma = new JLabel(Integer.toString( Personaje.carisma));
		statCarisma.setBounds(102, 165, 46, 14);
		contentPane.add(statCarisma);
		
		JLabel statFuerza = new JLabel(Integer.toString( Personaje.fuerza));
		statFuerza.setBounds(274, 96, 46, 14);
		contentPane.add(statFuerza);
		
		JLabel statResistencia = new JLabel(Integer.toString( Personaje.resistencia));
		statResistencia.setBounds(274, 130, 46, 14);
		contentPane.add(statResistencia);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(10, 239, 20, 32);
		contentPane.add(label);
		
		JLabel lblNewLabel_5 = new JLabel(Double.toString( Personaje.dinero));
		lblNewLabel_5.setBounds(40, 251, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("INFORMACION DEL PERSONAJE.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(22, 11, 287, 32);
		contentPane.add(lblNewLabel);
		
	}

}
