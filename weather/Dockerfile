FROM gradle:4.7.0-jdk8-alpine AS build

ENV  NODE_ENV=production \
          DB_HOST=db\
          DB_PORT=5432\
          DB_USER=postgres\
          DB_PASSWORD=postgres\
          DB_NAME=weather\
          REDIS_HOST=cache\
          REDIS_PORT=6379\
          REDIS_PASSWORD=eYVX7EwVmmxKPCDmwMtyKVge8oLd2t81\

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:8-jre-slim

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]