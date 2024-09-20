package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SuggestionServlet")
public class SuggestionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SuggestionServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Definir el tipo de respuesta
        response.setContentType("text/html");

        // Crear un formulario de sugerencias en respuesta GET
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Envía tu Sugerencia</h2>");
        out.println("<form method='POST' action='SuggestionServlet'>");
        out.println("Nombre: <input type='text' name='name'><br>");
        out.println("Email: <input type='email' name='email'><br>");
        out.println("Sugerencia: <textarea name='suggestion' rows='5' cols='30'></textarea><br>");
        out.println("<input type='submit' value='Enviar Sugerencia'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario enviado
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String suggestion = request.getParameter("suggestion");

        // Definir el tipo de respuesta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Validar los datos
        if (name.isEmpty() || email.isEmpty() || suggestion.isEmpty()) {
            out.println("<html><body>");
            out.println("<h3>Por favor, completa todos los campos antes de enviar la sugerencia.</h3>");
            out.println("<a href='SuggestionServlet'>Volver</a>");
            out.println("</body></html>");
        } else {
            // Aquí podrías guardar los datos en una base de datos, si fuera necesario
            out.println("<html><body>");
            out.println("<h3>Gracias, " + name + ", por tu sugerencia.</h3>");
            out.println("<p>Nos pondremos en contacto contigo a través de tu correo electrónico: " + email + ".</p>");
            out.println("<p>Sugerencia recibida: " + suggestion + "</p>");
            out.println("<a href='index.html'>Volver a la página principal</a>");
            out.println("</body></html>");
        }
    }
}