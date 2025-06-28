FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

RUN apt update && apt install tzdata -y
ENV TZ="America/Guayaquil"

COPY target/todolist-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]