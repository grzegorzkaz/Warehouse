package pl.gkaz.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "MyFilter", servletNames = "ToolList") //zamiast servletNames może być value = "/"
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        if (req.getSession().getAttribute("user") == null
                && !req.getRequestURI().endsWith("/login")) {
            resp.sendRedirect("/login");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}