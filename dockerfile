FROM adoptopenjdk/openjdk17:alpine-jre
EXPOSE 8081
ADD target/DevOps-automation.jar DevOps-automation.jar
ENTRYPOINT ["java", "-jar", "DevOps-automation.jar"]
