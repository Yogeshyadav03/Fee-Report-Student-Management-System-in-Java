package feesreport;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Admin Section");
	    frame.getContentPane().setBackground(Color.YELLOW);
	    
	    JLabel label = new JLabel("Admin Section");
	    label.setBounds(75, 40, 300, 50);
	    label.setFont(new Font("Serif",Font.BOLD,40));
	    label.setForeground(Color.BLACK);
	    
	    
	    JButton btnaddAccountant = new  JButton("Add Accountant");
	    btnaddAccountant.setBounds(80, 120, 200, 35);
	    btnaddAccountant.setFont(new Font("Serif", Font.PLAIN, 20));
        btnaddAccountant.setBackground(Color.BLUE);
		btnaddAccountant.setForeground(Color.WHITE);
		
		
		JButton btnViewAccountant = new JButton(" View Accountant");
		btnViewAccountant.setBounds(80, 180, 200, 35);
		btnViewAccountant.setFont(new Font("Serif", Font.PLAIN,20));
		btnViewAccountant.setBackground(Color.BLUE);
		btnViewAccountant.setForeground(Color.WHITE);
		
		JButton btnLogout = new JButton(" Logout");
		btnLogout.setBounds(80, 240, 200, 35);
		btnLogout.setFont(new Font("Serif", Font.PLAIN,20));
		btnLogout.setBackground(Color.BLUE);
		btnLogout.setForeground(Color.WHITE);
		
		
		
		btnaddAccountant.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddAccountant.main(new String[] {});
				frame.dispose();
			}
		});
		
		btnViewAccountant.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				ViewAcountact.main(new String[] {});
				frame.dispose();
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FeeReport.main(new String[] {});
				frame.dispose();
			}
		});
		
		
		 frame.setLayout(null);
		    frame.add(label);
		    frame.add(btnaddAccountant);
		    frame.add(btnViewAccountant);
		    frame.add(btnLogout);
		    
		    
		    
		    
		    
		    frame.setSize(400,400);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);

		

	}

}
