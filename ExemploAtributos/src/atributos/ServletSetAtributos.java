package atributos;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSetAtributos
 */
@WebServlet("/ServletSetAtributos")
public class ServletSetAtributos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSetAtributos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Atribuindo para o escopo de REQUEST (apenas na requisição)
		request.setAttribute("data", new Date());
		//Atribuindo para o escopo de SESSION (usuario)
		request.getSession().setAttribute("data", new Date());
		//Atribuindo para o escopo de APPLICATION/CONTEXT (compartilhado)
		request.getServletContext().setAttribute("data", new Date());
		
		response.getWriter().append("Atribuição bem sucedida!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
