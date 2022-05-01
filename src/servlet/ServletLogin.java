package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
//		获取表单中的name=username的内容
        String username = request.getParameter("username");
        String path = request.getContextPath();
//        使用seesion把刚才获取的username赋值给name发送到show.jsp
        request.getSession().setAttribute("name", username);
//        发送
        response.sendRedirect(path + "/index.jsp");
    }
}
