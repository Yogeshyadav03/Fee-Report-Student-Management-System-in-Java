package feesreport;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class AdminLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Admin Login");
		frame.getContentPane().setBackground(Color.YELLOW);
		
		 JLabel label = new JLabel("Admin Login");
		    label.setBounds(80, 40, 300, 50);
		    label.setFont(new Font("Serif",Font.BOLD,40));
		    label.setForeground(Color.BLACK);
		    
		    
		    JLabel adminName = new JLabel("Name");
		    adminName.setBounds(35,130,100,35);
		    adminName.setFont(new Font("Serif",Font.PLAIN,25));
		    
		    JTextField adminNameField = new JTextField();
		    adminNameField.setBounds(140, 130, 210, 30);
		    adminNameField.setFont(new Font("Serif",Font.ITALIC,20));
		    
		    
		    JLabel adminPassword = new JLabel("Password");
		    adminPassword.setBounds(35, 180, 100, 30);
		    adminPassword.setFont(new Font("Serif",Font.PLAIN,20));
		    
		    JPasswordField adminPasswordField = new JPasswordField();
		    adminPasswordField.setBounds(140, 180, 210, 30);
		    adminPasswordField.setFont(new Font("Serif",Font.ITALIC,20));
		    
		    
		    JButton btnLogin = new JButton("Login");
		    btnLogin.setBounds(100, 250, 150, 30);
		    btnLogin.setBackground(Color.BLUE);
		    btnLogin.setForeground(Color.WHITE);
		    btnLogin.setFont(new Font("Serif",Font.PLAIN,20));
		    
		    JButton  btnBack = new JButton("Back");
		    btnBack.setBounds(12, 18, 75, 25);
		    btnBack.setFont(new Font("Serif",Font.PLAIN,20));
		    btnBack.setForeground(Color.BLUE);
		    
             btnBack.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					FeeReport.main(new String[] {});
					frame.dispose();
				}
			});
             
             btnLogin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String name = adminNameField.getText();
					char[] ch =adminPasswordField.getPassword();
					String password = String.valueOf(ch);
					
					if (name.equals("admin") && password.equals("admin123")) {
						String s[] = {};
						AdminSection.main(s);
						frame.dispose();
						
					} else {
                    JOptionPane.showMessageDialog(null,"Sorry, Username And Password error,");
                    adminNameField.setText(" ");
                    adminPasswordField.setText(" ");
					}
					
				}
			});
		    
		
		
	     frame.setLayout(null);
	     frame.add(label);
	     frame.add(adminName);
	     frame.add(adminNameField);
	     frame.add(adminPassword);
	     frame.add(adminPasswordField);
	     frame.add(btnLogin);
	     frame.add(btnBack);
	     
	     
	     
	     
	     
	     frame.setSize(400, 400);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setVisible(true);

	}

}
