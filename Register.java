import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        try{
        out.println("<html>");
		out.println("<body>");
		out.println("Hello " + "  " + name + "welcome to my blog");
		out.println("Your password is : " + "  " + email + "<br>");
		out.println("</body></html>");
		out.close();
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }