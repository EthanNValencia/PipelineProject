cd C:\Users\Ethan\eclipse-workspace\PipelineProject
mvn clean install
docker build -t my-pipeline-project.jar .
docker run my-pipeline-project.jar