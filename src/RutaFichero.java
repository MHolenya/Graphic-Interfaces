import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class RutaFichero extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RutaFichero frame = new RutaFichero();
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
	public RutaFichero() {
		setTitle("Mostrar ruta de Fichero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pulsa el boton y elige una ruta");
		lblNewLabel.setBounds(10, 46, 295, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnabrir = new JButton("Abrir");
		btnabrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Crea una instancia del cuadro de dialogo y establece el modo de seleccion a archivos
				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				int result= chooser.showOpenDialog(btnabrir);
				if(result != JFileChooser.CANCEL_OPTION) {
					File filename = chooser.getSelectedFile();
					
					if((filename == null) || (filename.getName().equals(""))) {
						textField.setText("....");
					}else {
						textField.setText(filename.getAbsolutePath());
					}
				}
					
			}
		});
		btnabrir.setBounds(344, 77, 89, 29);
		contentPane.add(btnabrir);
		
		textField = new JTextField();
		textField.setBounds(10, 77, 316, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
}
