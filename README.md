# Travel Lodge Hotel System
## Author - Malith Iddamalgoda (malith9595@gmail.com)

#Problem Statement

  - Travel Lodge is a hotel chain that has many hotels in United Kingdom. They have selected your company to build their hotel system. 
  In the SOW they have specified below functionality are needed for their application. 
  As Travel Lodge is an extremely popular hotel chain with more 100 hotels across the country system should be highly scalable as well 
  and expandable with more features coming in future.
  
# Solution

  - Travel lodge REST API is built via Spring Boot with java 1.8.
  - MVC Patter is used in this project.
  - In this project follwoing packages can be seen. model, controller, service and repository.
  - Service Represent business logic. Eg:- UserServiceImpl, BookingServiceImpl, PaymentServiceImpl and HotelServiceImpl.
  - Controller represent intermediary layer between model and view. Eg: UIController
  - REST controllers represnt the CRUD interface for the RESTfull API.
  - Repository reprent the DAO (data access object) layer. Eg:- UserRepository
  - Dependency Injection is used in this project via Spring @Autowired. Eg:- Injecting UserRepository as a dependecy userService.
  - Model represents the POJO (plain old java object). Eg:- Entity object /DTO (data transfer object) object.
  - Programing to the interface not to the implemantation design principal is used. Eg: using UserService interface rather UserServiceImpl
  - View represent the user interface Eg:- register.html, tymeleaf and Jquery is used.
  - MySQL is used as the SQL database. DB name: travel_db. Database username and password is setup in application.properties
  - This application will run on http://localhost:8080/api/register
  
 # Testing
 
  - JUnit is used for unit testing. Eg: UserControllerTest
  - Mokito is used to MOCK components.

