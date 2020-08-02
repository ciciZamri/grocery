package mygrocery;

import java.sql.ResultSet;

public class User {
	private DB db = new DB("grocery", "mysql", "mysql");
	
	public void register(String name, String email, String password){
		String hashed;
		try {
			hashed = Util.hash(password);
			db.executeUpdate("insert into user (name, email, password) values (" + "\""+name+"\", \""+email+"\", \""+hashed+"\")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String[] get(String email, String password){
		String[] user_details = {null, null, null, null}; // id, name, email, registration_date
		try {
			String hashed = Util.hash(password);
			ResultSet rs = db.execute("select * from user where email=\"" + email + "\" and password=\"" + hashed + "\"");
			while(rs.next()) {
				user_details[0] =  Integer.toString(rs.getInt("id"));
				user_details[1] = rs.getString("name");
				user_details[2] = rs.getString("email");
				user_details[3] = rs.getString("registration_date");
			}
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user_details;
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
