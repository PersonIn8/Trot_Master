package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.SingerDAO;
import model.domain.SingerDTO;

@WebServlet("/SingerController")
public class SingerController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        int singerId = Integer.parseInt(request.getParameter("id"));

        // ✅ Singer 정보 가져오기
        SingerDTO singer = SingerDAO.getSingerById(singerId);

        // ✅ TotalPoint 내림차순 랭킹 가져오기
        List<String> topSingers = SingerDAO.getTopSingersByPoint();
        
        // ✅ JSON 변환
        Gson gson = new Gson();
        String json = gson.toJson(new SingerResponse(singer, topSingers));

        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
    }

    // JSON 응답용 내부 클래스
    class SingerResponse {
        SingerDTO singer;
        List<String> topSingers;

        public SingerResponse(SingerDTO singer, List<String> topSingers) {
            this.singer = singer;
            this.topSingers = topSingers;
        }
    }
}
