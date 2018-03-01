import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class LoginServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
        String customer_name = request.getParameter("name"); 
        String email = request.getParameter("email"); 
        String course = request.getParameter("course"); 
        String phno = request.getParameter("pno"); 
        String amount = request.getParameter("amount"); 
        
     
          
        
        out.print("Welcome, "+name);  
        
        
        out.close();  
    }  
}  