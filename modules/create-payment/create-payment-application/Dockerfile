# syntax=docker/dockerfile:1

FROM openjdk:17-alpine
LABEL maintainer="lucasgontijo0@gmail.com"

WORKDIR /app
COPY target/*.jar /app/app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
