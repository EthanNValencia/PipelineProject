FROM openjdk:8
ADD target/my-pipeline-project.jar my-pipeline-project.jar
ENTRYPOINT ["java", "-jar","my-pipeline-project.jar"]
EXPOSE 8000