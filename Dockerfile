FROM openjdk:8
ADD target/my-maven-docker-project.jar my-maven-docker-project.jar
ENTRYPOINT ["java", "-jar","my-pipeline-project.jar"]
EXPOSE 8000