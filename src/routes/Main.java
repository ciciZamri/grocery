package routes;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mygrocery.*;

@WebServlet("/main")
public class Main extends HttpServlet {
	private DB db = new DB("grocery", "mysql", "mysql");
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String data = "";
	    ResultSet rs = db.execute("SELECT * FROM USER");
	    try {
			while(rs.next()) {
				data += rs.getString("name") + " || ";
				data += rs.getString("email") + " || ";
				data += Util.hash("abc").equals(rs.getString("password")) + " || ";
				data += rs.getString("password") + "<br>";
			}
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    request.setAttribute("name", data); 
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
