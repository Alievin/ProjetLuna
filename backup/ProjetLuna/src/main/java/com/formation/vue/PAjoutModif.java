package com.formation.vue;

import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class PAjoutModif extends JPanel {
	private JTextField textField_Code;
	private JTextField textField_Name;
	private JTextField textField_Address;
	private JTextField textField_Zip;
	private JTextField textField_Town;
	private JTextField textField_Firstname;
	private JTextField textField_Phone;
	private JTextField textField_Mobile;
	private JTextField textField_Email;

	/**
	 * Create the panel.
	 */
	public PAjoutModif() {
		setBorder(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 153, 153));
		
		JLabel label = new JLabel("Clients");
		label.setIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/client/User-Add-64.png")));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.setPressedIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Save-48-actif.png")));
		btnSauvegarder.setIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Save-48.png")));
		btnSauvegarder.setOpaque(false);
		btnSauvegarder.setHorizontalAlignment(SwingConstants.LEFT);
		btnSauvegarder.setForeground(Color.WHITE);
		btnSauvegarder.setFocusPainted(false);
		btnSauvegarder.setContentAreaFilled(false);
		btnSauvegarder.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton button_4 = new JButton("Exporter");
		button_4.setIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Data-Export-48.png")));
		button_4.setPressedIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Data-Export-48-actif.png")));
		button_4.setOpaque(false);
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.WHITE);
		button_4.setFocusPainted(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton button_5 = new JButton("Imprimer");
		button_5.setPressedIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Printer-48-actif.png")));
		button_5.setIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Printer-48.png")));
		button_5.setOpaque(false);
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.WHITE);
		button_5.setFocusPainted(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton button_6 = new JButton("Apercu");
		button_6.setIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Preview-48.png")));
		button_6.setPressedIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Preview-48-actif.png")));
		button_6.setOpaque(false);
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setForeground(Color.WHITE);
		button_6.setFocusPainted(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton button_7 = new JButton("Accueil");
		button_7.setPressedIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Home-48-actif.png")));
		button_7.setIcon(new ImageIcon(PAjoutModif.class.getResource("/images/gestion/Home-48.png")));
		button_7.setOpaque(false);
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setForeground(Color.WHITE);
		button_7.setFocusPainted(false);
		button_7.setContentAreaFilled(false);
		button_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		Panel panel_Menu = new Panel();
		panel_Menu.setBackground(new Color(230, 230, 250));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSauvegarder, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSauvegarder)
					.addGap(124)
					.addComponent(button_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_4)
					.addGap(68)
					.addComponent(button_7)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_Client = new JPanel();
		panel_Client.setOpaque(false);
		panel_Client.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Client", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GRAY));
		
		JPanel panel_Civil_State = new JPanel();
		panel_Civil_State.setOpaque(false);
		panel_Civil_State.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Etats civils", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(128, 128, 128)));
		
		JPanel panel_Contact_Info = new JPanel();
		panel_Contact_Info.setOpaque(false);
		panel_Contact_Info.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Coordon\u00E9es", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(128, 128, 128)));
		
		JPanel panel_Note = new JPanel();
		panel_Note.setOpaque(false);
		panel_Note.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Remarques", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(128, 128, 128)));
		GroupLayout gl_panel_Menu = new GroupLayout(panel_Menu);
		gl_panel_Menu.setHorizontalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_Menu.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_Civil_State, GroupLayout.PREFERRED_SIZE, 467, Short.MAX_VALUE)
						.addComponent(panel_Note, GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
						.addComponent(panel_Client, GroupLayout.PREFERRED_SIZE, 467, Short.MAX_VALUE)
						.addComponent(panel_Contact_Info, GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_Menu.setVerticalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_Client, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel_Civil_State, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(panel_Contact_Info, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_Note, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_panel_Note = new GroupLayout(panel_Note);
		gl_panel_Note.setHorizontalGroup(
			gl_panel_Note.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Note.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_Note.setVerticalGroup(
			gl_panel_Note.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Note.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_Note.setLayout(gl_panel_Note);
		
		JLabel lbl_Phone = new JLabel("Fixe");
		
		textField_Phone = new JTextField();
		textField_Phone.setColumns(10);
		
		JLabel lbl_Mobile = new JLabel("Mobile");
		
		textField_Mobile = new JTextField();
		textField_Mobile.setColumns(10);
		
		JLabel lbl_Email = new JLabel("Email");
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		GroupLayout gl_panel_Contact_Info = new GroupLayout(panel_Contact_Info);
		gl_panel_Contact_Info.setHorizontalGroup(
			gl_panel_Contact_Info.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Contact_Info.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_Contact_Info.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbl_Email)
						.addComponent(lbl_Phone))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_Contact_Info.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Contact_Info.createSequentialGroup()
							.addComponent(textField_Phone, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(lbl_Mobile, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_Mobile, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
							.addGap(1))
						.addComponent(textField_Email, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_Contact_Info.setVerticalGroup(
			gl_panel_Contact_Info.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Contact_Info.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_Contact_Info.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Phone)
						.addComponent(textField_Phone, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Mobile)
						.addComponent(textField_Mobile, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_Contact_Info.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Email)
						.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_Contact_Info.setLayout(gl_panel_Contact_Info);
		
		JLabel lbl_Firstname = new JLabel("Pr\u00E9nom");
		
		textField_Name = new JTextField();
		textField_Name.setColumns(10);
		
		JLabel lbl_Address = new JLabel("Adresse");
		
		textField_Address = new JTextField();
		textField_Address.setColumns(10);
		
		JLabel lbl_Zip = new JLabel("Code postal");
		
		textField_Zip = new JTextField();
		textField_Zip.setColumns(10);
		
		textField_Town = new JTextField();
		textField_Town.setColumns(10);
		
		textField_Firstname = new JTextField();
		textField_Firstname.setColumns(10);
		
		JLabel lbl_Name = new JLabel("Nom");
		
		JLabel lbl_Town = new JLabel("Ville");
		GroupLayout gl_panel_Civil_State = new GroupLayout(panel_Civil_State);
		gl_panel_Civil_State.setHorizontalGroup(
			gl_panel_Civil_State.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Civil_State.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_Civil_State.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_Zip, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_Civil_State.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lbl_Firstname, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lbl_Address, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_Civil_State.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Civil_State.createSequentialGroup()
							.addGroup(gl_panel_Civil_State.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_Civil_State.createSequentialGroup()
									.addComponent(textField_Zip, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbl_Town, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_Town, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
									.addGap(0))
								.addGroup(gl_panel_Civil_State.createSequentialGroup()
									.addComponent(textField_Firstname, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
									.addGap(9)
									.addComponent(lbl_Name, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_Name, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
									.addGap(0)))
							.addGap(10))
						.addGroup(gl_panel_Civil_State.createSequentialGroup()
							.addComponent(textField_Address, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_panel_Civil_State.setVerticalGroup(
			gl_panel_Civil_State.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Civil_State.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_Civil_State.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Firstname)
						.addComponent(textField_Name, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Name)
						.addComponent(textField_Firstname, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_Civil_State.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Address)
						.addComponent(textField_Address, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_Civil_State.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Zip, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Town, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Zip)
						.addComponent(lbl_Town))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_Civil_State.setLayout(gl_panel_Civil_State);
		
		JLabel lbl_Code = new JLabel("Code");
		
		textField_Code = new JTextField();
		textField_Code.setColumns(10);
		
		JLabel lbl_Create = new JLabel("Cr\u00E9e le");
		
		JCheckBox chckbx_Fidelitycard = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		chckbx_Fidelitycard.setOpaque(false);
		
		JFormattedTextField formattedTextField_Create = new JFormattedTextField();
		GroupLayout gl_panel_Client = new GroupLayout(panel_Client);
		gl_panel_Client.setHorizontalGroup(
			gl_panel_Client.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Client.createSequentialGroup()
					.addGap(20)
					.addComponent(lbl_Code)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_Code, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lbl_Create, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(formattedTextField_Create, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(chckbx_Fidelitycard, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(0))
		);
		gl_panel_Client.setVerticalGroup(
			gl_panel_Client.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Client.createSequentialGroup()
					.addGroup(gl_panel_Client.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Create)
						.addComponent(chckbx_Fidelitycard)
						.addComponent(textField_Code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Code)
						.addComponent(formattedTextField_Create, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_Client.setLayout(gl_panel_Client);
		panel_Menu.setLayout(gl_panel_Menu);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_Menu, GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_Menu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(10))
		);
		setLayout(groupLayout);

	}
}
