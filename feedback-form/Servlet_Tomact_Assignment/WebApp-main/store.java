import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class store extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Correct method: getParameter (not getParameters)
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        // Create session and store attributes
        HttpSession session = request.getSession();
        session.setAttribute("name", name);  // Correct method: setAttribute
        session.setAttribute("age", age);
        session.setAttribute("password", password);
        session.setAttribute("gender", gender);
        session.setAttribute("address", address);

             response.sendRedirect("welcome");
    }
}
