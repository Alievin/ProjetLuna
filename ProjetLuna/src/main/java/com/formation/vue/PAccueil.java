package com.formation.vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PAccueil extends JPanel {

	/**
	 * Create the panel.
	 */
	public PAccueil(Accueil parent) {
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.GRAY);
		
		JLabel label = new JLabel("SARL Luna");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBackground(Color.LIGHT_GRAY);
		
		JButton button = new JButton("Quitter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.fermeture();
			}
		});
		button.setPressedIcon(new ImageIcon(PAccueil.class.getResource("/images/connection/Stop-48-actif.png")));
		button.setIcon(new ImageIcon(PAccueil.class.getResource("/images/connection/Stop-48.png")));
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorder(new EmptyBorder(0, 0, 0, 0));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(384)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 7, Short.MAX_VALUE)
					.addGap(47))
		);
		panel_1.setLayout(gl_panel_1);
		
		Panel panel_2 = new Panel();
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.afficherFenetre(2);
			}
		});
		button_1.setRolloverIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Product-128-actif.png")));
		button_1.setPressedIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Product-128.png")));
		button_1.setIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Product-128.png")));
		button_1.setRequestFocusEnabled(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(UIManager.getBorder("Button.border"));
		button_1.setBackground(Color.WHITE);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.afficherFenetre(1);
			}
		});
		button_2.setRolloverIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/People-128-actif.png")));
		button_2.setIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/People-128.png")));
		button_2.setPressedIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/People-128.png")));
		button_2.setRequestFocusEnabled(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(UIManager.getBorder("Button.border"));
		
		JButton button_3 = new JButton("");
		button_3.setRolloverIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Diagram-128-actif.png")));
		button_3.setPressedIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Diagram-128.png")));
		button_3.setIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Diagram-128.png")));
		button_3.setRequestFocusEnabled(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(UIManager.getBorder("Button.border"));
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.afficherFenetre(3);
			}
		});
		button_4.setRolloverIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Diagram-128-actif.png")));
		button_4.setIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		button_4.setPressedIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		button_4.setRequestFocusEnabled(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setBorder(UIManager.getBorder("Button.border"));
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PParametres param=new PParametres();
				param.setVisible(true);
				param.setBounds(500, 200, 500, 400);
			}
		});
		button_5.setRolloverIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Settings-02-128-actif.png")));
		button_5.setPressedIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Settings-02-128.png")));
		button_5.setIcon(new ImageIcon(PAccueil.class.getResource("/images/accueil/Settings-02-128.png")));
		button_5.setRequestFocusEnabled(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setBorder(UIManager.getBorder("Button.border"));
		button_5.setBackground(Color.WHITE);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(164)
					.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
					.addGap(161))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(164)
					.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
					.addGap(157))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 540, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
					.addGap(5)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
						.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
						.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
					.addGap(5)
					.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
		);
		setLayout(groupLayout);

	}

}
