package feesreport;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class AddAccountant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Add Accountant");
		frame.getContentPane().setBackground(Color.YELLOW);
		
		JLabel label = new JLabel("Add Accountant");
		label.setBounds(75, 40, 300, 50);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		
		JLabel accountantName = new JLabel ("Name");
		accountantName.setBounds(35, 150, 100, 35);
        accountantName.setFont(new Font("Serif",Font.PLAIN,25));
        
        
        JTextField accountantNameField = new JTextField();
        accountantNameField.setBounds(140, 150, 210, 30);
        accountantNameField.setFont(new Font("Serif",Font.ITALIC,20));
        
        
        JLabel accountantPassword = new JLabel("Password");
	    accountantPassword.setBounds(35, 200, 100, 30);
	    accountantPassword.setFont(new Font("Serif",Font.PLAIN,23));
	    
	    JPasswordField accountantPasswordField = new JPasswordField();
	    accountantPasswordField.setBounds(140, 200, 210, 30);
	    accountantPasswordField.setFont(new Font("Serif",Font.ITALIC,20));
	    
	    JLabel accountantEmail = new JLabel ("Email");
		accountantEmail.setBounds(35, 250, 100, 35);
        accountantEmail.setFont(new Font("Serif",Font.PLAIN,25));
        
        
        JTextField accountantEmailField = new JTextField();
        accountantEmailField.setBounds(140, 250, 210, 30);
        accountantEmailField.setFont(new Font("Serif",Font.ITALIC,20));
        
        JLabel accountantContactNo = new JLabel ("Contact No");
        accountantContactNo.setBounds(35, 300, 100, 35);
        accountantContactNo.setFont(new Font("Serif",Font.PLAIN,20));
              
              
        JTextField accountantContactNoField = new JTextField();
        accountantContactNoField.setBounds(140, 300, 210, 30);
        accountantContactNoField.setFont(new Font("Serif",Font.ITALIC,20));
        
        
        JButton btnAddAccountant = new JButton("Add Accountant");
	    btnAddAccountant.setBounds(100, 350, 210, 35);
	    btnAddAccountant.setBackground(Color.BLUE);
	    btnAddAccountant.setForeground(Color.WHITE);
	    btnAddAccountant.setFont(new Font("Serif",Font.PLAIN,20));
	    
	    
	    JButton  btnBack = new JButton("Back");
	    btnBack.setBounds(12, 18, 75, 25);
	    btnBack.setFont(new Font("Serif",Font.PLAIN,20));
	    btnBack.setForeground(Color.BLUE);
	    
	    
	    btnAddAccountant.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
					String name=accountantNameField.getText();
					char ch[]=accountantPasswordField.getPassword();
					String password=String.valueOf(ch);
					String email=accountantEmailField.getText();
					String contactno=accountantContactNoField.getText();
					
					Accountant a=new Accountant(name,password,email,contactno);
					int status=DB.save(a);
					
					if(status>0){
						JOptionPane.showMessageDialog(null, "Accountant added!");
						accountantNameField.setText("");accountantPasswordField.setText("");accountantEmailField.setText("");
						accountantContactNoField.setText("");
					}else{
						JOptionPane.showMessageDialog(null, "Accountant Not added!");
					}
				}
			
		
		});
	    
	    
	    
	    
	    
	    
	    
	    btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AdminSection.main(new String [] {});
				frame.dispose();
			}
		});
	    
	    
        
		
		
	
		frame.setLayout(null);
		frame.add(label);
		frame.add(accountantName);
		frame.add(accountantNameField);
		frame.add(accountantPassword);
		frame.add(accountantPasswordField);
		frame.add(accountantEmail);
		frame.add(accountantEmailField);
		frame.add(accountantContactNo);
		frame.add(accountantContactNoField);
		frame.add(btnAddAccountant);
		frame.add(btnBack);
		
		
		
		
		
		
		
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
