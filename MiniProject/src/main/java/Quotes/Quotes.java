package Quotes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Servlet implementation class Quotes
 */
@WebServlet("/Quotes")
public class Quotes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Quotes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entered");
		String ca = request.getParameter("category");
		System.out.println(ca);
		
		QuotesClass quote = new QuotesClass();
		JSONObject json = new JSONObject();
		
		json.put("quotes",quote.getQuotes(ca));
		
		System.out.println(json);
		response.getWriter().append(json.toString());
		//doGet(request, response);
	}

}
