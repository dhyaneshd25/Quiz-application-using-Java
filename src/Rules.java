import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class playwindow extends JFrame{
	
	playwindow(){
		
	}

	playwindow(String str){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setSize(1200,500);
		setLocation(100,100);
		setVisible(true);
		
		JLabel heading=new JLabel(str);
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Vinor Mand ITC",Font.BOLD,40));
		add(heading);

	}
	public static void main(String[] args) {
       new playwindow();
	}

}
