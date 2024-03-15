package prototypeServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.prototype.Button;
import com.prototype.PrototypeRegistry;

/**
 * Servlet implementation class ProtoTypeServlet
 */
public class ProtoTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProtoTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Create a new PrototypeRegistry
        PrototypeRegistry registry = new PrototypeRegistry();

        // Create a Button prototype
        Button redButtonPrototype = new Button(10, 40, "red");

        // Add the Button prototype to the registry
        registry.addItem("LandingButton", redButtonPrototype);

        // Retrieve a clone of the red Button prototype from the registry
        Button clonedButton = (Button) registry.getByColor("red");

        // Set attributes to be accessed in JSP
        request.setAttribute("clonedButton", clonedButton);

        // Forward the request to the JSP page
        request.getRequestDispatcher("prototype.jsp").forward(request, response);;



}}
