package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Dimension;


public class Accueil extends JFrame {

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
		setMinimumSize(new Dimension(900, 700));
		setTitle("Accueil");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Accueil.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenu mnHelp = new JMenu("Vues");
		menuBar.add(mnHelp);
		//Accueil parent=this;
		
		afficherFenetre(0);
		
	}

	public void afficherFenetre(int... args)
	{
		switch (args[0]) {
		case 0:
			PAccueil pAccueil=new PAccueil(this);
			setContentPane(pAccueil);
			break;
		case 1:
			PClients pClients=new PClients(this);
			setContentPane(pClients);
			break;
		case 2:
			PArticles pArticles=new PArticles(this);
			setContentPane(pArticles);
			break;
		case 3:
			PCommands pCommands=new PCommands(this);
			setContentPane(pCommands);
			break;
		case 4:
			PAjoutModif pAjout=new PAjoutModif(this);
			setContentPane(pAjout);
			break;
		case 5:
			PAjoutModif pModif=new PAjoutModif(this);
			pModif.doubleClicked(args[1]);
			setContentPane(pModif);
			break;
		}
		this.revalidate();
	}
	public void fermeture(){
		this.setVisible(false);
	}
}
