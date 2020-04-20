package nesneyönelim;
import java.sql.*;

public class UserKontrol{
	
	String[] name = new String[3];
	String[] password = new String[3];
	
	public void DatabaseUsers(){
		DatabaseConnection instance = DatabaseConnection.getInstance();
		Connection conn = DatabaseConnection.getConnection();
		
	int i = 0;
	try {
		Statement statement = conn.createStatement();
		String sql = "SELECT * FROM users";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()){
			name[i] = rs.getString("user_name");
			password[i] = rs.getString("password");
			i++;
		}
	}catch(Exception e) {
		System.out.println(e);
	}
}
	public boolean Control(String user, String pass) {

		if(name[0].equals(user)) {
			if(password[0].equals(pass)) {
				System.out.println("Login successful");
				return true;
			}
			else System.out.println("Wrong Password");
		}
		if(name[1].equals(user)) {
			if(password[1].equals(pass)) {
				System.out.println("Login successful");
				return true;
			}
			else System.out.println("Wrong Password");
		}
		if(name[2].equals(user)) {
			if(password[2].equals(pass)) {
				System.out.println("Login successful");
				return true;
			}
			else System.out.println("Wrong Password");
		}
		return false;
	}

  
}