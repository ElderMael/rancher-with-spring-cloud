FROM lwieske/java-8

COPY build/libs/midtier-1.0.0.jar /app/app.jar

RUN ls /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
