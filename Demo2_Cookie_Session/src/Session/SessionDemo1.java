package Session;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session
        HttpSession session = req.getSession();
        //储存session
        session.setAttribute("msg","hello");

        Cookie cookie = new Cookie("JSESSIONID",session.getId());
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
    }
}
