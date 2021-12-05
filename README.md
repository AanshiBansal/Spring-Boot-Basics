# Spring-Boot-Basics

#### Application Structure
![image](https://user-images.githubusercontent.com/44017133/144742360-2a3c9fb5-dc21-4b5d-af36-dc4379e2b778.png)

- API Layer: Controller
- Business Logic Layer: Service
- Data Access Layer: Repository
- Data Model: Entity

#### Version
- Java 11
- Maven 3.8.4
- PostgreSQL 14

#### Keyboard Shortcuts(Windows):
- To see defaults and parameter: Ctrl+P
- To clean imports: Ctrl+Alt+O
- To genertate constructors/getters/setters: Alt+Insert
- To create Methods: Alt+Enter

#### Deployement
- mvn clean install
- Find Jar file inside target folder
- java -jar .\demo-0.0.1-SNAPSHOT.jar --server.port=8080

Reference: https://www.youtube.com/playlist?list=PLq4tR7I6YYJFgCL_gQu520q-vu1u0Gf24


