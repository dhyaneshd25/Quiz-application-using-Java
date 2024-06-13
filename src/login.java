import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener{
	
	JButton playb,exitb;
	JTextField inname;
	
	login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/img1.jpg"));
	    JLabel img1=new JLabel(i1);
	    img1.setBounds(0,0,600,500);
		add(img1);
		
		JLabel heading=new JLabel("Java Quiz");
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Vinor Mand ITC",Font.BOLD,40));
		add(heading);
		
		JLabel name=new JLabel("Enter Your Name");
		name.setBounds(750,150,300,45);
		name.setFont(new Font("Vinor Mand ITC",Font.BOLD,20));
		add(name);
		
		inname=new JTextField();
		inname.setBounds(750,240,300,45);
		inname.setFont(new Font("Vinor Mand ITC",Font.BOLD,20));
		add(inname);

		playb =new JButton("Play");
		playb.setBounds(750,300,100,45);
		playb.setFont(new Font("Vinor Mand ITC",Font.BOLD,20));
		playb.addActionListener(this);
		add(playb);
		
		exitb =new JButton("Exit");
		exitb.setBounds(870,300,100,45);
		exitb.setFont(new Font("Vinor Mand ITC",Font.BOLD,20));
		exitb.addActionListener(this);
		add(exitb);

		setSize(1200,500);
		setLocation(100,100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==playb) {
			setVisible(false);
			String n=inname.getText();
			new playwindow(n);
		}else if(ae.getSource()==exitb) {
			setVisible(false);
		}
	}
	public static void main(String args[]) {
		
		new login();
		
	}
}
