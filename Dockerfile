FROM openjdk:17-jdk-slim

COPY target/project-management-be-0.0.1-SNAPSHOT.jar /my-api.jar

ENTRYPOINT ["java", "-jar", "my-api.jar"]