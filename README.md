* Add "Java application" run config, make com.demo.App as the start point.
* http://localhost:8080/
* Spring Boot initializer
    * Generate a spring boot web template: http://start.spring.io/
    * Command line: http://docs.spring.io/autorepo/docs/spring-boot/1.1.4.RELEASE/reference/html/getting-started-installing-spring-boot.html
    * Examples: https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples
* How does Spring Boot work?
    1. Java (main method entry point) ->
    
        ```
        public static void main(...)
        
        Starts java and then the application
        ```
        
    2. Spring application ->
        * Spring context
        * Spring environment
        * Initializer
        
        ```
        @SpringBootApplication: annotations for spring boot
        ```
        
    3. Embedded server
        * Default is tomcat
        * Auto configured
    
        ```
        SpringApplication.run(...); 
        
        Starts spring, creates spring context, applies annotations and sets up containers.
        ```

* Containerless(Embedded container) deployment: ./docs/containerless deployment.jpg