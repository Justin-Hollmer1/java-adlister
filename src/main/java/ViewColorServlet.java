import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/displayColor")
public class ViewColorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String pickedColor = request.getParameter("pickcolor");
        request.setAttribute("displayedColor", pickedColor);
        request.getRequestDispatcher("/displayedColor.jsp").forward(request, response);
    }
}
