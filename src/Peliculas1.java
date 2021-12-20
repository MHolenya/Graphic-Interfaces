import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Peliculas1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas1 frame = new Peliculas1();
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
	public Peliculas1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox Box_1 = new JComboBox();
		Box_1.setBounds(270, 62, 125, 22);
		Box_1.addItem("la vida es bella");
		contentPane.add(Box_1);
		
		JTextPane Texto_1 = new JTextPane();
		Texto_1.setBounds(10, 62, 150, 22);
		contentPane.add(Texto_1);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de tu pelicula");
		lblNewLabel.setBounds(10, 37, 150, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setBounds(304, 37, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton boton1 = new JButton("Añadir");
		boton1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//VAriable que almacena los datos 
				String datos=Texto_1.getText();
				//combobox almacena los datos 
				Box_1.addItem(datos);
				//Limpiamos la caja de texto
				Texto_1.setText("");
				//Hacemos foco en la caja de texto
				Texto_1.requestFocus();
				
			}
		});
		boton1.setBounds(10, 129, 89, 23);
		contentPane.add(boton1);
	}
}
