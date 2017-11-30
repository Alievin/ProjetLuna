package com.formation.vue;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Checkbox;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;

public class PClients extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PClients() {
		
		Panel panel_Menu = new Panel();
		panel_Menu.setBackground(new Color(0, 153, 153));
		
		JLabel lbl_Clients = new JLabel("Clients");
		lbl_Clients.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_Clients.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/client/People-64-actif.png")));
		
		JButton btn_Add = new JButton("Ajouter");
		btn_Add.setForeground(Color.WHITE);
		btn_Add.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Add.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Add-New-48-actif.png")));
		btn_Add.setContentAreaFilled(false);
		btn_Add.setOpaque(false);
		btn_Add.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Add-New-48.png")));
		btn_Add.setFocusPainted(false);
		btn_Add.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btn_Search = new JButton("Rechercher");
		btn_Search.setForeground(Color.WHITE);
		btn_Search.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Search-48-actif.png")));
		btn_Search.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Search.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Search-48.png")));
		btn_Search.setOpaque(false);
		btn_Search.setFocusPainted(false);
		btn_Search.setContentAreaFilled(false);
		btn_Search.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btn_Edit = new JButton("Modifier");
		btn_Edit.setForeground(Color.WHITE);
		btn_Edit.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Data-Edit-48.png")));
		btn_Edit.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Data-Edit-48-actif.png")));
		btn_Edit.setOpaque(false);
		btn_Edit.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Edit.setFocusPainted(false);
		btn_Edit.setContentAreaFilled(false);
		btn_Edit.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btn_Delete = new JButton("Supprimer");
		btn_Delete.setForeground(Color.WHITE);
		btn_Delete.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Garbage-Open-48-actif.png")));
		btn_Delete.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btn_Delete.setOpaque(false);
		btn_Delete.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Delete.setFocusPainted(false);
		btn_Delete.setContentAreaFilled(false);
		btn_Delete.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btn_Preview = new JButton("Apercu");
		btn_Preview.setForeground(Color.WHITE);
		btn_Preview.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Preview-48.png")));
		btn_Preview.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Preview-48-actif.png")));
		btn_Preview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Preview.setOpaque(false);
		btn_Preview.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Preview.setFocusPainted(false);
		btn_Preview.setContentAreaFilled(false);
		btn_Preview.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btn_print = new JButton("Imprimer");
		btn_print.setForeground(Color.WHITE);
		btn_print.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Printer-48-actif.png")));
		btn_print.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Printer-48.png")));
		btn_print.setOpaque(false);
		btn_print.setHorizontalAlignment(SwingConstants.LEFT);
		btn_print.setFocusPainted(false);
		btn_print.setContentAreaFilled(false);
		btn_print.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btn_Export = new JButton("Exporter");
		btn_Export.setForeground(Color.WHITE);
		btn_Export.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Data-Export-48-actif.png")));
		btn_Export.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Data-Export-48.png")));
		btn_Export.setOpaque(false);
		btn_Export.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Export.setFocusPainted(false);
		btn_Export.setContentAreaFilled(false);
		btn_Export.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btnCcueil = new JButton("Accueil");
		btnCcueil.setForeground(Color.WHITE);
		btnCcueil.setPressedIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Home-48-actif.png")));
		btnCcueil.setIcon(new ImageIcon(PClients.class.getResource("/images/gestion/Home-48.png")));
		btnCcueil.setOpaque(false);
		btnCcueil.setHorizontalAlignment(SwingConstants.LEFT);
		btnCcueil.setFocusPainted(false);
		btnCcueil.setContentAreaFilled(false);
		btnCcueil.setBorder(new EmptyBorder(0, 0, 0, 0));
		GroupLayout gl_panel_Menu = new GroupLayout(panel_Menu);
		gl_panel_Menu.setHorizontalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.LEADING)
				.addComponent(lbl_Clients, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGap(10)
					.addComponent(btn_Add, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGap(10)
					.addComponent(btn_Search, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_Menu.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_Delete, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_Edit, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_Menu.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_Export, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_print, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_Preview, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGap(10)
					.addComponent(btnCcueil, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_Menu.setVerticalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addComponent(lbl_Clients, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btn_Add)
					.addGap(10)
					.addComponent(btn_Search)
					.addGroup(gl_panel_Menu.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Menu.createSequentialGroup()
							.addGap(44)
							.addComponent(btn_Delete))
						.addComponent(btn_Edit))
					.addGap(52)
					.addGroup(gl_panel_Menu.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Menu.createSequentialGroup()
							.addGap(86)
							.addComponent(btn_Export))
						.addGroup(gl_panel_Menu.createSequentialGroup()
							.addGap(45)
							.addComponent(btn_print))
						.addComponent(btn_Preview))
					.addGap(22)
					.addComponent(btnCcueil))
		);
		panel_Menu.setLayout(gl_panel_Menu);
		
		Panel panel_Champs = new Panel();
		panel_Champs.setBackground(new Color(230, 230, 250));
		
		Panel panel = new Panel();
		
		JLabel lbl_Code = new JLabel("Code");
		lbl_Code.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Firstname = new JLabel("Pr\u00E9nom");
		lbl_Firstname.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Address = new JLabel("Addresse");
		lbl_Address.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Phone = new JLabel("Fixe");
		lbl_Phone.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Email = new JLabel("Email");
		lbl_Email.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Note = new JLabel("Remarques");
		lbl_Note.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Create = new JLabel("Cr\u00E9e le");
		lbl_Create.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Name = new JLabel("Nom");
		lbl_Name.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_Mobile = new JLabel("Mobile");
		lbl_Mobile.setHorizontalAlignment(SwingConstants.RIGHT);
		
		Checkbox checkbox = new Checkbox("Carte de fid\u00E9lit\u00E9 a  a");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setCaretColor(Color.LIGHT_GRAY);
		textPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		textPane.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_Code, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(120)
									.addComponent(lbl_Create, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
							.addGap(122)
							.addComponent(checkbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_Firstname, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(120)
									.addComponent(lbl_Name, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_Address, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_Phone, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(120)
									.addComponent(lbl_Mobile, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
							.addGap(3)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_Email, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lbl_Note, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(lbl_Code))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(3)
									.addComponent(lbl_Create))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
						.addComponent(checkbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lbl_Firstname))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lbl_Name))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lbl_Address))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lbl_Phone))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lbl_Mobile))
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lbl_Email))
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lbl_Note))
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_Champs = new GroupLayout(panel_Champs);
		gl_panel_Champs.setHorizontalGroup(
			gl_panel_Champs.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Champs.createSequentialGroup()
					.addGroup(gl_panel_Champs.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel_Champs.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_Champs.createSequentialGroup()
							.addGap(10)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_Champs.setVerticalGroup(
			gl_panel_Champs.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Champs.createSequentialGroup()
					.addGap(10)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		panel_Champs.setLayout(gl_panel_Champs);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_Menu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_Champs, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_Menu, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_Champs, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
		);
		setLayout(groupLayout);

	}
}
