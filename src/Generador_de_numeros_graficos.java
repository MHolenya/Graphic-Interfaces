import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Generador_de_numeros_graficos extends JFrame {

	private JPanel contentPane;
	private JTextField texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				
				
				try {
					
					Generador_de_numeros_graficos frame = new Generador_de_numeros_graficos();
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
	public Generador_de_numeros_graficos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner contador = new JSpinner();
		contador.setBounds(10, 11, 30, 64);
		contentPane.add(contador);
		
		texto = new JTextField();
		texto.setBounds(10, 78, 277, 29);
		contentPane.add(texto);
		texto.setColumns(10);
		
		
		JSpinner contador2 = new JSpinner();
		contador2.setBounds(136, 11, 30, 64);
		contentPane.add(contador2);
		
		JSpinner contador3 = new JSpinner();
		contador3.setBounds(257, 11, 30, 64);
		contentPane.add(contador3);
		
		JButton generar = new JButton("Generar");
		generar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			texto.setEditable(false);
			
			 int num1 = (int) contador.getValue();
			 int num2 = (int) contador2.getValue();
			 int num3 = (int) contador3.getValue();
			// int random = (int) (Math.Random()*3)+1
			 Random rand = new Random();
			 
			List<Integer> array_aleatorio = Arrays.asList(num1, num2 , num3);
			 
			 for(int i=0; i<6; i++) {
				 int nAleatorio = rand.nextInt(array_aleatorio.size());
				 Integer elementoAzar = array_aleatorio.get(nAleatorio);
				 texto.setText((elementoAzar +""));
			 }
			
			 
			 
			 
				
				
			}
		});
		generar.setBounds(10, 111, 89, 23);
		contentPane.add(generar);
		
		
		
		JButton borrar = new JButton("Borrar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("");
			}
		});
		borrar.setBounds(176, 111, 89, 23);
		contentPane.add(borrar);
		
		JButton Mostrar = new JButton("Mostar");
		Mostrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				texto.setText(contador.getValue()+ "" + contador2.getValue()+ "" + contador3.getValue());
			}
			
			
		});
		Mostrar.setBounds(94, 111, 89, 23);
		contentPane.add(Mostrar);
	}
}
