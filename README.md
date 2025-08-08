Spring works on 2 fundamental principles:
1. Dependency Injection (DI) - Inject the objects into application
2. Inversion of control (IOC) - Invert the object creation responsibility to Spring and focus
on business logic.
3. Spring 6 and Spring Boot 3 will be used in this project

Any Object that is created or managed by Spring is called a Bean

In order to create an Object of a class we need to use ApplicationContext instance
getBean method and pass the class that we need. This is called Dependency Injection
The class need to be annotated with @Component to achieve this. Refer Alien.java
and it's usage in SpringBootDemoApplication.java

Autowiring - When one object is dependent on another object, spring can inject that
object if @Autowired is specified on the reference of the Class.
