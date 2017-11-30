package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;

public class Accueil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
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
	public Accueil() {
		setMinimumSize(new Dimension(650, 600));
		setTitle("Accueil");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Accueil.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenu mnHelp = new JMenu("Vues");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		Panel panel_Exit = new Panel();
		panel_Exit.setBackground(Color.GRAY);
		
		JLabel lblSarlLuna = new JLabel("SARL Luna");
		lblSarlLuna.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarlLuna.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSarlLuna.setBackground(Color.LIGHT_GRAY);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFocusPainted(false);
		btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnQuitter.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/connection/Stop-48-actif.png")));
		btnQuitter.setIcon(new ImageIcon(Accueil.class.getResource("/images/connection/Stop-48.png")));
		btnQuitter.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnQuitter.setContentAreaFilled(false);
		GroupLayout gl_panel_Exit = new GroupLayout(panel_Exit);
		gl_panel_Exit.setHorizontalGroup(
			gl_panel_Exit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Exit.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_Exit.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSarlLuna, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
						.addComponent(btnQuitter, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
		);
		gl_panel_Exit.setVerticalGroup(
			gl_panel_Exit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Exit.createSequentialGroup()
					.addGap(5)
					.addComponent(lblSarlLuna, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(358)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(63, Short.MAX_VALUE))
		);
		panel_Exit.setLayout(gl_panel_Exit);
		
		Panel panel_Menu = new Panel();
		
		JButton btn_Command = new JButton("");
		btn_Command.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Product-128-actif.png")));
		btn_Command.setBorder(UIManager.getBorder("Button.border"));
		btn_Command.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Command.setContentAreaFilled(false);
		btn_Command.setBorderPainted(false);
		btn_Command.setRequestFocusEnabled(false);
		btn_Command.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Command.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Product-128.png")));
		btn_Command.setBackground(Color.WHITE);
		btn_Command.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Product-128.png")));
		
		JButton btn_Client = new JButton("");
		btn_Client.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128-actif.png")));
		btn_Client.setRequestFocusEnabled(false);
		btn_Client.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128.png")));
		btn_Client.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Client.setBorderPainted(false);
		btn_Client.setBorder(UIManager.getBorder("Button.border"));
		btn_Client.setContentAreaFilled(false);
		btn_Client.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128.png")));
		
		JButton btn_Stat = new JButton("");
		btn_Stat.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128-actif.png")));
		btn_Stat.setBorderPainted(false);
		btn_Stat.setRequestFocusEnabled(false);
		btn_Stat.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128.png")));
		btn_Stat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Stat.setBorder(UIManager.getBorder("Button.border"));
		btn_Stat.setContentAreaFilled(false);
		btn_Stat.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128.png")));
		
		JButton btn_Article = new JButton("");
		btn_Article.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128-actif.png")));
		btn_Article.setRequestFocusEnabled(false);
		btn_Article.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		btn_Article.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Article.setBorderPainted(false);
		btn_Article.setBorder(UIManager.getBorder("Button.border"));
		btn_Article.setContentAreaFilled(false);
		btn_Article.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		
		JButton btn_Settings = new JButton("");
		btn_Settings.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Settings-02-128-actif.png")));
		btn_Settings.setRequestFocusEnabled(false);
		btn_Settings.setBackground(Color.WHITE);
		btn_Settings.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Settings-02-128.png")));
		btn_Settings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Settings.setContentAreaFilled(false);
		btn_Settings.setBorderPainted(false);
		btn_Settings.setBorder(UIManager.getBorder("Button.border"));
		btn_Settings.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Settings-02-128.png")));
		GroupLayout gl_panel_Menu = new GroupLayout(panel_Menu);
		gl_panel_Menu.setHorizontalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGap(164)
					.addComponent(btn_Command, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
					.addGap(161))
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addComponent(btn_Client, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(btn_Stat, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(btn_Article, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGap(164)
					.addComponent(btn_Settings, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
					.addGap(157))
		);
		gl_panel_Menu.setVerticalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addComponent(btn_Command, GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
					.addGap(5)
					.addGroup(gl_panel_Menu.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_Client, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
						.addComponent(btn_Stat, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
						.addComponent(btn_Article, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
					.addGap(5)
					.addComponent(btn_Settings, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
		);
		panel_Menu.setLayout(gl_panel_Menu);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_Exit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panel_Menu, GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_Exit, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
				.addComponent(panel_Menu, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
	}
}
