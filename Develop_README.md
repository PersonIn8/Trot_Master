![header](https://capsule-render.vercel.app/api?type=waving&color=0:8A2BE2,100:00BFFF&height=220&section=header&text=🎶Trot_Master&fontSize=55&fontColor=E0FFFF&fontAlignY=40&desc=Feel%20the%20Music,%20Join%20the%20Fandom!&descSize=20&descAlignY=60)

# 🎤 Trot_Master 개발 문서

## 📑 목차  


1. [📌 프로젝트 소개](#-프로젝트-소개)  

2. [🎯 서비스 목표](#-서비스-목표)  

3. [📈 기술적 목표](#-기술적-목표)  

4. [🛠 기술 스택](#-기술-스택)  

5. [📚 프로젝트 디렉토리 구조](#-프로젝트-디렉토리-구조)  

6. [🏗 시스템 구조도](#-시스템-구조도)  

7. [🛰️ 서비스 흐름도](#-서비스-흐름도)  

8. [🛢 스키마](#-스키마)  

9. [💻 주요 기능](#-주요-기능)  

10. [⚠ 트러블 슈팅](#-트러블-슈팅)  

11. [🔒 보안 고려사항](#-보안-고려사항)  

12. [🙂 프로젝트 회고](#-프로젝트-회고)  

13. [👨‍👨‍👦‍👦 팀원 소개](#-팀원-소개)  


## 📌 프로젝트 소개  
트로트 팬덤을 위한 올인원 플랫폼으로, 50-60대 사용자를 위한 최적화된 UI/UX를 제공하는 웹/앱 서비스입니다.  

## 🎯 서비스 목표  
- 직관적이고 접근성 높은 UI/UX 구현  
- 실시간 사용자 인터랙션을 위한 고성능 백엔드 시스템 구축  
- 안정적인 트래픽 처리를 위한 확장 가능한 인프라 설계  
- 사용자 데이터 기반의 추천 시스템 구현


## 📈 기술적 목표  
이 프로젝트의 개발 목표는 **Servlet과 JSP를 활용하여 MVC 패턴을 연습하고, 세션 기반 로그인 및 인증 시스템을 구현**하는 것입니다.  

<details>
    <summary>상세 기술 구현</summary>
    
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
</details>

##  **💥최종 목표**  
이 프로젝트를 통해 Servlet과 JSP를 활용한 **MVC 패턴 기반 웹 애플리케이션을 구축하는 경험을 쌓고**,  
추후 Spring Framework를 도입하여 **더 확장성 있는 백엔드 구조를 학습하기 위한 기반**을 다지는 것입니다.

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

```
trot_master
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   │   ├── LoginController.java
│   │   │   │   ├── LogoutController.java
│   │   │   │   ├── OrderController.java
│   │   │   │   ├── PointController.java
│   │   │   │   ├── PostController.java
│   │   │   │   ├── RegisterController.java
│   │   │   │   ├── SingerController.java
│   │   │   │
│   │   │   ├── model
│   │   │   │   ├── CalenderDAO.java
│   │   │   │   ├── CommentDAO.java
│   │   │   │   ├── GoodsDAO.java
│   │   │   │   ├── PointDAO.java
│   │   │   │   ├── PostDAO.java
│   │   │   │   ├── SingerDAO.java
│   │   │   │   ├── UserDAO.java
│   │   │   │
│   │   │   ├── model.domain
│   │   │   │   ├── CalenderDTO.java
│   │   │   │   ├── CommentDTO.java
│   │   │   │   ├── GoodsDTO.java
│   │   │   │   ├── PointDTO.java
│   │   │   │   ├── PostDTO.java
│   │   │   │   ├── SingerDTO.java
│   │   │   │   ├── UserDTO.java
│   │   │   │
│   │   │   ├── util
│   │   │   │   ├── DBUtil.java
│   │
│   │   ├── webapp
│   │   │   ├── assets
│   │   │   ├── images
│   │   │   ├── META-INF
│   │   │   ├── error.jsp
│   │   │   ├── goods_form.html
│   │   │   ├── index.html
│   │   │   ├── list.jsp
│   │   │   ├── login.jsp
│   │   │   ├── main.html
│   │   │   ├── read.jsp
│   │   │   ├── register_fail.jsp
│   │   │   ├── register_success.jsp
│   │   │   ├── register.jsp
│   │   │   ├── Singer.jsp
│   │   │   ├── UpcomingSchedules.jsp
│   │   │   ├── write.html
│   │   │   ├── 굿즈.html
│   │   │   ├── 콘서트.html
│
│── Deployment Descriptor: trot_master
│── Java Resources
```

## 🏗 시스템 구조도  
![alt text](/readme_image/System.png)

<details>
    <summary>Memaid 코드</summary>

```
graph LR;
    A([🖥️ Client]) -->|Request| B[[🔀 Apache Tomcat]]
    B -->|Handles Request| C[[🟠 Servlet]]
    C -->|Processes Data| D{{📌 Controller}}
    D -->|Calls| E[[📂 Service Layer]]
    E -->|Uses| F[📜 DTO]
    E -->|Uses| G[⚙️ Util]
    E -->|Interacts| H[[📂 DAO]]
    H -->|Fetches Data| I[(🗄️ Oracle Database)]

    subgraph Frontend
        A
    end

    subgraph Backend
        B
        C
        D
        E
        F
        G
        H
    end

    subgraph Database
        I
    end

    style A fill:#2E8B57,stroke:#000,stroke-width:2px,color:#FFFFFF;
    style B fill:#1E90FF,stroke:#000,stroke-width:2px,color:#FFFFFF;
    style C fill:#FFA500,stroke:#000,stroke-width:2px,color:#000000;
    style D fill:#FFD700,stroke:#000,stroke-width:2px,color:#000000;
    style E fill:#DC143C,stroke:#000,stroke-width:2px,color:#FFFFFF;
    style F fill:#8A2BE2,stroke:#000,stroke-width:2px,color:#FFFFFF;
    style G fill:#654321,stroke:#000,stroke-width:2px,color:#FFFFFF;
    style H fill:#4169E1,stroke:#000,stroke-width:2px,color:#FFFFFF;
    style I fill:#8B4513,stroke:#000,stroke-width:2px,color:#FFFFFF;
```
</details>

## 🛰️ 서비스 흐름도  
![alt text](/readme_image/Service.png)  

<details>
    <summary>Memaid 코드</summary>

```
graph TD;
    A["사용자"] -->|"회원가입 / 로그인"| B["🏠 메인 화면 - 트로트 가수 선택"];

    %% 🎤 팬 활동
    subgraph C["🎤 팬 활동"]
        C1["🎭 팬 커뮤니티"] -->|"게시글 작성"| C2["📝 게시판"];
    end
    
    %% 🛍️ 거래 시스템
    subgraph D["🛍️ 거래 시스템"]
        D1["🎁 굿즈 마켓"] -->|"상품 등록 / 거래"| D2["💳 거래 시스템"];
    end

    %% 💖 후원 시스템
    subgraph E["💖 후원 시스템"]
        E1["🌟 후원 프로젝트"] -->|"포인트 결제"| E2["💰 결제 시스템"];
    end
    
    %% 🎫 공연 & 이벤트
    subgraph F["🎫 공연 & 이벤트"]
        F1["🎵 공연 일정 & 예매"] -->|"티켓 예매"| F2["🎟️ 예매 시스템"];
    end
    
    %% 메인 화면에서 각 시스템으로 연결 (서브그래프 전체에 연결)
    B --> C;
    B --> D;
    B --> E;
    B --> F;

    %% 💡 스타일 적용 (전체 테두리 색상을 파란색으로 변경)
    style A fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style B fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style C fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style D fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style E fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style F fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style C1 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style C2 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style D1 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style D2 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style E1 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style E2 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style F1 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;
    style F2 fill:#ffffff,stroke:#1E90FF,stroke-width:2px;

    %% 💡 화살표 스타일 조정 (글자를 가리지 않도록 곡선 적용)
    linkStyle 0,1,2,3 stroke:#1E90FF,stroke-width:2px,curve:basis;
```
</details>

## 🛢 스키마  

**Oracle DB**를 활용하여 **가수, 팬, 게시글, 굿즈 거래 데이터**를 저장하고 관리합니다.  

- **User**: 사용자 정보 관리  
- **Singer**: 가수 프로필 및 활동 정보  
- **Point**: 팬 활동 포인트 시스템  
- **Post**: 팬 커뮤니티 게시글  
- **Comment**: 게시글 댓글  
- **Calendar**: 가수 일정 및 이벤트  
- **Goods**: 트로트 굿즈 및 거래 정보 

<details>
    <summary> 🚟 Table 구조</summary>

### 1. **User (사용자 정보)**

| 컬럼명 | 데이터 타입 | 설명 |
| --- | --- | --- |
| user_id | INT | 사용자 고유 ID (Primary Key) |
| username | VARCHAR(100) | 사용자 이름 |
| email | VARCHAR(100) | 이메일 |
| password | VARCHAR(255) | 비밀번호 |
| phone | VARCHAR(15) | 전화번호 |
| created_at | TIMESTAMP | 계정 생성 일시 |
| updated_at | TIMESTAMP | 계정 정보 마지막 수정 일시 |

![alt text](/readme_image/USERS.png)  

### 2. **Singer (가수 정보)**

| 컬럼명 | 데이터 타입 | 설명 |
| --- | --- | --- |
| singer_id | INT | 가수 고유 ID (Primary Key) |
| name | VARCHAR(100) | 가수 이름 |
| debut_date | DATE | 데뷔 일자 |
| social_media | TEXT | SNS 링크 등 (JSON 형태로 저장 가능) |
| created_at | TIMESTAMP | 정보 등록 일시 |
| updated_at | TIMESTAMP | 정보 수정 일시 |
| total_point | INT | 가수 총합 활동 포인트 |
| birth_date | DATE | 생년월일 |
| image_url | VARCHAR(500) | 가수 프로필 이미지 URL |

![alt text](/readme_image/SINGER.png)  

### 2-1. Point - 활동 포인트 테이블

| 컬럼명 | 데이터 타입 | 설명 |
| --- | --- | --- |
| activity_id | INT | 활동 고유 ID (Primary Key) |
| user_id | INT | 사용자 고유 ID  |
| singer_id | INT | 가수 고유 ID  |
| point | INT | 활동 포인트  |
| created_at | TIMESTAMP | 정보 등록 일시 |

![alt text](/readme_image/POINT.png)

### 3. **Post (게시판 - 팬클럽 & 콘서트)**

| 컬럼명 | 데이터 타입 | 설명 |
| --- | --- | --- |
| post_id | INT | 게시글 고유 ID (Primary Key) |
| singer_id | INT | 가수 ID (Foreign Key) |
| user_id | INT | 사용자 ID (Foreign Key)  |
| title | VARCHAR(200) | 게시글 제목 |
| content | TEXT | 게시글 내용 |
| created_at | TIMESTAMP | 게시글 작성 일시 |
| updated_at | TIMESTAMP | 게시글 수정 일시 |

![alt text](/readme_image/POST.png)

### 4. **Comment (게시판 댓글)**

| 컬럼명 | 데이터 타입 | 설명 |
| --- | --- | --- |
| comment_id | INT | 댓글 고유 ID (Primary Key) |
| post_id | INT | 게시글 ID (Foreign Key) |
| user_id | INT | 댓글 작성자 ID (Foreign Key) |
| content | TEXT | 댓글 내용 |
| created_at | TIMESTAMP | 댓글 작성 일시 |
| updated_at | TIMESTAMP | 댓글 수정 일시 |

![alt text](/readme_image/COMMENTS.png)

### 5. **Calendar (가수 일정 정보)**

| 컬럼명 | 데이터 타입 | 설명 |
| --- | --- | --- |
| schedule_id | INT | 일정 고유 ID (Primary Key) |
| singer_id | INT | 가수 ID (Foreign Key) |
| event_title | VARCHAR(200) | 일정 제목 |
| event_date | DATE | 일정 날짜 |
| event_time | TIME | 일정 시간 |
| event_type | VARCHAR(100) | 일정 유형 (팬미팅, 콘서트 등) |
| location | VARCHAR(255) | 일정 장소 |
| created_at | TIMESTAMP | 일정 등록 일시 |
| updated_at | TIMESTAMP | 일정 수정 일시 |

![alt text](/readme_image/CALENDAR.png)

### 6. **Goods (굿즈 정보)**

| 컬럼명 | 데이터 타입 | 설명 |
| --- | --- | --- |
| goods_id | INT | 굿즈 고유 ID (Primary Key) |
| singer_id | INT | 가수 ID (Foreign Key) |
| name | VARCHAR(100) | 굿즈 이름 |
| description | TEXT | 굿즈 설명 |
| price | DECIMAL(10, 2) | 가격 |
| stock_qty | INT | 재고 수량 |
| goods_type | VARCHAR(3) | 공식/비공식 타입 |
| created_at | TIMESTAMP | 굿즈 등록 일시 |
| updated_at | TIMESTAMP | 굿즈 수정 일시 |

![alt text](/readme_image/GOODS.png)


</details>

## 💻 주요 기능  
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

| 문제 | 위험 수준 | 해결 방법 | 적용 여부 |
|------|---------|------------|------------|
| **비밀번호 해싱 미적용** | 🔴 Critical | `BCrypt` 사용하여 해싱 | ❌ 미적용 |
| **SQL Injection** | 🟠 High | `PreparedStatement` 사용 + 입력 검증 추가 | ✅ 적용됨 |
| **입력값 검증 부족** | 🟠 High | Whitelist Validation 적용 (이메일, 패스워드 검증) | ❌ 미적용 |
| **세션 고정 공격** | 🟠 High | 로그인 후 세션 무효화 및 재생성 (`session.invalidate();`) | ❌ 미적용 |
| **XSS 공격 가능성** | 🟡 Medium | `HTML Escape`, `CSP` 적용 | ❌ 미적용 |
| **CSRF 공격 가능성** | 🟡 Medium | CSRF Token 사용 및 Referer 검증 | ❌ 미적용 |
| **오류 메시지 정보 노출** | 🟢 Low | 에러 메시지 일반화 (`?error=email_exists` → `?error=general`) | ❌ 미적용 |
| **로그인 실패 시 동일한 메시지 출력 필요** | 🟢 Low | "이메일 또는 비밀번호가 잘못되었습니다."로 통일 | ❌ 미적용 |

<details>
    <summary> ▶ 상세보기 </summary>

### **🔴 1. 비밀번호 해싱 미적용 (Critical)**
📌 **문제:**  
- `UserDAO.java`에서 **비밀번호가 평문(Plain Text)으로 저장**되고 있음.  
- `loginUser()`에서 비밀번호 비교 시에도 `password = ?` 형태로 직접 비교함.  

📌 **해결 방법:**  
✅ **BCrypt 해싱 적용 (Spring Security 사용 가능)**  
```java
import org.mindrot.jbcrypt.BCrypt;

// 비밀번호 해싱하여 저장
String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
```
- 회원가입 시 **해싱된 비밀번호** 저장  
- 로그인 시 입력한 비밀번호를 `BCrypt.checkpw()`로 검증  

---

### **🟠 2. SQL Injection 취약점**
📌 **문제:**  
- SQL 쿼리 실행 시, `PreparedStatement`를 사용하지만 일부 입력값 검증이 부족함.  
- 예를 들어, `loginUser(String email, String password)`에서 **입력값이 직접 바인딩되면 SQL Injection 위험** 존재.  

📌 **해결 방법:**  
✅ **입력값 검증 강화 및 SQL Parameterized Query 사용**  
```java
String sql = "SELECT user_id, username FROM Users WHERE email = ? AND password = ?";
```
- 현재 `PreparedStatement`를 사용하고 있어서 기본적인 보호는 되지만,  
  **비밀번호 해싱이 미적용된 상태라면 공격자가 해싱되지 않은 비밀번호를 SQL Injection으로 테스트할 가능성이 있음.**  

✅ **Whitelist 기반 입력 검증**  
- `email` 필드에 SQL 예약어 (`' OR 1=1 --` 같은 패턴) 검증 추가 필요.  
```java
if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
    throw new IllegalArgumentException("Invalid email format");
}
```

---

### **🟠 3. 세션 고정(Session Fixation) 가능성**
📌 **문제:**  
- 로그인 성공 후 **기존 세션을 유지한 채 사용자 정보를 저장**  
- 공격자가 로그인 전 세션을 생성한 후 피해자가 사용하면 세션을 가로챌 가능성 있음.  

📌 **해결 방법:**  
✅ **로그인 성공 후 세션 무효화 및 재생성**  
```java
HttpSession oldSession = request.getSession(false);
if (oldSession != null) {
    oldSession.invalidate(); // 기존 세션 제거
}
HttpSession newSession = request.getSession(true); // 새로운 세션 생성
```
- 로그인 성공 후 **새로운 세션을 생성**하고 **기존 세션을 무효화**해야 함.  

✅ **세션 ID 보안 강화**  
- `HttpOnly`, `Secure`, `SameSite=strict` 옵션을 활성화해 **세션 탈취를 방어**  
```java
session.setAttribute("user", user);
session.setMaxInactiveInterval(1800); // 30분 유지
response.setHeader("Set-Cookie", "JSESSIONID=" + session.getId() + "; HttpOnly; Secure; SameSite=Strict");
```

---

### **🟡 4. XSS (Cross-Site Scripting) 가능성**
📌 **문제:**  
- `register_fail.jsp`, `login.jsp?error=invalid` 같은 곳에서 **입력값이 직접 출력될 가능성이 있음.**  
- 예를 들어,  
  ```jsp
  <p><%= request.getParameter("error") %></p>
  ```
  **이런 코드가 있으면 `error=<script>alert('XSS')</script>` 공격 가능**  

📌 **해결 방법:**  
✅ **출력 시 HTML Escape 적용**  
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="errorMsg" class="org.apache.commons.text.StringEscapeUtils" />
<p><%= errorMsg.escapeHtml(request.getParameter("error")) %></p>
```
✅ **CSP (Content Security Policy) 적용**  
- 웹서버에서 `Content-Security-Policy` 헤더 설정  
```java
response.setHeader("Content-Security-Policy", "default-src 'self'");
```
- **현재 CSP 적용이 안 되어 있어서 보안이 취약함.**  

---

### **🟡 5. CSRF (Cross-Site Request Forgery) 취약점**
📌 **문제:**  
- `LogoutController`에서 `doPost()` 방식 사용하지만, CSRF 방어 없음  
- CSRF 공격으로 인해 사용자가 **의도치 않게 로그아웃되거나 계정이 변경될 가능성** 존재  
- **Referer 검증이 없어서 공격자가 CSRF 요청을 보낼 수 있음**  

📌 **해결 방법:**  
✅ **CSRF Token 적용 (Hidden Form Field 사용)**  
```jsp
<input type="hidden" name="csrf_token" value="<%= session.getAttribute(\"csrf_token\") %>">
```
✅ **Referer 검증 추가**  
```java
String referer = request.getHeader("Referer");
if (referer == null || !referer.startsWith("https://yourdomain.com")) {
    response.sendError(HttpServletResponse.SC_FORBIDDEN);
    return;
}
```
- **현재 Referer 검증이 빠져 있어 공격에 취약함.**  

---

### **🟢 6. 오류 메시지 정보 노출 (정보 노출 위험)**
📌 **문제:**  
- `register_fail.jsp?error=email_exists` 같은 URL이 그대로 노출됨  
- 공격자는 `?error=email_exists`, `?error=invalid_password` 등을 테스트하며 계정 존재 여부를 알아낼 수 있음.  

📌 **해결 방법:**  
✅ **에러 메시지 일반화**  
```java
response.sendRedirect("register_fail.jsp?error=general");
```
✅ **로그인 실패 시 동일한 메시지 출력**  
```jsp
<p>이메일 또는 비밀번호가 잘못되었습니다.</p>
```
- **현재는 로그인 실패 시 특정한 메시지를 노출하지만, 이를 일반적인 메시지로 변경해야 함.**  

</details>

## 🙂 프로젝트 회고  

- JSP와 MVC 패턴을 활용하여 웹사이트를 개발하면서, 다양한 기술을 유기적으로 연계하는 경험을 할 수 있어 의미 있는 프로젝트였다. <br>
- 데이터베이스(DB), HTML, Java, JSP 등 여러 요소를 조합하여 하나의 웹사이트를 완성하는 과정은 쉽지 않았지만, 전반적인 웹 개발 흐름을 이해하는 데 큰 도움이 되었다. <br>

- 가장 어려웠던 점은 다수의 데이터베이스 테이블과 여러 개의 페이지가 서로 영향을 주지 않도록 관리하는 것이었다. 또한, 4명이 협업하면서 Git을 활용해 여러 파일을 동시에 수정하다 보니, 충돌(conflict) 문제가 빈번하게 발생했다. 이를 해결하기 위해 코드 작성 전후로 커밋 및 브랜치 전략을 명확히 수립하고, 정기적인 코드 리뷰와 소통을 강화하는 등의 노력을 기울였다. <br>

- 이번 프로젝트를 통해 웹 애플리케이션 개발 과정 전반을 경험하고, 협업 과정에서의 문제 해결 능력을 키울 수 있었다는 점에서 큰 의미가 있었다.<br>

- 목표를 처음부터 크게 잡아서 구현할 수 있는 시간이 부족하여, 기능 중 몇몇은 구현하지 못하였다.<br>

## 👨‍👨‍👦‍👦 팀원 소개  
| <img src="https://github.com/wns5120.png" width="200px"> | <img src="https://github.com/JaeHee-devSpace.png" width="200px"> | <img src="https://github.com/andytjdqls.png" width="200px"> | <img src="https://github.com/wild-turkey.png" width="200px"> |
| :---: | :---: | :---: | :---: |
| [유호준](https://github.com/wns5120) | [박재희](https://github.com/JaeHee-devSpace) | [이성빈](https://github.com/andytjdqls) | [김지훈](https://github.com/wild-turkey) |


![footer](https://capsule-render.vercel.app/api?type=waving&color=0:00BFFF,100:8A2BE2&height=180&section=footer)
