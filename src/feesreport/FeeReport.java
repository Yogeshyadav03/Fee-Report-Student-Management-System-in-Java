package feesreport;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class FeeReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    JFrame frame = new JFrame("Fee report");
		    frame.getContentPane().setBackground(Color.ORANGE);
		    
		    JLabel label = new JLabel("Fee Report");
		    label.setBounds(100, 40, 300, 50);
		    label.setFont(new Font("Serif",Font.BOLD,40));
		    label.setForeground(Color.BLACK);
		    
		    
		    JButton btnAdminLogin = new  JButton("Admin Login");
		    btnAdminLogin.setBounds(80, 120, 200, 35);
		    btnAdminLogin.setFont(new Font("Serif", Font.PLAIN, 20));
            btnAdminLogin.setBackground(Color.BLUE);
			btnAdminLogin.setForeground(Color.WHITE);
			
			
			JButton btnAccountantLogin = new JButton("Accountant Login");
			btnAccountantLogin.setBounds(80, 180, 200, 35);
			btnAccountantLogin.setFont(new Font("Serif", Font.PLAIN,20));
			btnAccountantLogin.setBackground(Color.BLUE);
			btnAccountantLogin.setForeground(Color.WHITE);
			
			
		    btnAdminLogin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					AdminLogin.main(new String[]{});
					frame.dispose();
				}
			});
		    
		    btnAccountantLogin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					AccontantLogin.main(new String[] {});
					frame.dispose();
				}
			});
		    
		    
		    		
		    
		    
		    
		    
		    frame.setLayout(null);
		    frame.add(label);
		    frame.add(btnAdminLogin);
		    frame.add(btnAccountantLogin);
		    
		    
		    
		    
		    
		    frame.setSize(400,400);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
	}

}
