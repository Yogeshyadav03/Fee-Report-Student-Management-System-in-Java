package feesreport;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDB {

	
	public static int save(Student st) {
		int status=0;
		try {
			DB.connect();
			PreparedStatement ps = DB.con.prepareStatement("insert into feereport_student(name,email,course,fee,paid,due,address,city,state,country,contactno) values (?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, st.getName());
			ps.setString(2,st.getEmail());
			ps.setString(3, st.getCourse());
			ps.setInt(4, st.getFee());
			ps.setInt(5, st.getPaid());
			ps.setInt(6, st.getDue());
			ps.setString(7,st.getAddress());
			ps.setString(8,st.getCity());
			ps.setString(9, st.getState());
			ps.setString(10, st.getCountry());
			ps.setString(11, st.getContactno());
			status=ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	
	public static int update(Student st) {
		int status=0;
		try {
			DB.connect();
			PreparedStatement ps = DB.con.prepareStatement("update feereport_student set name=?,email=?,course=?,fee=?,paid=?,due=?,address=?,city=?,state=?,country=?,contactno=? where rollno=?");
			ps.setString(1, st.getName());
			ps.setString(2,st.getEmail());
			ps.setString(3, st.getCourse());
			ps.setInt(4, st.getFee());
			ps.setInt(5, st.getPaid());
			ps.setInt(6, st.getDue());
			ps.setString(7,st.getAddress());
			ps.setString(8,st.getCity());
			ps.setString(9, st.getState());
			ps.setString(10, st.getCountry());
			ps.setString(11, st.getContactno());
			ps.setInt(12,st.getRoll_no());
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}
	
	public static Student getStudentByRollno(int roll_no) {
		Student s = new Student();
	try {
		DB.connect();
		PreparedStatement ps=DB.con.prepareStatement("select * from feereport_student where rollno=?");
		ps.setInt(1, roll_no);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			s.setRoll_no(rs.getInt("rollno"));
			s.setName(rs.getString("name"));
			s.setEmail(rs.getString("email"));
			s.setCourse(rs.getString("course"));
			s.setFee(rs.getInt("fee"));
			s.setPaid(rs.getInt("paid"));
			s.setDue(rs.getInt("due"));
			s.setAddress(rs.getString("address"));
			s.setCity(rs.getString("city"));
			s.setState(rs.getString("state"));
			s.setCountry(rs.getString("country"));
			s.setContactno(rs.getString("contactno"));
		} 
		
	} catch (Exception e) {
		// TODO: handle exception
	 System.out.println(e);
	}
	return s;
	}
	
	public static List<Student> view(){
		List<Student> list = new ArrayList<Student>();
		try {
			DB.connect();
			PreparedStatement ps = DB.con.prepareStatement("Select * from feereport_student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setRoll_no(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}
	
	public static List<Student> due(){
		List<Student> list = new ArrayList<Student>();
		try {
			DB.connect();
			PreparedStatement ps = DB.con.prepareStatement("select * from feereport_student where due>0");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setRoll_no(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return list;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

