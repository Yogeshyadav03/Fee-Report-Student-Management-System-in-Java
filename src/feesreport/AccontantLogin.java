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

public class AccontantLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Accountant Login");
		frame.getContentPane().setBackground(Color.PINK);
		
		 JLabel label = new JLabel("Accontant Login");
		    label.setBounds(70, 40, 300, 50);
		    label.setFont(new Font("Serif",Font.BOLD,40));
		    label.setForeground(Color.BLACK);
		    
		    
		    JLabel accountantName = new JLabel("Name");
		    accountantName.setBounds(35,130,100,35);
		    accountantName.setFont(new Font("Serif",Font.PLAIN,25));
		    
		    JTextField accountantNameField = new JTextField();
		    accountantNameField.setBounds(140, 130, 210, 30);
		    accountantNameField.setFont(new Font("Serif",Font.ITALIC,20));
		    
		    
		    JLabel accountantPassword = new JLabel("Password");
		    accountantPassword.setBounds(35, 180, 100, 30);
		    accountantPassword.setFont(new Font("Serif",Font.PLAIN,20));
		    
		    JPasswordField accountantPasswordField = new JPasswordField();
		    accountantPasswordField.setBounds(140, 180, 210, 30);
		    accountantPasswordField.setFont(new Font("Serif",Font.ITALIC,20));
		    
		    
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
					String name= accountantNameField.getText();
					String password= String.valueOf(accountantPasswordField.getPassword());
					boolean status= DB.validate(name, password);
					if (status) {
						AccountantSection.main(new String[] {});
						frame.dispose();
					} else {

						JOptionPane.showMessageDialog(null, "Sorry, username or password error!");
					}
					
				}
			});
		
		
	     frame.setLayout(null);
	     frame.add(label);
	     frame.add(accountantName);
	     frame.add(accountantNameField);
	     frame.add(accountantPassword);
	     frame.add(accountantPasswordField);
	     frame.add(btnLogin);
	     frame.add(btnBack);
	     
	     
	     
	     
	     
	     frame.setSize(400, 400);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setVisible(true);


	}

}
