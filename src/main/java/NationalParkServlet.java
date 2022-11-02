import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NationalParkServlet", urlPatterns = "/nps")
public class NationalParkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] nationalParks = {"Grand Canyon National Park", "Yosemite National Park", "Denali National park", "Arches national Park", "Glacier National Park"};

        request.setAttribute("national-park-list", nationalParks);

        request.getRequestDispatcher("/nps.jsp").forward(request, response);
    }
}
