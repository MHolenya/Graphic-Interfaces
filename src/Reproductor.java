import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JLayeredPane;

public class Reproductor extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reproductor frame = new Reproductor();
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
	public Reproductor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 369);
		getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton_6 = new JButton("PLAY");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("RECORD");
		getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("PAUSE");
		getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("PISTA ANTERIOR");
		getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("PISTA POSTERIOR");
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("REBOBINAR ATRAS");
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("STOP");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("ON/OF");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("REBOBINAR ALANTE");
		getContentPane().add(btnNewButton_1);
		
		
		
	}
}
