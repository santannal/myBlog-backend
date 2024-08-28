# 📖 Blog Back-End

This repository contains the back-end code of a blog, developed with Java Spring Boot. The back-end is responsible for managing posts, comments, and email notifications.

## ✨ Overview

The back-end of this blog project is designed to provide a robust and scalable API that handles the core functionalities of the blog. It is developed using Java Spring Boot, with a focus on efficiency and ease of integration with the front-end.

## 🚀 Features

- **Post Management**: CRUD operations for creating, reading, updating, and deleting blog posts.
- **Comment Management**: CRUD operations for managing comments on posts.
- **Email Notifications**: Sends email notifications using `MailSender` for important actions like new comments or posts.
- **Testing**: Comprehensive unit and integration tests using `startertest`.
- **Developer Tools**: Integrated with `devtools` for enhanced development experience.

## 🛠️ Technologies and Dependencies

- **Java Spring Boot**: Core framework for building the back-end application.
- **MailSender**: Used for sending email notifications.
- **Spring Boot Devtools**: Provides tools to make development easier and faster.
- **Spring Boot Starter Web**: Simplifies the setup of the web layer, including RESTful APIs.
- **Spring Boot Starter Test**: Supports writing and running tests.

## 📂 Project Structure

The project follows a typical Spring Boot structure:

- `src/main/java`: Contains the main application code.
  - `resources`: Handles HTTP requests and responses.
  - `services`: Contains business logic.
  - `config`: mail server settings and CORS issues.
  - `models`: Defines the entities and data models used in the application.


