package com.formation.start;

import java.awt.EventQueue;

import com.formation.vue.Connexion;

public class Main implements Runnable {

	public static void main(String[] args) {

		System.out.println("Lancement du programme Luna ");

		EventQueue.invokeLater(new Main());
	}

	@Override
	public void run() {
		Connexion frame = new Connexion();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		System.out.println("Fenêtre de Connexion visible");
	}
}
