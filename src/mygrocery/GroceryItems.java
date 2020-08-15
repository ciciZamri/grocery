package mygrocery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GroceryItems {
//	String name;
//	String image_path;
//	String category;
//	String description;
	
	private DB db = new DB("grocery", "mysql", "mysql");
	
	public String[] getItem(String itemName) {
		ResultSet rs = db.execute("select * from groceryitems where name=\"" + itemName + "\"");
		String[] arr = {"", "", ""};
		try {
			while(rs.next()) {
				String item_name = rs.getString("name");
				String description = rs.getString("description");
				String image_filename = "images/" + item_name + ".png";
				arr[0] = item_name;
				arr[1] = description;
				arr[2] = image_filename;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}
	
	public String[][] getItemsByCategory(String category){
		ResultSet rs = db.execute("select name from groceryitems where category=\"" + category + "\"");
		ArrayList<String[]> items = new ArrayList<String[]>();
		try {
			while(rs.next()) {
				String item_name = rs.getString("name");
				String image_filename = "images/" + item_name + ".png";
				String[] arr = {item_name, image_filename};
				items.add(arr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String[][] results = new String[items.size()][2];
		for(int i = 0 ; i<results.length ; i++) {
			results[i][0] = items.get(i)[0];
			results[i][1] = items.get(i)[1];
		}
		return results;
	}
}
