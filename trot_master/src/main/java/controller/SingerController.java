package controller;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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

        String idParam = request.getParameter("id");
        if (idParam == null || idParam.isEmpty()) {
            System.out.println("❌ [ERROR] 요청된 id 값이 없음.");
            response.sendRedirect("error.jsp");
            return;
        }

        try {
            int singerId = Integer.parseInt(idParam);
            SingerDTO singer = SingerDAO.getSingerById(singerId);
            List<String> topSingers = SingerDAO.getTopSingersByPoint();

            if (singer == null) {
                System.out.println("❌ [ERROR] ID: " + singerId + "에 해당하는 가수 데이터 없음.");
                response.sendRedirect("error.jsp");
                return;
            }

            // ✅ 소셜 미디어 JSON을 Map<String, String>으로 변환
            String socialMediaJson = singer.getSocialMedia();
            Map<String, String> socialMediaMap = null;

            if (socialMediaJson != null && !socialMediaJson.isEmpty()) {
                try {
                    Gson gson = new Gson();
                    Type type = new TypeToken<Map<String, String>>() {}.getType();
                    socialMediaMap = gson.fromJson(socialMediaJson, type);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // ✅ JSP에서 사용 가능하도록 request에 저장
            request.setAttribute("singer", singer);
            request.setAttribute("topSingers", topSingers);
            request.setAttribute("socialMediaMap", socialMediaMap);

            // ✅ JSP로 포워딩
            request.getRequestDispatcher("Singer.jsp").forward(request, response);

        } catch (NumberFormatException e) {
            System.out.println("❌ [ERROR] 잘못된 숫자 형식의 ID: " + idParam);
            response.sendRedirect("error.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ [ERROR] 서버 오류 발생.");
            response.sendRedirect("error.jsp");
        }
    }
}
