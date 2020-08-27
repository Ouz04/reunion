package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class welcomeServlet
 */
@WebServlet("/welcomeServlet/*")
public class welcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getPathInfo();
		//System.out.println("action "+action +" context path "+request.getContextPath());
		String contextPath=request.getContextPath();
		
		if(action.equals("/logout"))
		{
			request.getSession().invalidate();
			response.sendRedirect(contextPath+"/index.jsp");
			
		}
		else
		{
			if(action.equals("/employee"))
				{//request.getRequestDispatcher("EmployeeListServlet").forward(request, response);
				response.sendRedirect(contextPath+"/EmployeeListServlet");
				
				}
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
