import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frameRunner {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PanelTest p = new PanelTest();
		frame.add(p);
		frame.setVisible(true);
		frame.pack();
		
	}
}
