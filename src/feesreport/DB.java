
package feesreport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class DB {

	

	public static Connection con;
	public static PreparedStatement statement;

	
	
	public static void connect() {
		String URL = "jdbc:mysql://localhost:3306/feereport?allowPublicKeyRetrieval=true&useSSL =false";
		String username="root";
		String password ="Yogesh@321";
		
		try {
               Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,username,password);
			System.out.println("Connected to Database");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static int save(Accountant a){
		int status=0;
		try{
	        DB.connect();
			statement=DB.con.prepareStatement("insert feereport_accountact(accountantname,accountantpassword,email,contantno) values(?,?,?,?)");
	        statement.setString(1,a.getName());
			statement.setString(2,a.getPassword());
			statement.setString(3,a.getEmail());
			statement.setString(4,a.getContactno());
			status=statement.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static List<Accountant> view(){
		List<Accountant> list = new ArrayList<>();
	  try {
		  
		 DB.connect();
	     PreparedStatement ps = con.prepareStatement("Select * from feereport_accountact");
	     ResultSet rs = ps.executeQuery("Select * from feereport_accountact");
	    while (rs.next()) {
			Accountant a = new Accountant();
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setPassword(rs.getString(3));
			a.setEmail(rs.getString(4));
			a.setContactno(rs.getString(5));
			list.add(a);
			
		}
	    
		  
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
		
		
	}
	return list;
		
		
	}
	
	public static boolean validate(String name, String Password) {
		boolean status=false;
		try {
			DB.connect();
			PreparedStatement ps =con.prepareStatement("select * from feereport_accountact where accountantname = ? and accountantpassword =? ");
			ps.setString(1, name);
            ps.setString(2, Password);	
            ResultSet rs =ps.executeQuery();
            status=rs.next();
            
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	
	
	
	
	
	}












