package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGui extends JFrame{

	public static void main(String[] args) {
		MyGui gui = new MyGui();
		gui.launch();
	}
	
	private void launch() {
		this.setTitle("첫 GUI 제작");
		this.setSize(500, 300);
		
		JButton button1 = new JButton("North");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭했니?");
				
			}
		});
		
		this.add(BorderLayout.NORTH, button1);
		
		this.add(BorderLayout.SOUTH, new JButton("South"));
		this.add(BorderLayout.EAST, new JButton("East"));
		this.add(BorderLayout.WEST, new JButton("West"));
		this.add(BorderLayout.CENTER, new JButton("Center"));
		
		
		this.setVisible(true);
	}
}
