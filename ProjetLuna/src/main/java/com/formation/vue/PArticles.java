package com.formation.vue;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PArticles extends JPanel {

	/**
	 * Create the panel.
	 */
	public PArticles() {
		setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(102, 153, 51));
		panel.setBounds(0, 0, 150, 550);
		add(panel);
		
		JLabel lblArticles = new JLabel("Articles");
		lblArticles.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/article/Product-64-actif.png")));
		lblArticles.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton button_4 = new JButton("Exporter");
		button_4.setForeground(Color.WHITE);
		button_4.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Data-Export-48.png")));
		button_4.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Data-Export-48-actif.png")));
		button_4.setOpaque(false);
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFocusPainted(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton button_5 = new JButton("Imprimer");
		button_5.setForeground(Color.WHITE);
		button_5.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Printer-48.png")));
		button_5.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Printer-48-actif.png")));
		button_5.setOpaque(false);
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setFocusPainted(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton button_6 = new JButton("Apercu");
		button_6.setForeground(Color.WHITE);
		button_6.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Preview-48-actif.png")));
		button_6.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Preview-48.png")));
		button_6.setOpaque(false);
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setFocusPainted(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton button_7 = new JButton("Accueil");
		button_7.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Home-48-actif.png")));
		button_7.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Home-48.png")));
		button_7.setOpaque(false);
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setFocusPainted(false);
		button_7.setContentAreaFilled(false);
		button_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btnQuitter = new JButton("Accueil");
		btnQuitter.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Home-48-actif.png")));
		btnQuitter.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Home-48.png")));
		btnQuitter.setOpaque(false);
		btnQuitter.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuitter.setForeground(Color.WHITE);
		btnQuitter.setFocusPainted(false);
		btnQuitter.setContentAreaFilled(false);
		btnQuitter.setBorder(new EmptyBorder(0, 0, 0, 0));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblArticles, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblArticles, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(138)
					.addComponent(button_6)
					.addGap(23)
					.addComponent(button_5)
					.addGap(18)
					.addComponent(button_4)
					.addGap(89)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(301)
					.addComponent(button_7)
					.addGap(46))
		);
		panel.setLayout(gl_panel);

	}

}
