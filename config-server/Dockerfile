FROM openjdk:10-jre
ENV PORT 8888
EXPOSE ${PORT}
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
HEALTHCHECK CMD curl -f http://localhost:${PORT}/actuator/health || exit 1;