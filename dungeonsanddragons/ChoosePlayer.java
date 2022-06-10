package dungeonsanddragons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import java.awt.Color;

public class ChoosePlayer {
	public static void main(String[] args) {
		JFrame frame =new JFrame("choose a player");
		frame.setSize(1400,700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel1=new JPanel();
		frame.getContentPane().add(panel1); 
		panel1.setLayout(null);
		
		JButton button1=new JButton("Jon Snow");
		button1.setBounds(53, 59, 85, 23);
		button1.setVisible(true);
		panel1.add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Warrior P1=new Warrior(1, 9,"Jon_snow", 300, 30, 4,3);
				Level1.buildboard(P1);
				frame.setVisible(false);
				Gameplay.showWindow();
			}
		});
		
		
		JButton button2=new JButton("The Hound");
		button2.setSize(85,23);
		button2.setLocation(53,90);
		button2.setVisible(true);
		panel1.add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Warrior P2=new Warrior(1, 9,"The_Hound", 400, 20, 6,5);
				Level1.buildboard(P2);
				frame.setVisible(false);
				Gameplay.showWindow();
			}
		});
		
		JButton button3=new JButton("Melisandre");
		button3.setSize(99,23);
		button3.setLocation(179,59);
		button3.setVisible(true);
		panel1.add(button3);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mage P3=new Mage(1, 9,"Melisandre", 100, 5, 1,300,30,15,5,6);
				Level1.buildboard(P3);
				frame.setVisible(false);
				Gameplay.showWindow();
			}
		});
		
		JButton button4=new JButton("Thoros of Myr");
		button4.setSize(99,23);
		button4.setLocation(179,90);
		button4.setVisible(true);
		panel1.add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mage P4=new Mage(1, 9,"Thoros_of_Myr", 250, 25, 4,150,20,20,3,4);
				Level1.buildboard(P4);
				frame.setVisible(false);
				Gameplay.showWindow();
			}
		});
		
		JButton button5=new JButton("Arya Stark");
		button5.setSize(83,23);
		button5.setLocation(316,59);
		button5.setVisible(true);
		panel1.add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rouge P5=new Rouge(1, 9,"Arya Stark", 150, 40, 2,20);
				Level1.buildboard(P5);
				frame.setVisible(false);
				Gameplay.showWindow();
			}
		});
		
		JButton button6=new JButton("Bronn");
		button6.setSize(83,23);
		button6.setLocation(316,90);
		button6.setVisible(true);
		panel1.add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rouge P6=new Rouge(1, 9,"Bronn", 250, 35, 3,50);
				Level1.buildboard(P6);
				frame.setVisible(false);
				Gameplay.showWindow();
			}
		});
		
		

		
		JTextArea textArea = new JTextArea("Warrior");
		textArea.setVisible(true);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(53, 25, 83, 23);
		panel1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea("Mage");
		textArea.setVisible(true);
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setBounds(179, 25, 98, 23);
		panel1.add(textArea_1);
		
		JTextArea txtrRouge = new JTextArea();
		textArea.setVisible(true);
		txtrRouge.setBackground(Color.LIGHT_GRAY);
		txtrRouge.setText("Rouge");
		txtrRouge.setBounds(316, 25, 83, 23);
		panel1.add(txtrRouge);

	}
}
