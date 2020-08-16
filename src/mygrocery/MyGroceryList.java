package mygrocery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyGroceryList {
	private DB db = new DB();
	private GroceryItems groceryitems = new GroceryItems();
	
	public void addTolist() {};
	
	public String[][] getMyList(String user_id) {
		ResultSet rs = db.execute("select * from mygrocerylist where user_id=" + user_id);
		ArrayList<String[]> items = new ArrayList<String[]>();
		try {
			while(rs.next()) {
				String item_id = rs.getString("groceryitem_id");
				String notes = rs.getString("notes") == null ? "No notes" : rs.getString("notes");
				String[] details = groceryitems.getItemById(item_id);
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
}
