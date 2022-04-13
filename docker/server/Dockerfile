FROM openjdk:11.0-jre
WORKDIR /
ADD grpc-server-0.0.1-SNAPSHOT.jar grpc-server-0.0.1-SNAPSHOT.jar
EXPOSE 8081
EXPOSE 6565
ENTRYPOINT ["java", "-jar", "grpc-server-0.0.1-SNAPSHOT.jar"]
