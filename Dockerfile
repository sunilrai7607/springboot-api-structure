FROM openjdk:8-jdk-alpine
MAINTAINER Sunil Rai <sunilrai7607@gmail.com>
VOLUME /app
ARG version
ENV version_number=$version
COPY ./build/libs/springboot-api-structure-$version_number.jar springboot-api-structure.jar
ENTRYPOINT ["java", "-jar","/springboot-api-structure.jar"]