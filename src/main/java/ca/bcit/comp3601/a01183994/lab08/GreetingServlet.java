package ca.bcit.comp3601.a01183994.lab08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ca.bcit.comp3601.a01183994.lab08.domain.User;

@WebServlet("/results")
public class GreetingServlet extends HttpServlet {
    private static final long serialVersionUID = 3044584220137646659L;

    @Override
    public void init() throws ServletException {
        super.init();
        InitParams.getInstance(getServletContext());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        InitParams initParams = InitParams.getInstance(getServletContext());
        
        if (initParams.isValidName(firstName)) {
            firstName = initParams.capitalizeFirstLetter(firstName);
            User user = new User(firstName);
            request.setAttribute("user", user);
            request.setAttribute("greeting", initParams.getGreeting());
            request.setAttribute("currentDateTime", initParams.getCurrentDateTime());
            request.getRequestDispatcher("/results.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Invalid name. Please try again.");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}