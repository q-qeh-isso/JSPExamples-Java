package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExibeCookies
 */
@WebServlet("/ExibeCookies")
public class ExibeCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExibeCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Cookie cNome = new Cookie("nome", "joão joão");
		//Cookie cEmail = new Cookie("email", "joao@email.com.br");
		Cookie[] cookies = request.getCookies();
		PrintWriter out = response.getWriter();
		request.getSession();
		out.println("<html><head></head><body><h1>Cookies registrados para localhost</h1>");
		if(cookies != null){
			for(Cookie c : cookies){
				out.println("<h2>Cookie: " + c.getName() + " -- " + c.getValue() + "</h2><br/>");
			}
		}else{
			out.println("<h2>Não há registro de cookies</h2>");
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
