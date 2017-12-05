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
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JSlider;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.global.singleton.GlobalConnection;

import luna_Class.Article;
import luna_Class.Client;
import luna_DAO.ArticleDAO;
import luna_DAO.ArticleDAOMysql;
import luna_DAO.ClientDAO;
import luna_DAO.ClientDAOMysql;

public class PArticles extends JPanel {
	private JTextField textField_Code;
	private JTextField textField_Category;
	private JTextField textField_Designation;
	private JTextField textField_Quantity;
	private JTable table;
	private JTextField textField_Search;

	/**
	 * Create the panel.
	 */
	public PArticles(Accueil parent) {
		ArticleDAO articleDAO=new ArticleDAOMysql(GlobalConnection.getInstance());
		List<Article> articles = new ArrayList<>();				
		articles=articleDAO.getAllArticle();
		
		setBackground(new Color(250, 250, 210));
		
		Panel panel_Menu = new Panel();
		panel_Menu.setBackground(new Color(102, 153, 51));
		
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
		
		JButton btnQuitter = new JButton("Accueil");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.afficherFenetre(0);
			}
		});
		btnQuitter.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Home-48-actif.png")));
		btnQuitter.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Home-48.png")));
		btnQuitter.setOpaque(false);
		btnQuitter.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuitter.setForeground(Color.WHITE);
		btnQuitter.setFocusPainted(false);
		btnQuitter.setContentAreaFilled(false);
		btnQuitter.setBorder(new EmptyBorder(0, 0, 0, 0));
		GroupLayout gl_panel_Menu = new GroupLayout(panel_Menu);
		gl_panel_Menu.setHorizontalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addGroup(gl_panel_Menu.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_Menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_Menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_Menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblArticles, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_Menu.setVerticalGroup(
			gl_panel_Menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Menu.createSequentialGroup()
					.addComponent(lblArticles, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(138)
					.addComponent(button_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(23)
					.addComponent(button_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(button_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(94)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		panel_Menu.setLayout(gl_panel_Menu);
		
		JPanel panel_Interface = new JPanel();
		panel_Interface.setOpaque(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_Menu, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_Interface, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_Interface, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
					.addGap(11))
				.addComponent(panel_Menu, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
		);
		
		JPanel panel_Champs = new JPanel();
		panel_Champs.setOpaque(false);
		panel_Champs.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setOpaque(false);
		
		JLabel lbl_Sortby = new JLabel("Trier par");
		lbl_Sortby.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		toolBar.add(lbl_Sortby);
		
		JRadioButton rdbtn_Code = new JRadioButton("code");
		rdbtn_Code.setOpaque(false);
		toolBar.add(rdbtn_Code);
		
		JRadioButton rdbtn_Category = new JRadioButton("cat\u00E9gorie");
		rdbtn_Category.setOpaque(false);
		toolBar.add(rdbtn_Category);
		
		JLabel lbl_search = new JLabel("Recherche");
		lbl_search.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Search-32.png")));
		toolBar.add(lbl_search);
		
		textField_Search = new JTextField();
		toolBar.add(textField_Search);
		textField_Search.setColumns(10);
		
		String col[] = {"Code", "Code Catégorie", "Désignation", "Quantité", "Prix Unitaire"};
		DefaultTableModel tableModel = new DefaultTableModel(col, 0);		
		for (int i = 0; i < articles.size(); i++)
		{
			int id=articles.get(i).getId();
			int codeCategorie=articles.get(i).getCodeCategorie();
			String designation=articles.get(i).getDesignation();
			int quantite=articles.get(i).getQuantitestock();
			int prixUnitaire=articles.get(i).getPrixUnitaire();
			
			Object[] data= {id, codeCategorie, designation, quantite, prixUnitaire};
			tableModel.addRow(data);
		}
		table = new JTable(tableModel);

		scrollPane.setViewportView(table);
	
		
		JLabel lbl_Code = new JLabel("Code");
		lbl_Code.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_Code = new JTextField();
		textField_Code.setColumns(10);
		
		JLabel lbl_Category = new JLabel("Cat\u00E9gorie");
		lbl_Category.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_Category = new JTextField();
		textField_Category.setColumns(10);
		
		textField_Designation = new JTextField();
		textField_Designation.setColumns(10);
		
		JLabel lblDsignation = new JLabel("D\u00E9signation");
		lblDsignation.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JSlider slider_Quantity = new JSlider();
		slider_Quantity.setOpaque(false);
		
		JLabel lbl_Quantity = new JLabel("Quantit\u00E9");
		lbl_Quantity.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField_Quantity = new JTextField();
		textField_Quantity.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Quantity.setEditable(false);
		textField_Quantity.setBackground(SystemColor.control);
		textField_Quantity.setColumns(10);
		
		JLabel lbl_Price = new JLabel("Prix Unitaire");
		lbl_Price.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JFormattedTextField formattedTextField_Price = new JFormattedTextField();
		formattedTextField_Price.setText("0.00");
		formattedTextField_Price.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjouter.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Add-New-48-actif.png")));
		btnAjouter.setContentAreaFilled(false);
		btnAjouter.setFocusPainted(false);
		btnAjouter.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnAjouter.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Add-New-48.png")));
		
		JLabel lbl_Euro = new JLabel("\u20AC");
		
		JButton btn_Edit = new JButton("Modifier");
		btn_Edit.setEnabled(false);
		btn_Edit.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Data-Edit-48-actif.png")));
		btn_Edit.setContentAreaFilled(false);
		btn_Edit.setFocusPainted(false);
		btn_Edit.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn_Edit.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Data-Edit-48.png")));
		
		JButton btn_Erase = new JButton("Supprimer");
		btn_Erase.setEnabled(false);
		btn_Erase.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Garbage-Open-48-actif.png")));
		btn_Erase.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btn_Erase.setContentAreaFilled(false);
		btn_Erase.setFocusPainted(false);
		btn_Erase.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btn_Delete = new JButton("Effacer");
		btn_Delete.setIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Cancel-48.png")));
		btn_Delete.setPressedIcon(new ImageIcon(PArticles.class.getResource("/images/gestion/Cancel-48-actif.png")));
		btn_Delete.setContentAreaFilled(false);
		btn_Delete.setFocusPainted(false);
		btn_Delete.setBorder(new EmptyBorder(0, 0, 0, 0));
		GroupLayout gl_panel_Champs = new GroupLayout(panel_Champs);
		gl_panel_Champs.setHorizontalGroup(
			gl_panel_Champs.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Champs.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_Champs.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Champs.createSequentialGroup()
							.addGroup(gl_panel_Champs.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lbl_Code, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDsignation, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl_Quantity, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_Champs.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_Champs.createSequentialGroup()
									.addComponent(textField_Code, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lbl_Category, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_Category, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
								.addComponent(textField_Designation, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
								.addGroup(gl_panel_Champs.createSequentialGroup()
									.addGap(4)
									.addComponent(slider_Quantity, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_Quantity, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbl_Price, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(formattedTextField_Price, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbl_Euro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(20))
						.addGroup(gl_panel_Champs.createSequentialGroup()
							.addComponent(btnAjouter, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn_Edit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn_Erase, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn_Delete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_panel_Champs.setVerticalGroup(
			gl_panel_Champs.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Champs.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_Champs.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Category, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Category, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Code, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Code, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_Champs.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDsignation, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Designation, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_Champs.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Champs.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel_Champs.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbl_Euro, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_Price, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
								.addComponent(lbl_Price, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_Quantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addComponent(lbl_Quantity, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
						.addComponent(slider_Quantity, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_Champs.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_Delete, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addGroup(gl_panel_Champs.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnAjouter, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGroup(gl_panel_Champs.createSequentialGroup()
								.addGap(6)
								.addComponent(btn_Edit, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
							.addComponent(btn_Erase, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))
					.addGap(25))
		);
		panel_Champs.setLayout(gl_panel_Champs);
		GroupLayout gl_panel_Interface = new GroupLayout(panel_Interface);
		gl_panel_Interface.setHorizontalGroup(
			gl_panel_Interface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Interface.createSequentialGroup()
					.addGroup(gl_panel_Interface.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_Champs, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
						.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_Interface.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
							.addGap(10)))
					.addContainerGap())
		);
		gl_panel_Interface.setVerticalGroup(
			gl_panel_Interface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Interface.createSequentialGroup()
					.addGap(11)
					.addComponent(panel_Champs, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
					.addGap(21)
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
		);
		panel_Interface.setLayout(gl_panel_Interface);
		setLayout(groupLayout);

	}
}
