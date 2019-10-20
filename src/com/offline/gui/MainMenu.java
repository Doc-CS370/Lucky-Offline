package com.offline.gui;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainMenu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel mainMenu = new JPanel();
	private JButton strg = new JButton("Start Game");
	private JButton multp = new JButton("Multiplayer");
	private JButton opt = new JButton("Options");
	private JButton exit = new JButton("Exit");
	private JLabel mt = new JLabel("Kill Doctor Lucky");
	
	MainMenu(){
		mainMenu.setLayout(null);
		mt.setFont(new Font("ComicSan",Font.BOLD,30));
		strg.setBounds(250, 200, 100,50);
		multp.setBounds(250,260,100,50);
		opt.setBounds(250, 320, 100, 50);
		exit.setBounds(250, 380, 100, 50);
		mt.setBounds(180, 100, 350, 100);
		strg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				SelectPlayer m = new SelectPlayer();
				m.setVisible(true);
				
				
			}
			
		});
		mainMenu.add(strg);
		mainMenu.add(multp);
		mainMenu.add(opt);
		mainMenu.add(exit);
		mainMenu.add(mt);
		try {
			File sound = new File("C:\\Users\\lpare\\Desktop\\Simple.wav");
			AudioInputStream sis = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(sis);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			}catch(Exception e) {System.out.println(e);};
		add(mainMenu);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String []args) {
		new MainMenu();
	}
}
