FROM openjdk:10-jre
ENV PORT 8082
ARG JAR_FILE
ARG SERVER_CONTEXT_PATH
ENV CONTEXT_PATH ${SERVER_CONTEXT_PATH}
EXPOSE ${PORT}
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
HEALTHCHECK CMD curl -f http://localhost:${PORT}/${CONTEXT_PATH}/actuator/health || exit 1;