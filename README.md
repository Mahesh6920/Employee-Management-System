## Employee Management System

Employee Management System is a backend web application developed using Java, JDBC, Servlets, JSP, and MySQL. The project is designed to manage employee records through database-driven operations and demonstrates core backend development concepts such as MVC architecture, database connectivity, request handling, and CRUD functionality.

### Features
- Add new employee records
- Store employee details in MySQL database
- Form handling using JSP and Servlets
- JDBC-based database integration
- Layered architecture using Controller, Service, DAO, and Utility classes
- Clean separation of business logic and database operations

### Technologies Used
- Java
- JDBC
- Servlets
- JSP
- MySQL
- Apache Tomcat
- Eclipse IDE

### Project Structure
```
src/
 ├── controller/
 ├── service/
 ├── dao/
 ├── dto/
 └── util/

WebContent/
 ├── index.jsp
 └── WEB-INF/
```

### Features

- Add new employee records
- View all employee records dynamically
- Store employee details in MySQL database
- Form handling using JSP and Servlets
- JDBC-based database integration
- Separate Servlets for inserting and viewing employee data
- Request forwarding and redirect handling
- Dynamic employee table rendering using JSP
- Clean separation of business logic and database operations

### Recent Updates

- Implemented employee list display below the form
- Added database-driven table rendering using JSP
- Implemented separate Add and View servlets
- Improved request flow using `sendRedirect()` and `forward()`
- Added dynamic fetching of employee records from MySQL
- Improved frontend UI using HTML and CSS
- Implemented MVC-based request handling
