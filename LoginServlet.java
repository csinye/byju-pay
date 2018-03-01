import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletConfig; 
import javax.servlet.ServletContext; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebInitParam; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/LoginServlet")

public class LoginServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, java.io.IOException {
		String customer_name = req.getParameter("name"); 
        String email = req.getParameter("email"); 
        String course = req.getParameter("course"); 
        String phno = req.getParameter("pno"); 
        String amount = req.getParameter("amount"); 
		res.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Hello " + "  " + name + "welcome to my blog");
		out.println("Your password is : " + "  " + email + "<br>");
		out.println("</body></html>");
		out.close();
	}
}