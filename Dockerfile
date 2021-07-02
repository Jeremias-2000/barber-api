FROM openjdk:8-alpine

ADD target/Barber-api-0.0.1-SNAPSHOT.jar barber.jar

ENTRYPOINT ["java","-jar","barber.jar"]

EXPOSE 8080