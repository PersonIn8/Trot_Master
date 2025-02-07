package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.UserDAO;
import model.domain.UserDTO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // 1. 사용자가 입력한 데이터 가져오기
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // 2. DAO를 통해 로그인 검증
        UserDAO userDAO = new UserDAO();
        UserDTO user = userDAO.loginUser(email, password);

        if (user != null) {
            // 3. 로그인 성공 → 세션에 저장 후 메인 페이지로 이동
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("home.jsp"); // ✅ 로그인 후 이동할 페이지 (예: 메인 페이지)
        } else {
            // 4. 로그인 실패 → 다시 로그인 페이지로 이동
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}
