FROM lwieske/java-8

COPY build/libs/config-1.0.0.jar /app/app.jar

RUN ls /app

EXPOSE 8080
EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/app.jar"]