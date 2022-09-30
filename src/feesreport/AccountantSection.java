 package feesreport;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AccountantSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		JFrame frame  = new JFrame("Accountant Section");
		frame.getContentPane().setBackground(Color.PINK);
		
		JLabel label = new JLabel("Accontant Section");
	    label.setBounds(70, 40, 300, 30);
	    label.setFont(new Font("Serif",Font.BOLD,30));
	    label.setForeground(Color.BLACK);
	    
	    
	    JButton btnAddStudent = new JButton("Add Student");
	    btnAddStudent.setBounds(20, 120, 150, 35);
	    btnAddStudent.setFont(new Font("Serif", Font.PLAIN, 20));
        btnAddStudent.setBackground(Color.BLUE);
		btnAddStudent.setForeground(Color.WHITE);
		
		
		   JButton btnViewStudent = new JButton("View Student");
		    btnViewStudent.setBounds(200, 120, 150, 35);
		    btnViewStudent.setFont(new Font("Serif", Font.PLAIN, 20));
	        btnViewStudent.setBackground(Color.BLUE);
			btnViewStudent.setForeground(Color.WHITE);
		
			   JButton btnEditStudent = new JButton("Edit Student");
			    btnEditStudent.setBounds(20, 190, 150, 35);
			    btnEditStudent.setFont(new Font("Serif", Font.PLAIN, 20));
		        btnEditStudent.setBackground(Color.BLUE);
				btnEditStudent.setForeground(Color.WHITE);
				
				
	                JButton btnDueFee = new JButton("Due Fee");
				    btnDueFee.setBounds(200, 190, 150, 35);
				    btnDueFee.setFont(new Font("Serif", Font.PLAIN, 20));
			        btnDueFee.setBackground(Color.BLUE);
					btnDueFee.setForeground(Color.WHITE);

					JButton btnLogout = new JButton(" Logout");
					btnLogout.setBounds(110, 260, 150, 35);
					btnLogout.setFont(new Font("Serif", Font.PLAIN,20));
					btnLogout.setBackground(Color.BLUE);
					btnLogout.setForeground(Color.WHITE);
					
					
					
					btnAddStudent.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							AddStudent.main(new String[] {});
							frame.dispose();
						}
					});
					
					btnEditStudent.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							EditStudent.main(new String [] {});
							frame.dispose();
						}
					});
					
					btnViewStudent.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							ViewStudent.main(new String [] {});
							frame.dispose();
						}
					});
					
					btnDueFee.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
						   DueFee.main(new String[] {});	
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
		frame.add(btnAddStudent);
		frame.add(btnViewStudent);
		frame.add(btnEditStudent);
		frame.add(btnDueFee);
		frame.add(btnLogout);
		
		
		
		
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
