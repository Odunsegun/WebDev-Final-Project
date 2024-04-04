Hotel Management
System
This repository includes a hotel management system that was constructed with
the help of a database, object-oriented programming (OOP) concepts, HTML,
CSS, and Spring Boot.
Features
● Administrators can add, edit, and remove users with various roles, including staff,
visitor, and administrator, using the user management feature.
● Room Management: Facilitates the addition of new rooms, the update of room
information, and the designating of rooms as either occupied or available.
● Reservation System: Offers features such as date selection, room type selection,
and guest count that let visitors book a room.
● Billing and Payments: computes bills according to accommodation rates and
other services rendered, and facilitates payment by visitors.
● Reporting: Produces data on revenue, occupancy rates, reviews from visitors, and
other pertinent indicators.
●
Technologies Used
● Spring Boot: Provides the backend framework for developing and managing the
application.
● HTML and CSS: Used for creating the user interface and styling the web pages.
● Object-Oriented Programming (OOP): Utilized for designing modular and
reusable code components.
● Database: Uses a database management system (DBMS) such as MySQL,
PostgreSQL, or H2 for storing application data.
Setup Instructions
Clone the repository to your local machine.
bash
Copy code
git clone
https://github.com/your-username/hotel-management-system.git
Configure the database settings in the application properties file
(application.properties or application.yml).
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_db
spring.datasource.username=db_username
spring.datasource.password=db_password
spring.jpa.hibernate.ddl-auto=update
Run the application using Maven or your preferred IDE.
arduino
Copy code
mvn spring-boot:run
Access the application in your web browser at http://localhost:8080.
Folder Structure
hotel-management-system/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com/
│ │ │ │ ├── example/
│ │ │ │ │ ├── controllers/ # Contains controllers for handling
HTTP requests
│ │ │ │ │ ├── models/ # Includes entity classes for database
mapping
│ │ │ │ │ ├── repositories/ # Repository interfaces for database
operations
│ │ │ │ │ ├── services/ # Business logic services
│ │ │ │ │ ├── HotelManagementSystemApplication.java # Main application
class
│ │ │ ├── resources/
│ │ │ │ ├── static/ # CSS, JavaScript, and image files
│ │ │ │ ├── templates/ # Thymeleaf HTML templates
│ │ │ │ ├── application.properties # Application configuration
│ ├── test/ # Contains unit and integration tests
│
├── README.md # Project documentation
├── pom.xml # Maven project configuration
└── .gitignore # Specifies files/folders to ignore in
Git
Contributors
● Your Name
● Contributor 1
● Contributor 2
Feel free to contribute to this project by forking the repository and creating pull requests
with your enhancements or bug fixes.
