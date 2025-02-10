![header](https://capsule-render.vercel.app/api?type=waving&color=0:8A2BE2,100:00BFFF&height=220&section=header&text=🎶Trot_Master&fontSize=55&fontColor=E0FFFF&fontAlignY=40&desc=Feel%20the%20Music,%20Join%20the%20Fandom!&descSize=20&descAlignY=60)

# 🎤 Trot_Master 개발 문서

## 📑 목차  

1. [📌 프로젝트 소개](#-프로젝트-소개)  

2. [🎯 개발 목표](#-개발-목표)  

3. [👨‍👨‍👦‍👦 팀원 소개](#-팀원-소개)  

4. [🛠 기술 스택](#-기술-스택)  

5. [📚 프로젝트 디렉토리 구조](#-프로젝트-디렉토리-구조)  

6. [🏗 시스템 구조도](#-시스템-구조도)  

7. [🛰️ 서비스 흐름도](#-서비스-흐름도)  

8. [🛢 스키마 ](#-스키마)

8. [💻 주요 기능](#-주요-기능)  

9. [🔍 트러블 슈팅](#-트러블-슈팅)  

10. [📈 성능 목표](#-성능-목표)  

11. [🔒 보안 고려사항](#-보안-고려사항)  

12. [📝 기술적 회고](#-기술적-회고)  

13. [🚀 향후 개선 계획](#-향후-개선-계획)  

## 📌 프로젝트 소개  
트로트 팬덤을 위한 올인원 플랫폼으로, 50-60대 사용자를 위한 최적화된 UI/UX를 제공하는 웹/앱 서비스입니다.  

### 💻 주요 기능  
이 서비스는 트로트 팬을 위한 **팬 커뮤니티 & 굿즈 거래 플랫폼**으로, 팬들이 좋아하는 가수와 소통하고 관련 상품을 거래할 수 있는 기능을 제공합니다.  

1. **🎤 팬 커뮤니티**  
   - 가수별 팬클럽 운영 (게시판, 댓글, 좋아요 기능)  
   - 팬 활동 랭킹 시스템 (게시글 작성, 좋아요, 이벤트 참여 등)  

2. **🛍️ 트로트 굿즈 마켓**  
   - 공식 굿즈 판매 (소속사 및 제작사와 제휴)  
   - 팬 간 비공식 굿즈 거래 중개  
   - 굿즈 리뷰 및 평가 시스템  

3. **💖 팬덤 활동 & 서포트 기능**  
   - 가수 후원 프로젝트 (커피차, 밥차 지원)  
   - 팬 기부 및 후원 랭킹 시스템  

4. **🎫 공연 & 이벤트**  
   - 트로트 공연 및 팬미팅 일정 제공  
   - 티켓 예매 사이트 연동  
   - 이벤트 알림 기능  

5. **📢 소셜 미디어 & 팬 참여 콘텐츠**  
   - 가수별 SNS 계정 연동 (인스타그램, 유튜브, 페이스북 등)  
   - 트로트 관련 뉴스, 신곡 발매 정보 제공  
   - 사용자 맞춤형 추천 시스템 (팬 활동 기반)  

## 🎯 서비스 목표  
- 직관적이고 접근성 높은 UI/UX 구현  
- 실시간 사용자 인터랙션을 위한 고성능 백엔드 시스템 구축  
- 안정적인 트래픽 처리를 위한 확장 가능한 인프라 설계  
- 사용자 데이터 기반의 추천 시스템 구현


## 📈 기술적 목표  
이 프로젝트의 개발 목표는 **Servlet과 JSP를 활용하여 MVC 패턴을 연습하고, 세션 기반 로그인 및 인증 시스템을 구현**하는 것입니다.  

1. **🌐 웹 애플리케이션 기본 구조 구현**  
   - Servlet + JSP를 활용한 **MVC 패턴 적용**  
   - Frontend와 Backend 간 **데이터 바인딩 및 요청 처리**  

2. **🔑 로그인 & 회원 관리**  
   - **Session 기반 로그인 구현**  
   - 회원가입 및 프로필 관리 기능  
   - 로그인 상태 유지 및 접근 권한 관리  

3. **📊 데이터베이스 설계 & 연동**  
   - MySQL 또는 Oracle DB를 활용한 **가수, 팬, 게시글, 굿즈 거래 데이터 관리**  
   - DAO (Data Access Object) 패턴을 적용하여 **데이터 접근 로직 분리**  

4. **📩 RESTful API 연습**  
   - 가수 정보, 게시글, 랭킹 등의 데이터를 가져오는 **RESTful API 설계**  
   - JSON 형식의 데이터 처리 및 클라이언트와의 연동  

5. **📷 파일 업로드 및 이미지 관리**  
   - 가수 프로필 이미지 업로드  
   - 게시판 내 이미지 첨부 기능  

6. **🔍 검색 및 필터링 기능**  
   - 가수/게시글/굿즈 검색 기능 구현  
   - 정렬 및 필터링을 통한 최적화된 사용자 경험 제공  

7. **⚡ AJAX & JavaScript 활용**  
   - 로그인/회원가입 시 실시간 유효성 검사  
   - AJAX를 활용한 비동기 데이터 로딩  

8. **📢 소셜 미디어 연동 & 공유 기능**  
   - 가수의 소셜 미디어 계정 자동 연동  
   - SNS 공유 버튼을 통한 팬 활동 활성화  


##  **💥최종 목표**  
이 프로젝트를 통해 Servlet과 JSP를 활용한 **MVC 패턴 기반 웹 애플리케이션을 구축하는 경험을 쌓고**,  
추후 Spring Framework를 도입하여 **더 확장성 있는 백엔드 구조를 학습하는 기반**을 다지는 것입니다. 🚀🔥



## 👨‍👨‍👦‍👦 팀원 소개  
| <img src="https://github.com/wns5120.png" width="200px"> | <img src="https://github.com/JaeHee-devSpace.png" width="200px"> | <img src="https://github.com/andytjdqls.png" width="200px"> | <img src="https://github.com/wild-turkey.png" width="200px"> |
| :---: | :---: | :---: | :---: |
| [유호준](https://github.com/wns5120) | [박재희](https://github.com/JaeHee-devSpace) | [이성빈](https://github.com/andytjdqls) | [김지훈](https://github.com/wild-turkey) |

## 🛠 기술 스택  

![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white)
![JSP](https://img.shields.io/badge/JSP-007396?style=flat&logo=java&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)
![Servlet](https://img.shields.io/badge/Servlet-007396?style=flat&logo=java&logoColor=white)
![Oracle](https://img.shields.io/badge/Oracle-F80000?style=flat&logo=oracle&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white)
![Ubuntu](https://img.shields.io/badge/Ubuntu-E95420?style=flat&logo=ubuntu&logoColor=white)
![Visual Studio Code](https://img.shields.io/badge/VSCode-007ACC?style=flat&logo=visualstudiocode&logoColor=white)
![Spring Tool Suite](https://img.shields.io/badge/STS-6DB33F?style=flat&logo=spring&logoColor=white)
![DBeaver](https://img.shields.io/badge/DBeaver-372923?style=flat&logo=dbeaver&logoColor=white)
![VirtualBox](https://img.shields.io/badge/VirtualBox-183A61?style=flat&logo=virtualbox&logoColor=white)
![MobaXterm](https://img.shields.io/badge/MobaXterm-008FBA?style=flat&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)
![Notion](https://img.shields.io/badge/Notion-000000?style=flat&logo=notion&logoColor=white)
![Slack](https://img.shields.io/badge/Slack-4A154B?style=flat&logo=slack&logoColor=white)
![Markdown](https://img.shields.io/badge/Markdown-000000?style=flat&logo=markdown&logoColor=white)
![Mermaid](https://img.shields.io/badge/Mermaid-4995DA?style=flat&logo=mermaid&logoColor=white)
![ChatGPT](https://img.shields.io/badge/ChatGPT-412991?style=flat&logo=openai&logoColor=white)
![Claude](https://img.shields.io/badge/Claude-000000?style=flat&logo=anthropic&logoColor=white)
![Creatie](https://img.shields.io/badge/Creatie-6200EA?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABIUlEQVQ4T7XTvUoDQRjG8d+EoBCGxIb6ABqU7AQHkKvEH0AVoF6BQegKKLQExAF2giCfQoKoFiEr7GNIRgNQFPru9c6e3sXFcuMmdmffOnMnbzKdjCa1xG5UXnAjy7nFIMq+RVd59idDAS4u16kpAu4h7fMOFeBWM6uCYL8+XYBOc2eOYiHyQuFUbNwFkX9HgHHoNzqDxCz8D4RoqB2o5snC+xy+AF67dtdzBYzNErbVk+hGaNP8LZVK1TbBToG5EOM5UhbnNxAFWdpwpwD9xot+tsh70ix6r6cR+ayMCOZCbi7BxiL6rhcoJDrMctjJ8ZgEJ4ymB/H1oFlMByQnUtG9A0J62QqHX/ZYVwAAAABJRU5ErkJggg==&logoColor=white)


## 📚 프로젝트 디렉토리 구조  

(디렉토리 구조 설명 추가)  

## 🏗 시스템 구조도  
![alt text](/readme_image/System.png)

## 🛰️ 서비스 흐름도  
![alt text](/readme_image/Service.png)  


## 🛢 스키마  


## ⚠ 트러블 슈팅  

<details>
  <summary>📂 Singer.jsp 경로 문제</summary>

### ✅ **오류 상황**  
> `http://localhost:8080/trot_master/Singer.jsp?id=1` 접근 시 **"HTTP 상태 404 - 찾을 수 없음"** 오류 발생  

### ❌ **원인 분석**  
1. `Singer.jsp` 파일이 **경로에 존재하지 않거나, 파일명이 다를 가능성**  
2. 요청을 처리하는 `SingerController`에서 `request.getRequestDispatcher("Singer.jsp").forward(request, response);` 호출 시 **파일이 해당 위치에 없을 가능성**  
3. `web.xml` 또는 `@WebServlet` 설정에서 올바른 매핑이 되지 않았을 가능성  

### 🛠 **해결 방법**  
✅ `Singer.jsp` 파일이 `webapp` 디렉토리 아래에 존재하는지 확인  
✅ 파일명이 대소문자가 정확히 일치하는지 확인 (`singer.jsp` → `Singer.jsp` 오타 체크)  
✅ 컨트롤러에서 `request.getRequestDispatcher("/Singer.jsp").forward(request, response);` 와 같이 **절대 경로 사용**  
✅ Tomcat을 **클린 빌드 후 재배포**하여 변경 사항을 반영  

### ⚡ **적용 과정**  
1. 프로젝트 디렉토리 구조를 확인하여 `webapp/Singer.jsp` 파일이 존재하는지 확인  
2. `SingerController`에서 `getRequestDispatcher()` 메서드 호출 시 경로 수정  
3. Tomcat 서버 재시작 및 캐시 정리 후 테스트  

</details>

---

<details>
  <summary>📂 HTTP 요청 헤더 오류 해결</summary>

### ✅ **오류 상황**  
> `java.lang.IllegalArgumentException: 요청 타겟에서 유효하지 않은 문자가 발견되었습니다.`  

### ❌ **원인 분석**  
1. `openSingerProfile(singerId)` 함수에서 **URL에 잘못된 문자가 포함되었을 가능성**  
2. `Singer.jsp` 호출 시 `?id=1` 대신 잘못된 형식의 쿼리 문자열이 포함될 가능성  

### 🛠 **해결 방법**  
✅ `openSingerProfile(singerId)`에서 `Singer.jsp?id=1` 호출 시 **올바른 URL 인코딩** 적용  
✅ URL 호출 시 파라미터 값이 **숫자인지** 확인하고 `encodeURIComponent()` 사용  

### ⚡ **적용 과정**  
```javascript
function openSingerProfile(singerId) {
    let url = "Singer.jsp?id=" + encodeURIComponent(singerId);
    let popup = window.open(url, "SingerProfile", "width=800,height=600,scrollbars=yes");
    if (popup) popup.focus();
}
```
</details>

---

<details>
    <summary>📂 가수 랭킹 데이터 미출력 문제</summary>

### ✅ **오류 상황** 
> 'topSingers 데이터가 정상적으로 조회되지 않고 (⚠️ 데이터 없음) 메시지만 출력됨'

### ❌ **원인 분석**  
1. getTopSingersByPoint()에서 DB에서 데이터를 정상적으로 가져오지 못하는 경우<br>
2. request.setAttribute("topSingers", topSingers); 호출이 제대로 전달되지 않은 경우<br>
3. JSP에서 c:forEach를 사용하여 리스트를 순회할 때 null이거나 빈 리스트일 가능성

### **🛠 해결 방법**
✅ SingerDAO.getTopSingersByPoint()에서 쿼리 실행 여부 확인 <br>
✅ request.getAttribute("topSingers") 값이 JSP에서 올바르게 출력되는지 디버깅 <br>
✅ JSP에서 c:if test="${empty topSingers}" 조건을 추가하여 오류 출력

### ⚡ **적용 과정**  

1. DAO 디버깅 코드 추가
```java
List<String> singers = new ArrayList<>();
String query = "SELECT name, total_point FROM Singer ORDER BY total_point DESC";

try (Connection conn = DBUtil.getConnection();
     PreparedStatement pstmt = conn.prepareStatement(query);
     ResultSet rs = pstmt.executeQuery()) {

    while (rs.next()) {
        singers.add(rs.getString("name") + " - " + rs.getInt("total_point") + "점");
    }

    if (singers.isEmpty()) {
        System.out.println("⚠️ 데이터 없음 - 쿼리 결과 없음");
    } else {
        System.out.println("✅ 데이터 로드 성공: " + singers);
    }

} catch (Exception e) {
    e.printStackTrace();
}
```

JSP 디버깅 추가
```jsp
<c:choose>
    <c:when test="${empty topSingers}">
        <li>⚠️ 데이터 없음</li>
    </c:when>
    <c:otherwise>
        <c:forEach var="topSinger" items="${topSingers}">
            <li>${topSinger}</li>
        </c:forEach>
    </c:otherwise>
</c:choose>
```
</details>

---

<details> 
<summary>📂 소셜 미디어 정보 없음 문제</summary>

### ✅ **오류 상황**  
>singer.socialMedia 값이 DB에 저장되어 있음에도 "소셜 미디어 정보 없음"이 표시됨

### ❌ **원인 분석** 
1. singer.getSocialMedia()가 null이거나 빈 문자열인 경우 <br>
2. JSON 데이터가 String으로 저장되어 있어 JSP에서 Map<String, String> 형태로 변환되지 않은 경우 <br>
3. JSP에서 socialMediaMap을 처리할 때 EL (Expression Language)와 스크립틀릿(<% %>) 코드 혼용 문제 <br>

### 🛠 **해결 방법**  
✅ SingerController에서 Gson을 이용하여 JSON을 Map<String, String> 으로 변환하여 전달 <br>
✅ JSP에서 socialMediaMap을 올바르게 처리

### ⚡ **적용 과정**  
1. Controller에서 JSON을 변환하여 request에 저장
``` java
// 소셜 미디어 JSON을 Map<String, String>으로 변환
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
request.setAttribute("socialMediaMap", socialMediaMap);
```

2. JSP에서 올바르게 출력하도록 수정
```jsp
<p id="profile-social">📍 소셜 미디어:
    <c:choose>
        <c:when test="${empty socialMediaMap}">
            소셜 미디어 정보 없음
        </c:when>
        <c:otherwise>
            <c:forEach var="entry" items="${socialMediaMap}">
                <a href="${entry.value}" target="_blank">${entry.key}</a>
            </c:forEach>
        </c:otherwise>
    </c:choose>
</p>
```
</details>

## 🔒 보안 고려사항  

(보안 관련 설명 추가)  

## 🙂 프로젝트 회고  

(개발 과정에서의 회고 추가)  

## 🚀 향후 개선 계획  

(개선 계획 추가)  

![footer](https://capsule-render.vercel.app/api?type=waving&color=0:00BFFF,100:8A2BE2&height=180&section=footer)
