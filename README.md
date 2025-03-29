# 📌Post Manager App

A full-stack web application built with **Java Spring Boot** (backend) and **Next.js** (frontend).  
The application allows users to create and view posts with authentication.

---

## Features
- Create posts with `title`, `body`, and `auth code`.  
- Display all existing posts on the homepage.  
- Authentication using `PinggyAuthHeader`.  
- Real-time fetching of posts on page load.  
- Modern and responsive UI.

---

## Technologies Used
- **Backend:** Java Spring Boot, Maven  
- **Frontend:** Next.js, Axios  
- **Styling:** CSS  

---

## API Endpoints

### POST /post
- **Description:** Creates a new post.  
- **Request Body:**
\`\`\`json
{
  "title": "Post Title",
  "body": "Post Body"
}
\`\`\`
- **Headers:** 
\`\`\`json
{
  "PinggyAuthHeader": "your_auth_code"
}
\`\`\`
- **Response:**
\`\`\`json
{
  "message": "Post Saved Successfully"
}
\`\`\`

---

### GET /list
- **Description:** Fetches all posts.  
- **Headers:** 
\`\`\`json
{
  "PinggyAuthHeader": "your_auth_code"
}
\`\`\`
- **Response:**
\`\`\`json
[
    {
        "title": "Post 1",
        "body": "Post body",
        "authHeader": "your_auth_code"
    }
]
\`\`\`

---

## Instructions to Run the Application

### Backend
1. Navigate to the backend folder:
\ cd backend

2. Build and run the Spring Boot server:
\ mvn clean install
\ mvn spring-boot:run
- The backend will run on \`http://localhost:8080/`.

---

### Frontend
1. Navigate to the frontend folder:
\ cd frontend

2. Install dependencies:
\ npm install

3. Start the Next.js app
\ npm run dev
- The frontend will run on \`http://localhost:3000\`.

---

## Important Decisions Made
1. **Authentication:** Added the \`PinggyAuthHeader\` to ensure only authorized users can access the API.  
2. **CORS Configuration:** Added CORS rules in the backend to allow requests from the frontend.  
3. **Error Handling:** Included proper error handling with relevant messages and HTTP status codes.  

---


