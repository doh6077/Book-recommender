# 📘 Book Recommender – Project Progress

A microservice-based application that allows users to get AI-powered book recommendations and save them to a personal collection.

---

## ✅ What’s Been Implemented

### 🔹 1. Book API Service (User Service)
- Built using Spring Boot
- Connects to a local PostgreSQL database
- Allows saving book information using JPA
- API endpoint(s) to:
  - Save book details
  - Retrieve saved books (if implemented)

### 🔹 2. Recommendation Service (OpenAI Integration)
- Built as a separate Spring Boot microservice
- Accepts user input as a prompt (e.g. genre, interests)
- Sends requests to the OpenAI API (`gpt-3.5-turbo`)
- Returns generated book recommendations to the frontend or consumer

---

## 🚧 What Needs to Be Done Next

### 🔸 Backend
- [ ] Implement Firebase Admin SDK to validate user tokens in both services
- [ ] Link saved book records to Firebase UID
- [ ] Add GET endpoint to retrieve user's saved books
- [ ] Format OpenAI responses into a clean structure (title, author, summary)

### 🔸 Frontend (Angular)
- [ ] Set up Angular project with routing and Bootstrap
- [ ] Implement Firebase Authentication (email/password)
- [ ] Build UI for:
  - [ ] Asking for book recommendations
  - [ ] Displaying OpenAI-generated results
  - [ ] Saving a book to the backend
  - [ ] Viewing saved book list


---

## 📦 Microservices Summary

| Service                  | Description                                      |
|--------------------------|--------------------------------------------------|
| `book-recommendation-service` | Handles OpenAI API interaction for book suggestions |
| `user-favorite-service`       | Stores and retrieves user book data (PostgreSQL)      |

---

## 🌱 Future Enhancements
- [ ] Add tags or genres to books
- [ ] Allow users to rate or comment on saved books
- [ ] Deploy frontend (Firebase Hosting) and backend (Render/Railway)

---
