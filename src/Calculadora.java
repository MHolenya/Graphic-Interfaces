import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {

		Float primernumero;
		Float segundonumero;
		String operador;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 373);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		resultado.setBounds(10, 11, 206, 31);
		contentPane.add(resultado);
		resultado.setColumns(10);

		JButton num1 = new JButton("1");
		num1.setForeground(SystemColor.desktop);
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "1");
			}
		});
		num1.setBounds(10, 53, 44, 43);
		contentPane.add(num1);

		JButton btnborrar = new JButton("C");
		btnborrar.setForeground(SystemColor.desktop);
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText("");
			}
		});
		btnborrar.setBounds(118, 266, 98, 57);
		contentPane.add(btnborrar);

		JButton num2 = new JButton("2");
		num2.setForeground(SystemColor.desktop);
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "2");

			}
		});
		num2.setBounds(64, 53, 44, 43);
		contentPane.add(num2);

		JButton num3 = new JButton("3");
		num3.setForeground(SystemColor.desktop);
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "3");
			}
		});
		num3.setBounds(118, 53, 44, 43);
		contentPane.add(num3);

		JButton sumar = new JButton("+");
		sumar.setForeground(SystemColor.desktop);
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "+");

			}
		});
		sumar.setBounds(172, 107, 44, 43);
		contentPane.add(sumar);

		JButton restar = new JButton("-");
		restar.setForeground(SystemColor.desktop);
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "-");
			}
		});
		restar.setBounds(172, 53, 44, 43);
		contentPane.add(restar);

		JButton division = new JButton("/");
		division.setForeground(SystemColor.desktop);
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "/");
			}
		});
		division.setBounds(172, 212, 44, 43);
		contentPane.add(division);

		JButton multiplicacion = new JButton("x");
		multiplicacion.setForeground(SystemColor.desktop);
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "*");
			}
		});
		multiplicacion.setBounds(172, 161, 44, 43);
		contentPane.add(multiplicacion);

		JButton operacion = new JButton("=");
		operacion.setForeground(SystemColor.desktop);
		operacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String texto = resultado.getText().toString();
				String cadena1 = "";
				String cadena2 = "";
				double numero = 0;
				char operador = ' ';
				char[] caracteres = texto.toCharArray();
				for (int i = 0; i < caracteres.length; i++) {
					// comprobamos que operadpor se esta utilizando
					if ((caracteres[i]) == '/' || caracteres[i] == '+' || caracteres[i] == '-' || caracteres[i] == '*'
							|| caracteres[i] == 'R') {
						operador = caracteres[i];

					}
					if (operador == ' ') {
						cadena1 = cadena1 + Character.toString(caracteres[i]);

					} else if (operador == '/' || operador == '+' || operador == '-' || operador == '*'
							|| operador == 'R') {
						cadena2 = cadena2 + Character.toString(caracteres[i]);
					}
				}
				cadena2 = cadena2.replace(operador, ' ');
				// Depende del operador hace una o otra operacion
				switch (operador) {
				// division
				case '/':
					if (cadena1.length() < cadena2.length()) {
						resultado.setText("Error no se puede dividir");
					} else {
						numero = Math.round((Double.parseDouble(cadena1) / Double.parseDouble(cadena2)));
						resultado.setText(String.valueOf(numero));
					}
					break;
				// Suma
				case '+':
					numero = (Double.parseDouble(cadena1) + Double.parseDouble(cadena2));
					resultado.setText(String.valueOf(numero));
					break;
				// Resta
				case '-':
					numero = (Double.parseDouble(cadena1) - Double.parseDouble(cadena2));
					resultado.setText(String.valueOf(numero));
					break;
				// multiplicacion
				case '*':
					numero = Math.round(Double.parseDouble(cadena1) * Double.parseDouble(cadena2));
					resultado.setText(String.valueOf(numero));
					// Raiz caudrada
				case 'R':
					numero = Math.sqrt(Double.parseDouble(cadena1));
					resultado.setText(String.valueOf(numero));
					break;

				}

			}
		});
		operacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		operacion.setBounds(10, 266, 98, 57);
		contentPane.add(operacion);

		JButton num4 = new JButton("4");
		num4.setForeground(SystemColor.desktop);
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "4");
			}
		});
		num4.setBounds(10, 107, 44, 43);
		contentPane.add(num4);

		JButton num5 = new JButton("5");
		num5.setForeground(SystemColor.desktop);
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "5");

			}
		});
		num5.setBounds(66, 107, 44, 43);
		contentPane.add(num5);

		JButton num6 = new JButton("6");
		num6.setForeground(SystemColor.desktop);
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "6");
			}
		});
		num6.setBounds(118, 107, 44, 43);
		contentPane.add(num6);

		JButton num7 = new JButton("7");
		num7.setForeground(SystemColor.desktop);
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "7");
			}
		});
		num7.setBounds(10, 158, 44, 43);
		contentPane.add(num7);

		JButton num8 = new JButton("8");
		num8.setForeground(SystemColor.desktop);
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "8");
			}
		});
		num8.setBounds(66, 158, 44, 43);
		contentPane.add(num8);

		JButton num9 = new JButton("9");
		num9.setForeground(SystemColor.desktop);
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "9");
			}
		});
		num9.setBounds(118, 158, 44, 43);
		contentPane.add(num9);

		JButton num0 = new JButton("0");
		num0.setForeground(SystemColor.desktop);
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "0");
			}
		});
		num0.setBounds(64, 212, 44, 43);
		contentPane.add(num0);

		JButton punto = new JButton(".");
		punto.setForeground(SystemColor.desktop);
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (String.valueOf(resultado) == "") {
					resultado.setText(resultado.getText() + "0.");
				} else {
					resultado.setText(resultado.getText() + ".");
				}

			}
		});

		punto.setBounds(10, 212, 44, 43);
		contentPane.add(punto);

		JButton raiz = new JButton("R");
		raiz.setForeground(SystemColor.desktop);
		raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// introducimos el numero cada vez que se le da al boton
				resultado.setText(resultado.getText() + "R");
			}
		});
		raiz.setBounds(118, 212, 44, 43);
		contentPane.add(raiz);
	}
}
