import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "Servlet", urlPatterns = "/hello")
public class Servlet extends HttpServlet {

    int pageCounter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String resetCounter = request.getParameter("resetCounter");

        pageCounter += 1;

        if (Objects.equals(resetCounter, "true")) {
            pageCounter = 0;
        }
        response.setContentType("text/html");
        String printThis = "Hello World!";



        PrintWriter out = response.getWriter();
        if (name == null) {
            out.println("<h1>Hello World!</h1>");
        } else {
            out.println("<h1>" + "Hello " + name + "</h1>");
        }
        out.println("<h2>This page has been viewed " + pageCounter + " times.</h2>");
        out.println("<h3>Add a query string called resetCounter and set it equal to true to reset page counter");

    }
}
