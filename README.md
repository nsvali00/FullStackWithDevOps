# Full-Stack Application – Spring Boot & React (TypeScript)

## 🎯 Project Goal
Build a modern full-stack web application using:
- **Spring Boot** as backend REST API
- **React (TypeScript)** as frontend client
- **Docker** and **Kubernetes** for containerization and deployment

The project demonstrates real-world full-stack concepts such as REST APIs, authentication, routing, containerization, and scalable deployment.

---

## 🧩 Tech Stack

### Backend
- Java 21+
- Spring Boot (Web, Data JPA, Security)
- JWT Authentication
- H2 / MySQL
- Maven

### Frontend
- React 18
- TypeScript
- Vite
- React Router
- Axios

### DevOps / Deployment
- Docker (frontend and backend containers)
- Docker Compose (local orchestration)
- Kubernetes (deployments and services)
- Optional: Minikube or cloud cluster

---

## 📁 Project Structure

root/\
├── backend/\
│ ├── src/main/java/...\
│ ├── src/main/resources/\
│ ├── pom.xml\
│ └── Dockerfile\
│\
├── frontend/   
│ ├── src/  
│ │ ├── pages/\
│ │ ├── components/\
│ │ ├── services/   
│ │ └── App.tsx \
│ ├── package.json\
│ └── Dockerfile \
│\
├── docker-compose.yml\
├── k8s/\
│ ├── backend-deployment.yaml\
│ └── frontend-deployment.yaml\
└── README.md\



<b>Daily Full-Stack Plan (2–3 weeks)</b>\
Week 1: Core Full-Stack Foundation

Day 1	Project setup & environment
- Install Java, Node.js, npm, Maven, Docker, kubectl
- Create Git repo
- Initialize Spring Boot backend project
- Initialize React + TypeScript frontend (Vite)\

Day 2	Backend basics
- Create Task entity
- Setup Spring Data JPA & repository
- Implement REST controller with GET endpoint
- Test with Postman or curl\
-
Day 3	Frontend basics
- Create React pages/components
- Setup React Router (/tasks page)
- Display dummy tasks list
- Ensure frontend runs via npm run dev\

Day 4	Backend CRUD
- Add POST, PUT, DELETE endpoints in Spring Boot
- Test all CRUD endpoints via Postman\

Day 5	Frontend CRUD integration
- Create Axios service for API calls
- Fetch tasks from backend
- Implement Add/Edit/Delete UI functionality\

Day 6	State management & props
- Learn React state & props
- Implement task completion toggle
- Handle dynamic updates in UI\

Day 7	Error handling & validation
- Backend: validate input and return proper HTTP errors
- Frontend: handle API errors and show notifications/snackbar

Week 2: Authentication + UI Improvements\
Day 8	JWT Authentication (Backend)
- Implement login endpoint
- Return JWT token
- Store password securely (BCrypt)

Day 9	JWT Authentication (Frontend)
- Create login form
- Store JWT in localStorage
- Axios interceptor to attach token to requests

Day 10	Protected routes & AuthGuard
- Implement PrivateRoute component
- Protect /tasks route

Day 11	UI improvements
- Add React modal for editing tasks
- Add loading states
- Style components with Tailwind or CSS

Day 12	Frontend + Backend integration testing
- Test CRUD with JWT authentication
- Test edge cases (invalid tokens, errors)

Day 13	Project cleanup
- Remove unused files
- Add README, comments, and documentation
- Commit & push to GitHub

Day 14	Buffer / catch-up	- Fix bugs, unanswered issues
- Review code, prepare for Docker

Week 3: Containerization & Deployment

Day 15	Docker: Backend	- Create backend Dockerfile
- Build & run backend container locally
- Test API via container

Day 16	Docker: Frontend
- Create frontend Dockerfile
- Build & run frontend container locally
- Test React app via container

Day 17	Docker Compose
- Write docker-compose.yml to run both containers together
- Verify full-stack works together

Day 18	Kubernetes: Backend
- Write deployment & service YAML for backend
- Deploy to Minikube or cluster
- Test pod and service

Day 19	Kubernetes: Frontend
- Write deployment & service YAML for frontend
- Deploy & verify frontend pod
- Test service connectivity

Day 20	Cluster integration
- Ensure frontend talks to backend using service name
- Test CRUD operations via Kubernetes cluster

Day 21	Final review & deployment
- Document steps in README
- Push images to Docker Hub
- Optionally deploy cluster