package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fparametres extends JFrame{

	private JFrame frame;
	private JTextField txtJdbcmysqllocalhostluna;
	private JTextField txtRoot;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fparametres window = new Fparametres();
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
	public Fparametres() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAdresseDeLa = new JLabel("Adresse :");
		lblAdresseDeLa.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtJdbcmysqllocalhostluna = new JTextField();
		txtJdbcmysqllocalhostluna.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtJdbcmysqllocalhostluna.setText("jdbc:mysql://localhost:3306/luna");
		txtJdbcmysqllocalhostluna.setColumns(10);
		
		JLabel lblIdDeConnexion = new JLabel("ID de connexion :");
		lblIdDeConnexion.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtRoot = new JTextField();
		txtRoot.setText("root");
		txtRoot.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtRoot.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setIcon(new ImageIcon(Fparametres.class.getResource("/images/connection/Key-16.png")));
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		
		JLabel lblConnexionLa = new JLabel("Connexion \u00E0 la base de donn\u00E9es");
		lblConnexionLa.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//fermeture();
			
			}
		});
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAnnuler.setIcon(new ImageIcon(Fparametres.class.getResource("/images/gestion/Cancel-48.png"))
				);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		
		
		btnValider.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnValider.setIcon(new ImageIcon(Fparametres.class.getResource("/images/gestion/Save-48.png")));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtRoot, Alignment.LEADING)
								.addComponent(lblIdDeConnexion, Alignment.LEADING))
							.addGap(147)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnValider)
									.addComponent(lblMotDePasse)))
							.addGap(171))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAdresseDeLa)
							.addGap(18)
							.addComponent(txtJdbcmysqllocalhostluna, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
							.addContainerGap(110, Short.MAX_VALUE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(135)
					.addComponent(btnAnnuler)
					.addContainerGap(341, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(159)
					.addComponent(lblConnexionLa)
					.addContainerGap(163, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConnexionLa)
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdresseDeLa)
						.addComponent(txtJdbcmysqllocalhostluna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblIdDeConnexion)
						.addComponent(lblMotDePasse))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtRoot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnnuler)
						.addComponent(btnValider))
					.addGap(55))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
