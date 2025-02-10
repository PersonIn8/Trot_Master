package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.PostDAO;
import model.domain.PostDTO;
import util.DBUtil;

@WebServlet("/board")
public class PostController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String command = request.getParameter("command");
		if(command.equals("allList")) {
			Connection con = null;
	        try {
	            // 데이터베이스 연결 (데이터베이스 연결 객체 생성)
	            con = DBUtil.getConnection();
	            // PostDAO 객체 생성 및 게시글 목록 조회
	            PostDAO postDAO = new PostDAO(con);
	            List<PostDTO> list = postDAO.getAllPosts(); // 모든 게시글 조회
	            
	            // 결과를 request에 저장
	            request.setAttribute("list", list);

	            // list.jsp로 포워딩
	            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
	            dispatcher.forward(request, response);

	        } catch (SQLException e) {
	            e.printStackTrace();
	            // 오류 처리
	        } finally {
	            try {
	                if (con != null) {
	                    con.close();
	                }
	            } catch (SQLException e) {
	            	request.setAttribute("errorMsg", e.getMessage());
	    			request.getRequestDispatcher("error.jsp").forward(request, response);
	            }
	        }
		}
		else if(command.equals("view")) {
			Connection con = null;
			int postid=Integer.parseInt(request.getParameter("postid"));
	        try {
	            // 데이터베이스 연결 (데이터베이스 연결 객체 생성)
	            con = DBUtil.getConnection();
	            // PostDAO 객체 생성 및 게시글 목록 조회
	            PostDAO postDAO = new PostDAO(con);
	            PostDTO list = null;
				try {
					list = PostDAO.getContent(postid);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 특정
	            
	            // 결과를 request에 저장
	            request.setAttribute("list", list);

	            // read.jsp로 포워딩
	            RequestDispatcher dispatcher = request.getRequestDispatcher("read.jsp");
	            dispatcher.forward(request, response);

	        } catch (SQLException e) {
	            e.printStackTrace();
	            // 오류 처리
	        } finally {
	            try {
	                if (con != null) {
	                    con.close();
	                }
	            } catch (SQLException e) {
	            	request.setAttribute("errorMsg", e.getMessage());
	    			request.getRequestDispatcher("error.jsp").forward(request, response);
	            }
	        }
		}
		else if(command.equals("addList")) {
		    Connection con = null;
		    String title = request.getParameter("title");
		    String content = request.getParameter("content");
		    
		    // 세션에서 로그인된 사용자 정보 가져오기
		    HttpSession session = request.getSession();
		    String userId = (String) session.getAttribute("userId"); // 로그인된 사용자 ID

		    if (userId == null) {
		        // 로그인되지 않은 사용자 처리 (예: 로그인 페이지로 리다이렉트)
		        response.sendRedirect("login.jsp");
		        return;
		    }

		    try {
		        // 데이터베이스 연결 (데이터베이스 연결 객체 생성)
		        con = DBUtil.getConnection();

		        // PostDAO 객체 생성 및 게시글 등록
		        PostDAO postDAO = new PostDAO(con);
		        
		        // PostDTO 객체 생성하여 게시글 정보 설정
		        PostDTO postDTO = new PostDTO();
		        postDTO.setUserId(Integer.parseInt(userId));  // 로그인된 사용자 ID 설정
		        postDTO.setTitle(title);     // 게시글 제목 설정
		        postDTO.setContent(content); // 게시글 내용 설정
		        
		        // 게시글 등록 (DB에 삽입)
		        boolean addCk = postDAO.addPost(postDTO);
		        
		        // read.jsp로 포워딩
		        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
		        dispatcher.forward(request, response);
		        
		    } catch (SQLException e) {
		        e.printStackTrace();
		        // 오류 처리
		        request.setAttribute("errorMsg", e.getMessage());
		        request.getRequestDispatcher("error.jsp").forward(request, response);
		        
		    } finally {
		        try {
		            if (con != null) {
		                con.close();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}

	}	
}
