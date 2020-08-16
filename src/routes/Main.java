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
//	    request.setAttribute("page", "main"); 
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
