import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practica1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica1 frame = new Practica1();
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
	public Practica1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbusuario = new JLabel("Usuario");
		lbusuario.setBounds(10, 11, 121, 23);
		contentPane.add(lbusuario);
		
		JLabel lbcontraseña = new JLabel("Contrase\u00F1a:");
		lbcontraseña.setBounds(10, 51, 121, 23);
		contentPane.add(lbcontraseña);
		
		JFormattedTextField usuario = new JFormattedTextField();
		usuario.setBounds(163, 12, 176, 23);
		contentPane.add(usuario);
		
		password = new JPasswordField();
		password.setBounds(163, 52, 176, 22);
		contentPane.add(password);
		
		JButton inicio = new JButton("inicio");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//declaramos 2 variables para usuario y contraseña
				String user,pass;
				
				//guardamos en una variable el usuario con el metodo getText
				user=usuario.getText();
				
				//guardamos en una variable la contraseña con getPassword
				pass=String.copyValueOf(password.getPassword());
				
				//comprobamos si el usuario y la contraseña son correctos
				if(user.contentEquals("admin") && pass.equals("1234")) {
					
					//para al abrirse la nueva ventana se cierre la antigua ventana
					dispose();
					
					//instanciamos el Jframe de la otra ventana para que sea visible 
					new Acesso().setVisible(true);
					
				}else {
					//si el usuario o la contraseña no son correctos saldra una ventana emergente que indicara el siguiente mensaje 
					JOptionPane.showInternalMessageDialog(null, "El usuario o contraseña es incorrecto");
				}
				
			}
		});
		inicio.setBounds(85, 227, 89, 23);
		contentPane.add(inicio);
		
		JButton salida = new JButton("salir");
		salida.setBounds(187, 227, 89, 23);
		contentPane.add(salida);
	}

}
