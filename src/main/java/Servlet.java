import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String u = request.getParameter("usd");
        String p = request.getParameter("pass");
        RequestDispatcher requestDispatcher = null;
        if (u.equals("admin") && p.equals("123")) ;
        {
            requestDispatcher = request.getRequestDispatcher("boss.jsp");
            request.setAttribute("ten", u);
        }else{
            requestDispatcher = request.getRequestDispatcher("index.jsp");
        }
        requestDispatcher.forward(request, response);
    }

        @Override
        protected void doPost ;(HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {
    }
}