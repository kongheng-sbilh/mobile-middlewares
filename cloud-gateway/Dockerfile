FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} cloud_gateway.jar

ENTRYPOINT ["java", "-jar", "/cloud_gateway.jar"]

EXPOSE 9099