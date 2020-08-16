package mygrocery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyGroceryList {
	private DB db = new DB();
	private GroceryItems groceryitems = new GroceryItems();
	
	public void addTolist(String user_id, String item_name) {
		if(!isExist(user_id, item_name)) {
			String sql = "insert into mygrocerylist (user_id, groceryitem_name, notes)" + 
					 "values (" + user_id + ", \"" + item_name + "\", \"No notes\")";
			db.executeUpdate(sql);
		}else{
			System.out.println("already exist...");
		}
	};
	
	public String[][] getMyList(String user_id) {
		ResultSet rs = db.execute("select * from mygrocerylist where user_id=" + user_id);
		ArrayList<String[]> items = new ArrayList<String[]>();
		try {
			while(rs.next()) {
				String item_name = rs.getString("groceryitem_name");
				String notes = rs.getString("notes") == null ? "No notes" : rs.getString("notes");
				String[] details = groceryitems.getItemByName(item_name);
				String[] arr = {details[0], details[2], notes}; // name, image filename and notes
				items.add(arr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String[][] results = new String[items.size()][3];
		for(int i = 0 ; i<results.length ; i++) {
			results[i][0] = items.get(i)[0];
			results[i][1] = items.get(i)[1];
			results[i][2] = items.get(i)[2];
		}
		return results;
	}
	
	public boolean isExist(String user_id, String item_name) {
		String[][] items = getMyList(user_id);
		boolean exist = false;
		for(int i = 0 ; i<items.length ; i++) {
			if(items[i][0].equals(item_name)) {
				exist = true;
			}
		}
		return exist;
	}
	
	public void deleteFromList(String user_id, String item_name) {
		db.executeUpdate("delete from mygrocerylist where user_id=" + user_id + " and groceryitem_name=\"" + item_name + "\"");
	}
	
	public void updateList(String user_id, String item_name, String notes) {
		String sql = "update mygrocerylist set notes=\"" + notes + "\" where user_id=" + user_id + " and groceryitem_name=\"" + item_name + "\"";
		db.executeUpdate(sql);
	}
}
