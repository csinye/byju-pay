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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String customer_name = request.getParameter("name"); 
        String email = request.getParameter("email"); 
        String course = request.getParameter("course"); 
        String phno = request.getParameter("pno"); 
        String amount = request.getParameter("amount"); 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Hello " + "  " + name + "welcome to my blog");
		out.println("Your password is : " + "  " + email + "<br>");
		out.println("</body></html>");
		out.close();
	}
}