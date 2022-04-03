# Spring Boot example with Rest and GRPC 
This Spring Boot example implements both Rest and Grpc together. It usages the spring boot with maven.

### How to Run
- Get the code
    ```
    git clone git@github.com:yogeshprasad/springboot-rest-grpc.git
    ```
- Open project in intellij 
- Download the protobuf-java-util (3.19.3) form [here](https://jar-download.com/artifacts/com.google.protobuf/protobuf-java-util) and add to the project manually
    ```
    1. Open your installed IntelliJ IDEA Project and
    2. Go to the File > Project Structure
    3. Select Modules at the left panel and select the Dependencies tab.
    4. Select the + icon and select 1 JARs or Directories option.
    5. select your JAR file or you can select the directories.
    6. Click on the OK button
    ```
- Open terminal and change directory to springboot-rest-grpc
    ```
    cd springboot-rest-grpc
    ```
- Build the project
    ```
    mvn clean install
    ```
- Start the application
    ```
    java -jar target/grpc-server-0.0.1-SNAPSHOT.jar
    java -jar target/grpc-client-0.0.1-SNAPSHOT.jar
    ```
- Test the application by calling the API's
    ```
    curl http://localhost:8080/test_rest/compact
    curl http://localhost:8080/test_rest
    curl http://localhost:8080/test_grpc\?compact\=true
    curl http://localhost:8080/test_grpc
    ```
- Contribute to the project
  While using this project if you find any issue, open a Github issue against it or you can create a PR if you know the solution.
