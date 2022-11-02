import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessingGameWinServlet", urlPatterns = "/guessingGameWin")
public class GuessingGameWinServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("guessingGameResult", "YOU WIN!");
        request.getRequestDispatcher("/viewGuessingGameResult.jsp").forward(request, response);
    }

}
