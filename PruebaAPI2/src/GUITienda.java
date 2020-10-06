import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.tienda.rpg.Item;
import com.tienda.rpg.Main;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuBar;

public class GUITienda {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITienda window = new GUITienda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUITienda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 589, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIENDA RPG.");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 175, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ARMADURAS:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(30, 49, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ARMAS");
		lblNewLabel_2.setBounds(195, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("POCIONES");
		lblNewLabel_3.setBounds(335, 49, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	
		JButton btnNewButton = new JButton(Main.armadura1);
		btnNewButton.setBounds(10, 74, 119, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(Main.armadura2);
		btnNewButton_1.setBounds(10, 110, 119, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(Main.armadura3);
		btnNewButton_2.setBounds(10, 144, 119, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(Main.arma1);
		btnNewButton_3.setBounds(156, 74, 119, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(Main.arma2);
		btnNewButton_4.setBounds(156, 110, 119, 27);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton(Main.arma3);
		btnNewButton_5.setBounds(156, 144, 119, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton(Main.pocima1);
		btnNewButton_6.setBounds(308, 75, 112, 24);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton(Main.pocima2);
		btnNewButton_7.setBounds(308, 110, 112, 25);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton(Main.pocima3);
		btnNewButton_8.setBounds(308, 144, 112, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("INVENTARIO.");
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_9.setBounds(427, 235, 110, 42);
		frame.getContentPane().add(btnNewButton_9);
		
		JLabel lblNewLabel_4 = new JLabel("Drathel");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 178, 112, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblSabiduria = new JLabel("SABIDURIA");
		lblSabiduria.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSabiduria.setBounds(10, 214, 82, 14);
		frame.getContentPane().add(lblSabiduria);
		
		JLabel lblDestreza = new JLabel("DESTREZA");
		lblDestreza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestreza.setBounds(10, 249, 63, 14);
		frame.getContentPane().add(lblDestreza);
		
		JLabel lblCarisma = new JLabel("CARISMA");
		lblCarisma.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCarisma.setBounds(10, 284, 63, 14);
		frame.getContentPane().add(lblCarisma);
		
		JLabel lblFuerza = new JLabel("FUERZA");
		lblFuerza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuerza.setBounds(182, 214, 46, 14);
		frame.getContentPane().add(lblFuerza);
		
		JLabel lblResistencia = new JLabel("RESISTENCIA");
		lblResistencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResistencia.setBounds(182, 249, 82, 14);
		frame.getContentPane().add(lblResistencia);
		
		JLabel statSabiduria = new JLabel("New label");
		statSabiduria.setBounds(83, 214, 46, 14);
		frame.getContentPane().add(statSabiduria);
		
		JLabel statDestreza = new JLabel("New label");
		statDestreza.setBounds(83, 249, 46, 14);
		frame.getContentPane().add(statDestreza);
		
		JLabel statCarisma = new JLabel("New label");
		statCarisma.setBounds(83, 284, 46, 14);
		frame.getContentPane().add(statCarisma);
		
		JLabel statFuerza = new JLabel("New label");
		statFuerza.setBounds(274, 214, 46, 14);
		frame.getContentPane().add(statFuerza);
		
		JLabel statResistencia = new JLabel("New label");
		statResistencia.setBounds(274, 249, 46, 14);
		frame.getContentPane().add(statResistencia);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(374, 302, 9, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(393, 304, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
