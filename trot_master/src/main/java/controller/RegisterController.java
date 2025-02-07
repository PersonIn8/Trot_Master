package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UserDAO;
import model.domain.UserDTO;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // 1. 사용자 입력 데이터 받기
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        // 2. UserDAO 객체 생성
        UserDAO userDAO = new UserDAO();

        // 3. 이메일 중복 확인
        if (userDAO.isEmailExist(email)) {
            response.sendRedirect("register_fail.jsp?error=email_exists");
            return;
        }

        // 4. UserDTO 객체 생성
        UserDTO user = new UserDTO(0, username, email, password, phone, null, null);

        // 5. 회원가입 시도
        boolean success = userDAO.registerUser(user);

        // 6. 회원가입 성공 여부 확인
        if (success) {
            response.sendRedirect("register_success.jsp");
        } else {
            response.sendRedirect("register_fail.jsp");
        }
    }
}
