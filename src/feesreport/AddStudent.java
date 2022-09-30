package feesreport;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Add Students");
		frame.getContentPane().setBackground(Color.PINK);
		
		JLabel label = new JLabel("Add Students");
		label.setBounds(170, 35, 300, 50);
		label.setFont(new Font("Serif",Font.BOLD,35));
		label.setForeground(Color.BLACK);
		
		
		JLabel studentName = new JLabel("Name:");
		studentName.setBounds(35,160,100,35);
		studentName.setFont(new Font("Serif",Font.PLAIN,25));
		
		JTextField stuNameField = new JTextField();
		stuNameField.setBounds(170, 160, 280, 35);
		stuNameField.setFont(new Font("Serif", Font.ROMAN_BASELINE,23));
		
		
		JLabel studentEmail = new JLabel("Email:");
		studentEmail.setBounds(35,220, 100, 35);
		studentEmail.setFont(new Font("Serif",Font.PLAIN,25));
		
		
		JTextField stuEmailField = new JTextField();
		stuEmailField.setBounds(170, 220, 280, 35);
		stuEmailField.setFont(new Font("Serif", Font.ROMAN_BASELINE,23));
		
		JLabel stuCourse = new JLabel("Course: ");
		stuCourse.setBounds(35, 280, 100, 35);
		stuCourse.setFont(new Font("Serif",Font.PLAIN,25));
		
		
		JTextField stuCourseField = new JTextField();
		stuCourseField.setBounds(170, 280, 280, 35);
		stuCourseField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		JLabel stuFee = new JLabel("Fee: ");
		stuFee.setBounds(35, 340, 100, 35);
		stuFee.setFont(new Font("Serif",Font.PLAIN,25));
		
		JTextField stuFeeField = new JTextField();
		stuFeeField.setBounds(170, 340, 280, 35);
		stuFeeField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		JLabel stuFeepaid = new JLabel(" Paid: ");
		stuFeepaid.setBounds(35, 400, 100, 35);
		stuFeepaid.setFont(new Font("Serif",Font.PLAIN,25));
		
		
		JTextField stuFeePaidField = new JTextField();
		stuFeePaidField.setBounds(170, 400, 280, 35);
		stuFeePaidField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		
		JLabel stuFeeDue = new JLabel(" Due: ");
		stuFeeDue.setBounds(35, 460, 100, 35);
		stuFeeDue.setFont(new Font("Serif",Font.PLAIN,25));
		
		
		JTextField stuFeeDueField = new JTextField();
		stuFeeDueField.setBounds(170, 460, 280, 35);
		stuFeeDueField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		JLabel stuAddress = new JLabel(" Address: ");
		stuAddress.setBounds(35, 520, 100, 35);
		stuAddress.setFont(new Font("Serif",Font.PLAIN,23));
		
		JTextArea stuAddressField = new JTextArea();
		stuAddressField.setBounds(170, 520, 280, 80);
		stuAddressField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		JLabel stuCity = new JLabel(" City: ");
		stuCity.setBounds(35, 620, 100, 35);
		stuCity.setFont(new Font("Serif",Font.PLAIN,23));
		
		JTextField stuCityField = new JTextField();
		stuCityField.setBounds(170, 620, 280, 35);
		stuCityField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		JLabel stuState = new JLabel(" State: ");
		stuState.setBounds(35, 660, 100, 35);
		stuState.setFont(new Font("Serif",Font.PLAIN,23));
		
		JTextField stuStateField = new JTextField();
		stuStateField.setBounds(170, 660, 280, 35);
		stuStateField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		JLabel stuCountry = new JLabel(" Country: ");
		stuCountry.setBounds(35, 700, 100, 35);
		stuCountry.setFont(new Font("Serif",Font.PLAIN,23));
		
		JTextField stuCountryField = new JTextField();
		stuCountryField.setBounds(170, 700, 280, 35);
		stuCountryField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		JLabel stuContactNo = new JLabel(" ContactNO: ");
		stuContactNo.setBounds(35, 740, 115, 35);
		stuContactNo.setFont(new Font("Serif",Font.PLAIN,20));
		
		JTextField stuContactNoField = new JTextField();
		stuContactNoField.setBounds(170, 740, 280, 35);
		stuContactNoField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
		
		
		 JButton btnAddStudent = new JButton("Add Student");
		    btnAddStudent.setBounds(130, 820, 210, 45);
		    btnAddStudent.setBackground(Color.BLUE);
		    btnAddStudent.setForeground(Color.WHITE);
		    btnAddStudent.setFont(new Font("Serif",Font.PLAIN,25));
		
		    JButton  btnBack = new JButton("Back");
		    btnBack.setBounds(12, 18, 75, 25);
		    btnBack.setFont(new Font("Serif",Font.PLAIN,20));
		    btnBack.setForeground(Color.BLUE);
		    
		    
		    btnBack.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					AccountantSection.main(new String [] {});
					frame.dispose();
				}
			});
		    
		    
		    btnAddStudent.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String name = stuNameField.getText();
					String email = stuEmailField.getText();
					String course = stuCourseField.getText();
					int fee = Integer.parseInt(stuFeeField.getText());
					int paid = Integer.parseInt(stuFeePaidField.getText());
					int due = Integer.parseInt(stuFeeDueField.getText());
					String address = stuAddressField.getText();
					String city = stuCityField.getText();
					String state = stuStateField.getText();
					String country = stuCountryField.getText();
					String contactno = stuContactNoField.getText();
					
					Student s = new Student(name, email, course, fee, paid, due, address, city, state, country, contactno); 
					int status= StudentDB.save(s);	
					
					
					if (status>0) {
						JOptionPane.showMessageDialog(null,"Student Added Successfully!");
						stuNameField.setText(" ");
						stuEmailField.setText(" ");
						stuCourseField.setText(" ");
						stuFeeField.setText(" ");
						stuFeePaidField.setText(" ");
						stuFeeDueField.setText(" ");
						stuAddressField.setText(" ");
						stuCityField.setText(" ");
						stuStateField.setText(" ");
						stuCountryField.setText(" ");
						stuContactNoField.setText(" ");
						
						
					} else {
						JOptionPane.showMessageDialog(null,"Sorry, Unable to add student!");
					}
					
					
					
				}
			});
		    
		
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(studentName);
		frame.add(stuNameField);
		frame.add(studentEmail);
		frame.add(stuEmailField);
		frame.add(stuCourse);
		frame.add(stuCourseField);
		frame.add(stuFee);
		frame.add(stuFeeField);
		frame.add(stuFeepaid);
		frame.add(stuFeePaidField);
		frame.add(stuFeeDue);
		frame.add(stuFeeDueField);
		frame.add(stuAddress);
		frame.add(stuAddressField);
		frame.add(stuCity);
		frame.add(stuCityField);
		frame.add(stuState);
		frame.add(stuStateField);
		frame.add(stuCountry);
		frame.add(stuCountryField);
		frame.add(stuContactNo);
		frame.add(stuContactNoField);
		frame.add(btnAddStudent);
		frame.add(btnBack);
		
		
		frame.setSize(550,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
