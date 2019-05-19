package pl.gkaz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "ToolList", value = "/")
public class ToolController extends HttpServlet {

    private ToolService toolsService = new ToolService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        initializeTools();

        req.getRequestDispatcher("/model.jsp").forward(req, resp);
    }

    private void initializeTools() {
        if (getServletContext().getAttribute("tools") == null) {
            getServletContext().setAttribute("tools", toolsService.getTools());
        }
    }
}
