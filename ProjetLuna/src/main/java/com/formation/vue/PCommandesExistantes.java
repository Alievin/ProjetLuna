package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class PCommandesExistantes {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PCommandesExistantes window = new PCommandesExistantes();
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
	public PCommandesExistantes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Code", "Client", "Mode de paiement", "Total TTC", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblCommandes = new JLabel("Commandes");
		lblCommandes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCommandes.setIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setPressedIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Home-48-actif.png")));
		btnAccueil.setSelectedIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Home-48-actif.png")));
		btnAccueil.setIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Home-48.png")));
		btnAccueil.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAccueil.setFocusPainted(false);
		btnAccueil.setContentAreaFilled(false);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setPressedIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Garbage-Open-48-actif.png")));
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setFocusPainted(false);
		btnSupprimer.setIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Garbage-Open-48.png")));
		
		JButton btnAperu = new JButton("Aper\u00E7u");
		btnAperu.setPressedIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Preview-48-actif.png")));
		btnAperu.setForeground(Color.WHITE);
		btnAperu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAperu.setContentAreaFilled(false);
		btnAperu.setFocusPainted(false);
		btnAperu.setIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Preview-48.png")));
		
		JButton btnExport = new JButton("Export");
		btnExport.setPressedIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Data-Export-48-actif.png")));
		btnExport.setForeground(Color.WHITE);
		btnExport.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExport.setContentAreaFilled(false);
		btnExport.setFocusPainted(false);
		btnExport.setIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Data-Export-48.png")));
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setPressedIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Printer-48-actif.png")));
		btnImprimer.setContentAreaFilled(false);
		btnImprimer.setFocusPainted(false);
		btnImprimer.setIcon(new ImageIcon(PCommandesExistantes.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setForeground(Color.WHITE);
		btnImprimer.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCommandes)
								.addComponent(btnAccueil)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSupprimer))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnExport))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnImprimer))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAperu)))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(lblCommandes)
					.addGap(18)
					.addComponent(btnSupprimer)
					.addGap(34)
					.addComponent(btnAperu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addGap(18)
					.addComponent(btnAccueil)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
