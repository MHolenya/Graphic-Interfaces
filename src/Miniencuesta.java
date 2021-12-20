import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Miniencuesta<JcheckBox> extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miniencuesta frame = new Miniencuesta();
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
	public Miniencuesta() {

		int posicionslider;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("Elije un sistema operativo");
		label1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		label1.setBounds(38, 11, 132, 29);
		contentPane.add(label1);

		// instanciamos el metodo de grupo de botones
		ButtonGroup bg = new ButtonGroup();

		JRadioButton rdbWindows = new JRadioButton("Windows");
		rdbWindows.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		rdbWindows.setBounds(10, 47, 109, 23);
		contentPane.add(rdbWindows);
		// añadimos al grupo de botones
		bg.add(rdbWindows);

		JRadioButton rdbLinux = new JRadioButton("Linux");
		rdbLinux.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		rdbLinux.setBounds(10, 83, 109, 23);
		contentPane.add(rdbLinux);
		bg.add(rdbLinux);

		JRadioButton rdbMac = new JRadioButton("Mac");
		rdbMac.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		rdbMac.setBounds(10, 125, 109, 23);
		contentPane.add(rdbMac);
		bg.add(rdbMac);

		JLabel lblNewLabel = new JLabel("Elije tu especialidad");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		lblNewLabel.setBounds(38, 175, 132, 23);
		contentPane.add(lblNewLabel);

		JCheckBox chekP = new JCheckBox("Programacion");
		chekP.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		chekP.setBounds(6, 219, 97, 23);
		contentPane.add(chekP);

		JCheckBox chekD = new JCheckBox("Dise\u00F1o Grafico");
		chekD.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		chekD.setBounds(10, 259, 132, 23);
		contentPane.add(chekD);

		JCheckBox chekA = new JCheckBox("Administracion");
		chekA.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		chekA.setBounds(6, 309, 136, 23);
		contentPane.add(chekA);

		JLabel lblNewLabel_1 = new JLabel("Horas dedicadas en el odenador");
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 360, 194, 14);
		contentPane.add(lblNewLabel_1);

		JLabel mylabel = new JLabel("");
		mylabel.setBounds(211, 395, 35, 33);
		contentPane.add(mylabel);

		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				mylabel.setText(String.valueOf(slider.getValue()));
			}
		});
		slider.setMajorTickSpacing(2);
		slider.setMaximum(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setBounds(6, 385, 200, 51);
		contentPane.add(slider);
		
		JButton btngenerar = new JButton("Generar");
		btngenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String informacion1 = "";
				String informacion2 = "";
				String informacion3 = "";
				String informacion4 = "";
				
				if(rdbWindows.isSelected()){
					informacion1="Windows, ";
				}else if (rdbLinux.isSelected()) {
					informacion1="Linux, ";
				}else if (rdbMac.isSelected()) {
					informacion1="Mac, ";
				}
				if(chekP.isSelected()) {
					informacion2="Programacion, ";
				} if (chekD.isSelected()) {
					informacion3 ="Diseño Grafico, ";
				} if (chekA.isSelected()) {
					informacion4 ="Administracion ";
				}
				JOptionPane.showMessageDialog(null,"Tu sistema operativo preferente es " + informacion1 + "\nTus especialidades son " + informacion2 + informacion3 + informacion4 + "\nY el numero de horas dedicadas al PC son " + mylabel.getText() + " horas");
			
			
			
		}});
		btngenerar.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		btngenerar.setBounds(84, 447, 89, 38);
		contentPane.add(btngenerar);

	
		
	}
}
