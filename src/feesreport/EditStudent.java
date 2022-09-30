package feesreport;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class EditStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	     JFrame	frame = new JFrame("Edit Student");
	     frame.getContentPane().setBackground(Color.pink);
	     
	     JLabel stuRollNo = new JLabel("Roll No:");
	     stuRollNo.setBounds(40, 55, 100, 35);
	     stuRollNo.setFont(new Font("Serif",Font.PLAIN,25));
	     
	     JTextField rollNoField = new JTextField();
	     rollNoField.setBounds(170, 55, 250, 35);
	     rollNoField.setFont(new Font("Serif", Font.ROMAN_BASELINE,23));
	     
	     JButton btnLoadRecord = new JButton("Load Record");
		    btnLoadRecord.setBounds(445, 55, 180, 35);
		    btnLoadRecord.setBackground(Color.BLUE);
		    btnLoadRecord.setForeground(Color.WHITE);
		    btnLoadRecord.setFont(new Font("Serif",Font.PLAIN,20));
		    
		    
		   JLabel seprater = new JLabel("--------------------------------------------------------------------------------");
		   seprater.setBounds(20, 90, 650, 45);
		   seprater.setFont(new Font("Serif",Font.BOLD,25));
		   
		    
		    JLabel studentName = new JLabel("Name:");
			studentName.setBounds(35,140,100,35);
			studentName.setFont(new Font("Serif",Font.PLAIN,25));
			
			JTextField stuNameField = new JTextField();
			stuNameField.setBounds(170, 140, 280, 35);
			stuNameField.setFont(new Font("Serif", Font.ROMAN_BASELINE,23));
			
			
			JLabel studentEmail = new JLabel("Email:");
			studentEmail.setBounds(35,190, 100, 35);
			studentEmail.setFont(new Font("Serif",Font.PLAIN,25));
			
			
			JTextField stuEmailField = new JTextField();
			stuEmailField.setBounds(170, 190, 280, 35);
			stuEmailField.setFont(new Font("Serif", Font.ROMAN_BASELINE,23));
  
		
			JLabel stuCourse = new JLabel("Course: ");
			stuCourse.setBounds(35, 240, 100, 35);
			stuCourse.setFont(new Font("Serif",Font.PLAIN,25));
			
			
			JTextField stuCourseField = new JTextField();
			stuCourseField.setBounds(170, 240, 280, 35);
			stuCourseField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			JLabel stuFee = new JLabel("Fee: ");
			stuFee.setBounds(35, 290, 100, 35);
			stuFee.setFont(new Font("Serif",Font.PLAIN,25));
			
			JTextField stuFeeField = new JTextField();
			stuFeeField.setBounds(170, 290, 280, 35);
			stuFeeField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			JLabel stuFeepaid = new JLabel(" Paid: ");
			stuFeepaid.setBounds(35, 340, 100, 35);
			stuFeepaid.setFont(new Font("Serif",Font.PLAIN,25));
			
			
			JTextField stuFeePaidField = new JTextField();
			stuFeePaidField.setBounds(170, 340, 280, 35);
			stuFeePaidField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			JLabel stuFeeDue = new JLabel(" Due: ");
			stuFeeDue.setBounds(35, 390, 100, 35);
			stuFeeDue.setFont(new Font("Serif",Font.PLAIN,25));
			
			
			JTextField stuFeeDueField = new JTextField();
			stuFeeDueField.setBounds(170, 390, 280, 35);
			stuFeeDueField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			JLabel stuAddress = new JLabel(" Address: ");
			stuAddress.setBounds(35, 440, 100, 35);
			stuAddress.setFont(new Font("Serif",Font.PLAIN,23));
			
			JTextArea stuAddressField = new JTextArea();
			stuAddressField.setBounds(170, 440, 280, 80);
			stuAddressField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			JLabel stuCity = new JLabel(" City: ");
			stuCity.setBounds(35, 540, 100, 35);
			stuCity.setFont(new Font("Serif",Font.PLAIN,23));
			
			JTextField stuCityField = new JTextField();
			stuCityField.setBounds(170, 540, 280, 35);
			stuCityField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
	     
			JLabel stuState = new JLabel(" State: ");
			stuState.setBounds(35, 590, 100, 35);
			stuState.setFont(new Font("Serif",Font.PLAIN,23));
			
			JTextField stuStateField = new JTextField();
			stuStateField.setBounds(170, 590, 280, 35);
			stuStateField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			JLabel stuCountry = new JLabel(" Country: ");
			stuCountry.setBounds(35, 640, 100, 35);
			stuCountry.setFont(new Font("Serif",Font.PLAIN,23));
			
			JTextField stuCountryField = new JTextField();
			stuCountryField.setBounds(170, 640, 280, 35);
			stuCountryField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			JLabel stuContactNo = new JLabel(" ContactNO: ");
			stuContactNo.setBounds(35, 690, 115, 35);
			stuContactNo.setFont(new Font("Serif",Font.PLAIN,20));
			
			JTextField stuContactNoField = new JTextField();
			stuContactNoField.setBounds(170, 690, 280, 35);
			stuContactNoField.setFont(new Font("Serif",Font.ROMAN_BASELINE,23));
			
			
			 JButton btnUpdateStudent = new JButton("Update Student");
			    btnUpdateStudent.setBounds(180, 740, 210, 45);
			    btnUpdateStudent.setBackground(Color.BLUE);
			    btnUpdateStudent.setForeground(Color.WHITE);
			    btnUpdateStudent.setFont(new Font("Serif",Font.PLAIN,25));
			    
			    
			    JButton  btnBack = new JButton("Back");
			    btnBack.setBounds(12, 18, 75, 25);
			    btnBack.setFont(new Font("Serif",Font.PLAIN,20));
			    btnBack.setForeground(Color.BLUE);
			    
			    
			    
			    
			    btnLoadRecord.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String srollno = rollNoField.getText();
						if (srollno==null||srollno.trim().equals("")) {
							JOptionPane.showMessageDialog(null,"Please enter rollno first!");
						} else {
                               int rollno=Integer.parseInt(srollno);
                               Student s= StudentDB.getStudentByRollno(rollno);
                               stuNameField.setText(s.getName());
                               stuEmailField.setText(s.getEmail());
                               stuCourseField.setText(s.getCourse());
                               stuFeeField.setText(String.valueOf(s.getFee()));
                               stuFeePaidField.setText(String.valueOf(s.getPaid()));
                               stuFeeDueField.setText(String.valueOf(s.getDue()));
                               stuAddressField.setText(s.getAddress());
                               stuCityField.setText(s.getCity());
                               stuStateField.setText(s.getState());
                               stuCityField.setText(s.getCity());
                               stuContactNoField.setText(s.getContactno());
                               
						}
					}
				});
			    
			    btnUpdateStudent.addActionListener(new ActionListener() {
					
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
						int rollno = Integer.parseInt(rollNoField.getText());
						
						Student s = new Student(rollno,name,email,course,fee,paid,due,address,city,state,country,contactno);
						int status = StudentDB.update(s);
						
						
						if (status>0) {
							JOptionPane.showMessageDialog(null,"Student Updated Successfully!");
							AccountantSection.main(new String[] {});
							frame.dispose();
						} else {
							JOptionPane.showMessageDialog(null,"Sorry, Unable to add Student!");
						}
					}
				});
			    
			    
			    
			    
			    
			    
			    
			    
			    btnBack.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						AccountantSection.main(new String[] {});
						frame.dispose();
					}
				});
			    
			    
			    
			
			
	     
	     frame.setLayout(null);
	     frame.add(stuRollNo);
	     frame.add(rollNoField);
	     frame.add(btnLoadRecord);
	     frame.add(seprater);
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
		frame.add(btnUpdateStudent);
		frame.add(btnBack);
	    
	     
	     
	     
	     
	     
	     frame.setSize(700,900);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
	     
	}

}
