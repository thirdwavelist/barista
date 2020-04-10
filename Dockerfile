FROM openjdk:11-jdk
VOLUME /tmp
RUN addgroup --system spring
RUN adduser --system spring --ingroup spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]