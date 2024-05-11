## Angular & Spring Boot CRUD Application with Authentication (JWT)

This project is a CRUD (Create, Read, Update, Delete) application implemented with Angular for the frontend and Spring Boot for the backend. It includes user authentication using JWT (JSON Web Tokens) and integrates with MySQL database for data storage.

### Technologies Used

- **Frontend**:
  - Angular
  - Angular CLI
  - Bootstrap (for styling)
  - HttpClient (for API communication)

- **Backend**:
  - Spring Boot
  - Spring Security (for JWT authentication)
  - Spring Data JPA (for database interaction)
  - MySQL (database)

### Functionality & API Endpoints

1. **Authentication**:
   - `POST /auth/login`: Endpoint to authenticate users. Requires email and password in the request body. Returns a JWT token upon successful login.
   - `POST /auth/register`: Endpoint to register new users. Requires email and password in the request body. User details are stored in MySQL database.

2. **User Profile**:
   - `GET /auth/profile`: Endpoint to fetch the profile of the currently logged-in user. Requires JWT token for authentication.

3. **User Management**:
   - `GET /api/list-users`: Endpoint to fetch a paginated list of users. Defaults to 10 users per page.
   - `GET /api/show-user-profile/{id}`: Endpoint to fetch the profile of a specific user by ID.

4. **Post Management**:
   - `GET /post/posts`: Endpoint to fetch all posts. Defaults to showing 5 posts per page with pagination.
   - `POST /post/add-post`: Endpoint to create a new post. Requires JWT token for authentication and post content in the request body.

### Project Structure

- **Backend (Spring Boot)**:
  - `src/main/java`: Java source files
    - `com.achref.authpost`: Main application package
      - `auth`: Contains classes related to authentication functionality.
      - `config`: Houses configuration classes for application setup.
      - `post`: Includes classes for post or content management.
      - `security` : Holds security-related classes and configurations.
      - `user` : Contains classes related to user management and operations.
  - `src/main/resources`: Resource files (application.properties for database configuration)

- **Frontend (Angular)**:
  - `src/app`: Angular application components, services, and modules
    - `pages`: Contains components for login, registration, profile, user listing, post listing, etc.
    - `services`: Angular services to communicate with backend APIs using HttpClient
    - `modules`: TypeScript modules for data structures.


### Setup Instructions

#### Backend (Spring Boot)

1. **Clone the Repository**
   ```bash
   git clone https://github.com/achrefjlidi/auth-post-api/
   ```

2. **Configure MySQL Database**
   - Open `src/main/resources/application.properties`.
   - Update the database configuration:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. **Run the Spring Boot Application**
   - Navigate to the project directory:
     ```bash
     cd <project_directory>/back_end
     ```
   - Build and run the application:
     ```bash
     mvn spring-boot:run -Dserver.port=8083
     ```
   This will start your Spring Boot backend on port `8083`.

#### Frontend (Angular)

1. **Navigate to the Frontend Directory**
   ```bash
   cd <project_directory>/front_end
   ```

2. **Install Dependencies**
   ```bash
   npm install
   ```

3. **Run the Angular Application**
   ```bash
   ng serve --port 4200
   ```
   This will start your Angular frontend on port `4200`.

### Usage

1. **Access the Application**
   - Open your web browser and navigate to `http://localhost:4200` to access the Angular frontend.
   - Ensure the Spring Boot backend is running on `http://localhost:8083` for API communication.

2. **Authentication**
   - Register a new user or log in using existing credentials.
   - Upon successful authentication, you'll receive a JWT token.

3. **User Profile & Management**
   - View user profile details on the profile page.
   - Browse through the list of users and posts with pagination.

4. **Post Management**
   - Create new posts using the "Add Post" feature.

### Additional Notes

- Ensure that MySQL server is running and the database is accessible before starting the Spring Boot application.
- Customize the application as per your requirements, including frontend UI, backend logic, and database schema.
- Monitor the console logs for any errors or messages during application startup and operation.


### Contributors

- [Achref](https://github.com/achrefjlidi/)

Feel free to reach out for any questions or issues related to this project!
