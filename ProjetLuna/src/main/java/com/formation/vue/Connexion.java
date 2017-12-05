package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import com.global.singleton.GlobalConnection;




import luna_DAO.UserDAOMysql;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Connexion extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Username;
	private JPasswordField passwordField_Password;

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
		setMinimumSize(new Dimension(450, 265));
		setTitle("SARL LUNA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Connexion.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 280);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbl_Connection = new JLabel("Connexion au programme");
		lbl_Connection.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Shopping-Cart-05-48.png")));
		lbl_Connection.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_Login = new JPanel();
		panel_Login.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(51, 181, 229)));
		panel_Login.setBackground(Color.WHITE);
		
		JLabel lbl_Username = new JLabel("Nom d'utilisateur");
		lbl_Username.setVerticalTextPosition(SwingConstants.BOTTOM);
		lbl_Username.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Windows-8-Login-16.png")));
		lbl_Username.setHorizontalTextPosition(SwingConstants.LEADING);
		
		JLabel lbl_Password = new JLabel("Mot de passe");
		lbl_Password.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_Password.setHorizontalTextPosition(SwingConstants.LEADING);
		lbl_Password.setVerticalTextPosition(SwingConstants.BOTTOM);
		lbl_Password.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Key-16.png")));
		
		textField_Username = new JTextField();
		textField_Username.setColumns(10);
		
		passwordField_Password = new JPasswordField();
		
		JLabel lbl_Instruction = new JLabel("<html>Veuillez saisir <br>le nom de utilisateur et le mot de passe<br>pour acc\u00E9der \u00E0 l'application</html>");
		lbl_Instruction.setForeground(Color.GRAY);
		lbl_Instruction.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GroupLayout gl_panel_Login = new GroupLayout(panel_Login);
		gl_panel_Login.setHorizontalGroup(
			gl_panel_Login.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Login.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_Login.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Login.createSequentialGroup()
							.addComponent(lbl_Username, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 283, Short.MAX_VALUE))
						.addGroup(gl_panel_Login.createSequentialGroup()
							.addComponent(lbl_Instruction, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
							.addGap(218))
						.addGroup(gl_panel_Login.createSequentialGroup()
							.addComponent(lbl_Password, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addGroup(gl_panel_Login.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField_Password, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
								.addComponent(textField_Username, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))))
					.addGap(5))
		);
		gl_panel_Login.setVerticalGroup(
			gl_panel_Login.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Login.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel_Login.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_Username, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Username, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panel_Login.createParallelGroup(Alignment.LEADING, false)
						.addComponent(passwordField_Password, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Password, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(lbl_Instruction, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
					.addGap(6))
		);
		panel_Login.setLayout(gl_panel_Login);
		
		JButton btn_Validate = new JButton("Valider");
		btn_Validate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDAOMysql user=new UserDAOMysql(GlobalConnection.getInstance());
				String passwd="";
				for(char unchar : passwordField_Password.getPassword())
				{
					passwd+=unchar;
				}
				if(user.getUserConnection(textField_Username.getText(), passwd))
				{
					Accueil fAccueil=new Accueil();
					fAccueil.setVisible(true);
					fermeture();
				}
				else 
				{			
					erreurConnexion();
				}				
			}
		});
		btn_Validate.setFocusPainted(false);
		btn_Validate.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn_Validate.setHorizontalTextPosition(SwingConstants.LEFT);
		btn_Validate.setBackground(new Color(51, 181, 229));
		btn_Validate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btn_Validate.setForeground(Color.WHITE);
		btn_Validate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_Validate.setActionCommand("");
		btn_Validate.setPressedIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Power-48-actif.png")));
		btn_Validate.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Power-48.png")));
		
		JButton btn_Settings = new JButton("Param\u00E8tres");
		btn_Settings.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Settings.setHorizontalTextPosition(SwingConstants.RIGHT);
		btn_Settings.setPressedIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Customize-01-48-actif.png")));
		btn_Settings.setContentAreaFilled(false);
		btn_Settings.setDefaultCapable(false);
		btn_Settings.setFocusPainted(false);
		btn_Settings.setOpaque(false);
		btn_Settings.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn_Settings.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Customize-01-48.png")));
		
		JButton btn_Exit = new JButton("Quitter");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fermeture();
			}
		});
		btn_Exit.setFocusPainted(false);
		btn_Exit.setPressedIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Stop-48-actif.png")));
		btn_Exit.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Stop-48.png")));
		btn_Exit.setContentAreaFilled(false);
		btn_Exit.setBorder(new EmptyBorder(0, 0, 0, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(103)
					.addComponent(lbl_Connection, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_Login, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(btn_Settings, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
					.addGap(35)
					.addComponent(btn_Exit, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btn_Validate, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lbl_Connection, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel_Login, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(0)
							.addComponent(btn_Exit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(1))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(btn_Settings, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btn_Validate, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);		
		
	}
	public void fermeture(){
		this.setVisible(false);
	}
	public  void erreurConnexion(){
		JOptionPane.showMessageDialog(this,"Erreur de connexion");
	}
}
