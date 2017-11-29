package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

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
		setResizable(false);
		setTitle("Accueil");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Accueil.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 550);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenu mnHelp = new JMenu("Vues");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_Exit = new Panel();
		panel_Exit.setBackground(Color.GRAY);
		panel_Exit.setBounds(0, 0, 150, 500);
		contentPane.add(panel_Exit);
		panel_Exit.setLayout(null);
		
		JLabel lblSarlLuna = new JLabel("SARL Luna");
		lblSarlLuna.setBounds(10, 5, 130, 45);
		lblSarlLuna.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSarlLuna.setBackground(Color.LIGHT_GRAY);
		panel_Exit.add(lblSarlLuna);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFocusPainted(false);
		btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnQuitter.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/connection/Stop-48-actif.png")));
		btnQuitter.setIcon(new ImageIcon(Accueil.class.getResource("/images/connection/Stop-48.png")));
		btnQuitter.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnQuitter.setContentAreaFilled(false);
		btnQuitter.setBounds(10, 368, 130, 69);
		panel_Exit.add(btnQuitter);
		
		Panel panel_Menu = new Panel();
		panel_Menu.setBounds(150, 0, 494, 500);
		contentPane.add(panel_Menu);
		panel_Menu.setLayout(new BorderLayout(0, 0));
		
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
		panel_Menu.add(btn_Command, BorderLayout.NORTH);
		
		JButton btn_Client = new JButton("");
		btn_Client.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128-actif.png")));
		btn_Client.setRequestFocusEnabled(false);
		btn_Client.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128.png")));
		btn_Client.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Client.setBorderPainted(false);
		btn_Client.setBorder(UIManager.getBorder("Button.border"));
		btn_Client.setContentAreaFilled(false);
		btn_Client.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128.png")));
		panel_Menu.add(btn_Client, BorderLayout.WEST);
		
		JButton btn_Stat = new JButton("");
		btn_Stat.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128-actif.png")));
		btn_Stat.setBorderPainted(false);
		btn_Stat.setRequestFocusEnabled(false);
		btn_Stat.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128.png")));
		btn_Stat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Stat.setBorder(UIManager.getBorder("Button.border"));
		btn_Stat.setContentAreaFilled(false);
		btn_Stat.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128.png")));
		panel_Menu.add(btn_Stat, BorderLayout.CENTER);
		
		JButton btn_Article = new JButton("");
		btn_Article.setRolloverIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128-actif.png")));
		btn_Article.setRequestFocusEnabled(false);
		btn_Article.setPressedIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		btn_Article.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Article.setBorderPainted(false);
		btn_Article.setBorder(UIManager.getBorder("Button.border"));
		btn_Article.setContentAreaFilled(false);
		btn_Article.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		panel_Menu.add(btn_Article, BorderLayout.EAST);
		
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
		panel_Menu.add(btn_Settings, BorderLayout.SOUTH);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
	}
}
