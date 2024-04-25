FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} external_partnership_service.jar

ENTRYPOINT ["java", "-jar", "/external_partnership_service.jar"]

EXPOSE 9020