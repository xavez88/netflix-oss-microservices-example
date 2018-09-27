FROM openjdk:10-jre
ENV PORT 8081
ARG JAR_FILE
EXPOSE ${PORT}
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
HEALTHCHECK CMD curl -f http://localhost:${PORT}/actuator/health || exit 1;