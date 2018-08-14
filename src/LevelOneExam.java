import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelOneExam implements ActionListener {
JFrame frame;
JPanel panel;
JButton y,r,b,g;
	
	public static void main(String[] args) {
		LevelOneExam exam = new LevelOneExam();
		exam.makeGUI();
	}
	
	public void makeGUI(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		y = new JButton();
		y.setOpaque(true);
		y.setBackground(Color.YELLOW);
		r = new JButton();
		r.setOpaque(true);
		r.setBackground(Color.RED);
		b = new JButton();
		b.setOpaque(true);
		b.setBackground(Color.BLUE);
		g = new JButton();
		g.setOpaque(true);
		g.setBackground(Color.GREEN);
		
		frame.add(panel);

		panel.add(y);
		panel.add(r);
		panel.add(b);
		panel.add(g);
		y.addActionListener(this);
		r.addActionListener(this);
		b.addActionListener(this);
		g.addActionListener(this);
		
		frame.pack();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == y){
			speak("Yellow");
		}
		else if (e.getSource() == r){
			speak("red");
		}
		else if (e.getSource() == b){
			speak("blue");
		}
		else if (e.getSource() == g){
			speak("green");
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
