package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Connexion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
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
	public Connexion() {
		setResizable(false);
		setTitle("SARL LUNA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Connexion.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Connexion au programme");
		lblNewLabel.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Shopping-Cart-05-48.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(108, 4, 253, 35);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 50, 424, 122);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nom d'utilisateur");
		lblNewLabel_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Windows-8-Login-16.png")));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1.setBounds(10, 11, 121, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMotDePasse.setHorizontalTextPosition(SwingConstants.LEADING);
		lblMotDePasse.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblMotDePasse.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Key-16.png")));
		lblMotDePasse.setBounds(10, 34, 115, 21);
		panel.add(lblMotDePasse);
		
		textField = new JTextField();
		textField.setBounds(126, 11, 288, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(126, 34, 288, 21);
		panel.add(passwordField);
		
		JLabel lblVeuillezSaisirUn = new JLabel("Veuillez saisir un utilisateur");
		lblVeuillezSaisirUn.setBounds(10, 66, 115, 45);
		panel.add(lblVeuillezSaisirUn);
		
		JButton btn_Validate = new JButton("Valider");
		btn_Validate.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn_Validate.setFocusPainted(false);
		btn_Validate.setHorizontalTextPosition(SwingConstants.LEFT);
		btn_Validate.setBackground(new Color(0, 191, 255));
		btn_Validate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btn_Validate.setForeground(Color.WHITE);
		btn_Validate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_Validate.setActionCommand("");
		btn_Validate.setPressedIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Power-48-actif.png")));
		btn_Validate.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Power-48.png")));
		btn_Validate.setBounds(313, 205, 121, 48);
		contentPane.add(btn_Validate);
		
		JButton btnParametres = new JButton("Param\u00E8tres");
		btnParametres.setHorizontalAlignment(SwingConstants.LEFT);
		btnParametres.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnParametres.setPressedIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Customize-01-48-actif.png")));
		btnParametres.setContentAreaFilled(false);
		btnParametres.setDefaultCapable(false);
		btnParametres.setFocusPainted(false);
		btnParametres.setOpaque(false);
		btnParametres.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnParametres.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Customize-01-48.png")));
		btnParametres.setBounds(10, 204, 151, 48);
		contentPane.add(btnParametres);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setPressedIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Stop-48-actif.png")));
		btnQuitter.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Stop-48.png")));
		btnQuitter.setContentAreaFilled(false);
		btnQuitter.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnQuitter.setBounds(196, 205, 107, 48);
		contentPane.add(btnQuitter);
	}
}
