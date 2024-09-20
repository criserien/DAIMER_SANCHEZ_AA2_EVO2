@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // Lógica para registrar el pedido en la base de datos
        // ...

        response.sendRedirect("orderSuccess.jsp");
    }
}