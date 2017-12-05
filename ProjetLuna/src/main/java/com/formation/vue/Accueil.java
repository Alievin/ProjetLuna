package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Dimension;

import com.formation.vue.*;

public class Accueil extends JFrame {

	/**
	 * Launch the application.
	 */
	private PAccueil pAccueil;
	private PClients pClients;
	private PArticles pArticles;
	private PCommands pCommands;
	
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
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenu mnHelp = new JMenu("Vues");
		menuBar.add(mnHelp);
		//Accueil parent=this;
		
		afficherFenetre(0);
		
	}

	public void afficherFenetre(int numPanel)
	{
		switch (numPanel) {
		case 0:
		    pAccueil=new PAccueil(this);
			setContentPane(pAccueil);
			break;
		case 1:
			pClients=new PClients(this);
			setContentPane(pClients);
			break;
		case 2:
			pArticles=new PArticles(this);
			setContentPane(pArticles);
			break;
		case 3:
			pCommands=new PCommands();
			setContentPane(pCommands);
			break;
		/*case 4:
			setContentPane(fils);
			break;
		case 5:
			setContentPane(fils);
			break;*/
		}
		this.revalidate();
	}
	public void fermeture(){
		this.setVisible(false);
	}
}
