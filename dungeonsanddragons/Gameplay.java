/**
 * 
 */
package dungeonsanddragons;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author user
 *
 */
public class Gameplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showWindow();
	}
	public static void showWindow(){
		JFrame frame =new JFrame("gemplay");
		frame.setSize(1400,700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1=new JPanel();
		frame.add(panel1); 
		Level1.print();
	}

}
