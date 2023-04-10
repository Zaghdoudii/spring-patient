FROM adoptopenjdk/openjdk17:alpine-jre
EXPOSE 8081
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java", "-jar", "devops-integration.jar"]
