package filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String url = req.getRequestURI();

// если тянем стили для отображения страницы
        if (url.endsWith(".js") || url.endsWith(".css") || url.endsWith(".TTF")) {

            chain.doFilter(req, resp);
            return;
        }


        Object isLogin = ((HttpServletRequest) request).getSession().getAttribute("isLogin");
        // если пользователь не залогинен, но он идет на страницу логина - пропускаем

        if (isLogin == null && url.endsWith("/login")) {
            chain.doFilter(req, resp);
            return;

        }

        // если пользователь залогинен - пропускаем
        if (isLogin != null) {
            chain.doFilter(req, resp);
            return;
        }

        resp.sendRedirect("/login");

    }

    @Override
    public void destroy() {

    }
}
