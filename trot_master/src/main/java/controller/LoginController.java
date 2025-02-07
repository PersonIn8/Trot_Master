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
            // 3. 로그인 성공 → 세션 저장
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setAttribute("username", user.getUsername()); // ✅ 세션에 사용자 이름 저장

            // ✅ 팝업 창을 닫고 부모 창(sessionStorage) 업데이트
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().println("<script>");
            response.getWriter().println("window.opener.sessionStorage.setItem('username', '" + user.getUsername() + "');"); // 🛑 추가
            response.getWriter().println("window.opener.sessionStorage.setItem('user', 'loggedIn');"); // 로그인 상태 저장
            response.getWriter().println("window.opener.updateNavBar();"); // 🛑 네비 업데이트 추가
            response.getWriter().println("window.close();"); 
            response.getWriter().println("</script>");
        } else {
            // 4. 로그인 실패 → 다시 로그인 페이지로 이동
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}