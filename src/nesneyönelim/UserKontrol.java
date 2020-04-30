package nesneyönelim;
import java.sql.*;


public class UserKontrol{
	
	String[] name = new String[10];
	String[] password = new String[10];
	
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
	public int UserControl(String user) {
		int deger = 0;
		for(String i: name) {
			if(i.equals(user)) {
				return deger;
			}
			deger++;
		}
			System.out.println("Wrong User Name");
			return -1;
	}
	
	public boolean PassControl(String pass,int deger) {
		if(password[deger].equals(pass)) {
			System.out.println("Login successful");
			return true;
		}
		else {
			System.out.println("Wrong Password");
			return false;
		}
	}
  
}