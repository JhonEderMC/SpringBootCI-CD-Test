# syntax=docker/dockerfile:1

FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.11_9

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
